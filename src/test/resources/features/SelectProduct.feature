Feature: Select a product feature

  @ChromeProfile @wip
  Scenario: Task-4: Filter the results by Philips and Save an item
    Given I'm on the home page
    And I go to following modules in below order:
      | Menu                |
      | Audio               |
      | Headphones          |
      | Wireless Headphones |
    When I filter the brands by "Philips"
    And I select "Philips" from Brand filtered results
    And I click on "2"th product on the search result page
    And I click Save button on product detail page
    Then The product name should exist on the saved item list



  # Task-4
  # ● Navigate to https://www.bestbuy.com
  # ● Click Wireless Headphones at Menu/Audio/Headphones (Do not use URL navigation)
  # ● Filter Brands by Philips and select Philips from Brand filtered results
  # ● Click 2nd product on the search result page (Locator of the product should be
  #   dynamic, should not be specifically defined for the 2nd product)
  # ● Click Save button on product detail page
  # ● Open Saved Items list
  # ● Verify that the title of saved product is on the list