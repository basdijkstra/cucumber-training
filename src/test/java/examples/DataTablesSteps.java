package examples;

import cucumber.api.java.en.*;
import java.util.*;

public class DataTablesSteps {

    @Given("I have the following authors")
    public void i_have_the_following_authors(List<Map<String, String>> authors) {
        System.out.println(authors.toString());
    }

    @Given("the following airports are known in the database")
    public void the_following_airports_are_known_in_the_database(Map<String, String> airports) {
        for(Map.Entry<String,String> airport : airports.entrySet()) {
            System.out.println(String.format("%s has airport code %s", airport.getValue(), airport.getKey()));
        }
    }

    @Given("the following past Old Firm results")
    public void the_following_past_old_firm_results(Map<Integer, Map<String, Integer>> pastResults) {
        for(Map.Entry<Integer, Map<String, Integer>> result : pastResults.entrySet()) {
            System.out.println(
                String.format(
                    "The final score in the %d Old Firm was Celtic %d, Rangers %d",
                    result.getKey(),
                    result.getValue().get("Celtic"),
                    result.getValue().get("Rangers")
                )
            );
        }
    }

}
