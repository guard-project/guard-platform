#!/bin/#!/bin/bash

user=guard-project
repo=guard-platform
gh api repos/$user/$repo/actions/runs \
    --paginate -q '.workflow_runs[] | "\(.id)"' | \
    xargs -I % gh api repos/$user/$repo/actions/runs/% -X DELETE
