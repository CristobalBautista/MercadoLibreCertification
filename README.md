# MercadoLibre Certification

In this repository, it is implemented the automated test for the [MercadoLibre web page](https://www.mercadolibre.com/).<br>
MercadoLibre is a company that operates online marketplaces dedicated to e-commerce and online auctions.

## Test Description

The Gherkin language was used to write the test scenarios for an user who wants to:
* Selects a country.
* Searches a product.
* Selects a product and the quantity.
* Buy it and go to the registration page.

To generate the automated scripts for the previous scenarios, the next tools were used:
- Screenplay pattern
- Serenity BDD framework 
- Cucumber and Selenium test tools 
- JAVA language

To import and use the necessary libraries for the project, a GRADLE project was created in the Eclipse IDE.

Exception handling for some events was implemented, such as the webpage not loading or an element of the webpage not showing.

## How to use it

Clone the project into the Eclipse IDE using the steps described in the next link: [Clone Github project into Eclipse](https://github.com/collab-uniba/socialcde4eclipse/wiki/How-to-import-a-GitHub-project-into-Eclipse)

Download the Binary-Only file from the [Gradle install page](https://gradle.org/install/#manually) and follow the instructions indicated.

Go to the project page and type cmd in the search box. This will open your **Command Prompt**, where you will execute the next commands to run the test scenarios and generate your report:
* gradle clean // Deletes the build directory
* gradle clearHistory // Deletes the Serenity history directory
* gradle test // Runs the unit tests
* gradle aggregate // Aggregates the test outcomes to the Serenity reports
* cd reports // Enters the report folder
* index.html // Opens the test report
