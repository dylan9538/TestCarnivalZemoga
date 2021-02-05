# TestCarnivalZemoga


## Structure
You will find a Basic Maven Project.
This contains:
- A package with one steps java class and one runner java class 
- A folder with a feature file

Also you will find a target folder that contains a cucumber reports.

## Run
To run the test you need to go to Runner Class an execute it as a junit test.

There will be two scenarios, one is about User Story 1 and the other is about User Story 2.

## Reports
If you want a html report you need to be on project folfer and then run the follow command from terminal after all test execution:

```
mvn verify -DskipTests
```

This generate a folder with the name **cucumber-JVM-reports** that contains a better report in a html format.

Check it!
