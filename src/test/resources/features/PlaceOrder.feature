Feature: User wants to placean order

Scenario: Search Item
Given User is on Home Page
When User should an Item
Then Item must be listed

Scenario: Add Item to Cart
Given Item must be listed
When User Add item
Then Item should be added to cart