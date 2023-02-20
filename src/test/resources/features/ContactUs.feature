Feature: WebDriver University - ContactUs Page

  Scenario: Validate Successful Submission
    Given I access webdriver university contact us page
    When I enter a first name
    And I enter a last name
    And I enter an email address
    And I enter a commment
    And I click on the submit button
    Then I should be presented with a successful contact us submission message
