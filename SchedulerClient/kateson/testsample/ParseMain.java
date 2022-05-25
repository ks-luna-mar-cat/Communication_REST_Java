package kateson.testsample;

/**
 * MainController class that controls the entire execution order.
 *
 * @author  Kate Son
 * @version 05/08/2018
 */

import com.google.gson.Gson;;
//import com.fasterxml.jackson.core.JsonParser;

public class ParseMain {
	
    /**
     * Convert Json data to Java object
     * @param s
     */
	public static void converter(String s){

		Gson gson = new Gson();
		Result result = gson.fromJson(s, Result.class);
		
	}
}
