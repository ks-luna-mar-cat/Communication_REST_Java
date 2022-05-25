package kateson.testsample;

/**
 * MainController class that controls the entire execution order.
 *
 * @author  Kate Son
 * @version 05/08/2018
 */

public class MainController {
	
	public static void main(String[] args){
	
		String result = RestClient.Communicate();	//communicate via rest endpoint
		System.out.println("Return Data : "+result);	//show returned Json data in string
		ParseMain.converter(result);	//convert Json data to Java object

	}
}
