$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/SearchCruise.feature");
formatter.feature({
  "line": 1,
  "name": "Search Cruises",
  "description": "",
  "id": "search-cruises",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2630453253,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "As an user I want to search a cruise from bahamas with duration between",
  "description": "",
  "id": "search-cruises;as-an-user-i-want-to-search-a-cruise-from-bahamas-with-duration-between",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I am on carnival main page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Choose a type of cruises to search",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "A set of results are visible",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "its possible filter by price",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "its possible order by price",
  "keyword": "And "
});
formatter.match({
  "location": "SearchCruiseSteps.goToMainPage()"
});
formatter.result({
  "duration": 7969014515,
  "status": "passed"
});
formatter.match({
  "location": "SearchCruiseSteps.chooseSearchCriteria()"
});
formatter.result({
  "duration": 18947013724,
  "status": "passed"
});
formatter.match({
  "location": "SearchCruiseSteps.checkResults()"
});
formatter.result({
  "duration": 220979323,
  "status": "passed"
});
formatter.match({
  "location": "SearchCruiseSteps.checkFilter()"
});
formatter.result({
  "duration": 8407605277,
  "status": "passed"
});
formatter.match({
  "location": "SearchCruiseSteps.checkOrder()"
});
formatter.result({
  "duration": 17316818,
  "error_message": "java.lang.AssertionError: Order option not found!\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat carnival.prjoject.ZemogaPrueba.SearchCruiseSteps.checkOrder(SearchCruiseSteps.java:117)\n\tat ✽.And its possible order by price(src/test/resources/features/SearchCruise.feature:7)\n",
  "status": "failed"
});
formatter.after({
  "duration": 413231637,
  "status": "passed"
});
});