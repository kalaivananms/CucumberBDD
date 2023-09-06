Feature: This is to test google search
Scenario: Google Search scenario
Given User is entering google.co.in
When user is typing the search term "kalaivanan MS"
And  enter the return key 
Then the user should see the search results 


