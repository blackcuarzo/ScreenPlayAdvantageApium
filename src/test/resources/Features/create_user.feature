Feature: successfully create users
  Me as course automation
  I need to create users
  To validate that users are successfully created

  Scenario Outline: create an user successfully
    Given I want to go to the page of Advantage Demo
    When I enter the information to create the user
      | userName   | email   | password   | confirmPassword   | firstName   |lastName| phoneNumber   | country   | state   | address   | city   | zip   |
      | <userName> | <email> | <password> | <confirmPassword> | <firstName> |<lastName> |<phoneNumber> | <country> | <state> | <address> | <city> | <zip> |

    Then I validate the correct user was created

    Examples:
      | userName   | email                | password     | confirmPassword | firstName |lastName | phoneNumber | country  | state     | address  | city     | zip    |
      | daniel1242 | daniel1245@gmail.com | 8917261ssaA$ | 8917261ssaA$    | Daniel    | Cano| 2662517     | Colombia | Antioquia | cll 8 76 | Medellin | 050010 |
