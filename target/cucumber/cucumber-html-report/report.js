$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/SearchCruise.feature");
formatter.feature({
  "line": 1,
  "name": "Search Cruises",
  "description": "",
  "id": "search-cruises",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2445275684,
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
  "duration": 9777931602,
  "status": "passed"
});
formatter.match({
  "location": "SearchCruiseSteps.chooseSearchCriteria()"
});
formatter.result({
  "duration": 8218483503,
  "status": "passed"
});
formatter.match({
  "location": "SearchCruiseSteps.checkResults()"
});
formatter.result({
  "duration": 187949637,
  "status": "passed"
});
formatter.match({
  "location": "SearchCruiseSteps.checkFilter()"
});
formatter.result({
  "duration": 8431827976,
  "status": "passed"
});
formatter.match({
  "location": "SearchCruiseSteps.checkOrder()"
});
formatter.result({
  "duration": 14019386,
  "error_message": "java.lang.AssertionError: Order option not found!\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat carnival.prjoject.ZemogaPrueba.SearchCruiseSteps.checkOrder(SearchCruiseSteps.java:117)\n\tat ✽.And its possible order by price(src/test/resources/features/SearchCruise.feature:7)\n",
  "status": "failed"
});
formatter.after({
  "duration": 323339768,
  "status": "passed"
});
formatter.before({
  "duration": 1647763209,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "As an user I want to  see more info about a cruise",
  "description": "",
  "id": "search-cruises;as-an-user-i-want-to--see-more-info-about-a-cruise",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I am on carnival main page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Choose a type of cruises to search",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Choose an especific cruise option",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "itinerary page is opened",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "its possible read each day on page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "button BOOK NOW is present on page",
  "keyword": "And "
});
formatter.match({
  "location": "SearchCruiseSteps.goToMainPage()"
});
formatter.result({
  "duration": 4425327868,
  "status": "passed"
});
formatter.match({
  "location": "SearchCruiseSteps.chooseSearchCriteria()"
});
formatter.result({
  "duration": 12054811520,
  "status": "passed"
});
formatter.match({
  "location": "SearchCruiseSteps.chooseACruise()"
});
formatter.result({
  "duration": 7413088453,
  "status": "passed"
});
formatter.match({
  "location": "SearchCruiseSteps.pageloaded()"
});
formatter.result({
  "duration": 8888616,
  "status": "passed"
});
formatter.match({
  "location": "SearchCruiseSteps.readDay()"
});
formatter.result({
  "duration": 138975049,
  "status": "passed"
});
formatter.match({
  "location": "SearchCruiseSteps.buttonBookNow()"
});
formatter.result({
  "duration": 22265351,
  "status": "passed"
});
formatter.after({
  "duration": 281446534,
  "status": "passed"
});
});