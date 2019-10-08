package exercises;

import cucumber.api.java.en.Given;

import java.util.List;
import java.util.Map;

public class DataTablesSteps {

    @Given("the following accounts exist")
    public void the_following_accounts_exist() {

        // TODO: specify the correct data table format as a parameter to the step definition method
        // TODO: iterate over the entries in the data table and print the string
        //   '<full name> logs in with username <username> and password <password>'
        //   for every entry in the table
    }

    @Given("the following currencies are available")
    public void the_following_currencies_are_available() {

        // TODO: specify the correct data table format as a parameter to the step definition method
        // TODO: iterate over the key-value pairs in the data table and print the string
        //   '<currencyCode> is the currency code for <currencyName>'
        //   for every entry in the table
    }
}
