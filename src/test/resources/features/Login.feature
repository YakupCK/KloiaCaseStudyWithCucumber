Feature: Login feature

  @ChromeProfile @wip @google
  Scenario: Task-3: Login with Google account
    Given I'm on the home page
    When I log in with my Google account
    Then I should be logged in

    When I go to "https://www.bestbuy.com" opening a new tab
    Then I should be logged in on the newly opened tab as well
    And I log out

  @ChromeProfile @wip
  Scenario: Task-2: Login with valid credentials
    Given I'm on the home page
    When I log in with following credentials hitting Enter key
      | username | suhaill732@xvlinjury.com |
      | password | one plus one is two      |
    Then I should be logged in
    And I log out



  # Task-2
  # ● Navigate to https://www.bestbuy.com
  # ● Go to Sign In page
  # ● Fill login form with a valid email address and a password
  # ● Login with Enter button (Behaviour of Enter key should be executed with Selenium)
  # ● Verify successful login

  #  Task-3
  #  ● Navigate to https://www.bestbuy.com
  #  ● Sign in with Google
  #  ● Verify successful login
  #  ● Open new tab
  #  ● Navigate to https://www.bestbuy.com
  #  ● Verify user logged in on the newly opened tab
