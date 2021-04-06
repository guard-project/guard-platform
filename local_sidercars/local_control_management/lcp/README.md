# LCP (Local Control Policies)

[![License](https://img.shields.io/github/license/guard-project/lcp)](https://github.com/guard-project/lcp/blob/master/LICENSE)
[![Code size](https://img.shields.io/github/languages/code-size/guard-project/lcp?color=red&logo=github)](https://github.com/guard-project/lcp)
[![Repository Size](https://img.shields.io/github/repo-size/guard-project/lcp?color=red&logo=github)](https://github.com/guard-project/lcp)
[![Release](https://img.shields.io/github/v/tag/guard-project/lcp?label=release&logo=github)](https://github.com/guard-project/lcp/releases)
[![Docker image](https://img.shields.io/docker/image-size/guardproject/lcp?label=image&logo=docker)](https://hub.docker.com/repository/docker/guardproject/lcp)
[![Docs](https://readthedocs.org/projects/guard-lcp/badge/?version=latest)](https://guard-lcp.readthedocs.io)

## Contents

- [LCP (Local Control Policies)](#lcp-local-control-policies)
  - [Contents](#contents)
  - [Installation Steps](#installation-steps)
    - [Setup](#setup)
    - [Requirements](#requirements)
    - [Initialization](#initialization)
    - [Start](#start)
    - [Stop](#stop)
    - [Health](#health)
  - [Docker image](#docker-image)
    - [Build](#build)
    - [Run](#run)

The source code is available in the [src](github.com/guard-project/lcp) directory as git sub-module.

## Installation Steps

### Setup

The variables are defined in [scripts/vars](scripts/vars) and in the .env file depending on the chosen version (variable `VERSION` in the table).

Name                 | Default value                                                         | Meaning
---------------------|-----------------------------------------------------------------------|--------
COMPONENT            | lcp                                                                   | Component name
VERSION              | master                                                                | Component version
PROJECT              | guard                                                                | Project name
INSTALLATION_PATH    | /opt/lcp                                                              | Destination path where the software will be installed
TMP_PATH             | /tmp                                                                  | Temporary dictionary path
PIDFILE              | `$TMP`/`$COMPONENT`.pid                                               | File path where the PID of the current execution is stored

### Requirements

Enter into the `scripts` directory.

```console
$ cd scripts
```

### Initialization

```console
$ ./init
```

### Start

```console
$ ./start
```

### Stop

```console
$ ./stop
```

### Health

Check if the software is running or not.

```console
$ ./health
```

## Docker image

[Dockerfile](Dockerfile) is used to build the `docker` image with CI in the [https://hub.docker.com/repository/docker/guardproject/lcp](https://hub.docker.com/repository/docker/guardproject/lcp).

### Build

You can build the image with tag guardproject/lcp:`$VERSION`.
`$VERSION` is the specific version to build the image.

```console
$ docker build . -t guardproject/lcp:$VERSION
```

Example:

```console
$ VERSION=master
$ docker build . -t guardproject/lcp:$VERSION
```

### Run

In addition, it is possible to run the image in a container specifying the environment variable using the specific .env file for the chosen version.

```console
$ docker run --env-file settings/$VERSION/.env --name lcp.$VERSION guardproject/lcp:$VERSION
```

Example:

```console
$ VERSION=master
$ docker run --env-file settings/$VERSION/.env --name lcp.$VERSION guardproject/lcp:$VERSION
```