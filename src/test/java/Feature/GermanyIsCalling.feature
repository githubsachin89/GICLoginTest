Feature: feature to Test the GermanyIsCalling website

  Scenario: Test Loginpage Funtionality of Website
    Given user open a url in "chrome" browser
    When User Enter "gaikwadsachin.989@gmail.com" and "Sachin@1234"
    Then User Click on Login button
    And User is naviagated to the HomePage
    Then User Close the Browser Window

  Scenario Outline: Test Loginpage Funtionality of Website
    Given user open a url in "chrome" browser
    When User Enter "<username>" and "<password>"
    Then User Clicked on Login button
    And User Validate the Error Message
    Then User Quit the Browser Window

    Examples: 
      | username                | password |
      | %^&                     | _+&      |
      |                         |          |
      | sachingaikwad@gmail.com | sg@1234  |
