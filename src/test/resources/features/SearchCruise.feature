Feature: Search Cruises
Scenario: As an user I want to search a cruise from bahamas with duration between
Given I am on carnival main page
When Choose a type of cruises to search
Then A set of results are visible   
And its possible filter by price 
And its possible order by price

Scenario: As an user I want to  see more info about a cruise
Given I am on carnival main page
When Choose a type of cruises to search
And Choose an especific cruise option 
Then itinerary page is opened
And its possible read each day on page
And button BOOK NOW is present on page