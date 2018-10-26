#Author: dcristobalbautista@hotmail.com
Feature: Mercado Libre Search
  I want to search some products in the MercadoLibre page

  @Search
  Scenario Outline: Mercado Libre product search
    Given that Diego wants some products from Mercado Libre in "<country>"
    When he searches for the "<product>"
    And he chooses the product "<number>" from the displayed list
    And he select the "<quantity>" to proceeds to the shopping car
    Then he should see a notification asking to enter into his account

    Examples: 
      | country  | product    | number | quantity |
      | Colombia | Samsung J9 |     30 |        2 |
      | Colombia | Bolsos     |     50 |        1 |
