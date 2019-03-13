Feature: To check if paytm app is opening.


Scenario: Open paytm app successfully.
Given chrome driver is assigned to open the url
When  the url is hit on browser
Then the url should open successfully

Scenario Outline: able to book choose source and destination
Given the url should open successfully
When we click on bus 
And enter source as <source> and destination as <dest> 
And click on search button
Then should be able to get options of bus
And print error message and navigate back to home page.


Examples:
|source|dest|
|goa|mumbai|


Scenario: click on links in footer section
Given go to the footer section of the page and click on the links
When the links are clicked 
Then to be opened in seperate tabs 
And get the title of each page
