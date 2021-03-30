# Smart Controller

This is a Drools Rule Engine and is created as a maven project using Intellij IDEA. A sample Drools rule is located in folder 'rules'. More rules can be added there.

### How to run
Run SpringBootDroolsApp
 

### Test with postman 
Once Smart Controller is deployed, postman can be used in order to send a policy.

post http://localhost:8080/getVulnerabilityMeasurementPolicy
Content-Type:application/json

Body
````
{
    "component":"testComponent",
    "staticScanPath":"staticPath",
    "dynamicScanURL":"dynamicURL",
    "scanningFrequency":"frequency"
}
````

The response, for now, is the policy itself.