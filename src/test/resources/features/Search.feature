#      Task-1
#    ● Navigate to https://www.bestbuy.com
#    ● Verify page title is Best Buy | Official Online Store | Shop Now & Save
#    ● Maximize window
#    ● Search for Drone
#    ● Verify search results are listed for Drone

  Feature: Search functionality
    Scenario: Task-1: Search for Drone
      Given I'm on the home page
      And page title is "Best Buy | Official Online Store | Shop Now & Save"
      When I search for "Drone"
      Then Search results should be listed for "Drone"