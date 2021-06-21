
Scenario: 1. Verify searching product
Given I navigated to url = 'https://www.asos.com/women/'
When I clicked on searching bar
And I entered 'Scirt' and clicked ENTER
Then banner should contains 'Your search results for:'"Scirt"''


Scenario: 2. Verify Sign In failed
Given I navigated to url = 'https://www.asos.com/women/'
When I navigated to My Account
And I set 'test.com' into EMAIL ADDRESS field
And I set '46c_JFdVhH!R3tS' into PASSWORD field
And I click on SIGN IN button
Then My Account Item became filled


