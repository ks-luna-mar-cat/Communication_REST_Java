package kateson.testsample;

/**
 * MainController class that controls the entire execution order.
 *
 * @author  Kate Son
 * @version 05/08/2018
 */

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Instant;
import org.apache.commons.io.IOUtils;

public class RestClient {
	
	public static void main(String[] args) {
			RestClient.Communicate();
	}

    /**
     * Convert Json data to Java object
     * @return String
     */
	public static String Communicate() {
		
		   long now = Instant.now().toEpochMilli();	//current data/time in milliseconds since the epoch
		   String endpoint = "https://www.testtesttest.com/test-api/schedule";	//rest endpoint (not real URL-can not expose real URL)
		   String json = "{\"serviceLineIds\": [\"e675e4e7-978a-4c89-ad09-63b30965821f\"],   \"latLong\": \"(45.5235,-122.676)\",   \"duration\": 15,      \"orderedLabId\": \"\",   \"page\": 1,  \"scheduleDate\":" + now + ",   \"allClinics\": false }"; //POST body to send
		   String result = "";
		   
           try { 
        	   
           // connect and send request
           URL url = new URL(endpoint);
           HttpURLConnection conn = (HttpURLConnection) url.openConnection();
           conn.setConnectTimeout(5000);
           conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
           conn.setDoOutput(true);
           conn.setDoInput(true);
           conn.setRequestMethod("POST");

           OutputStream os = conn.getOutputStream();
           os.write(json.getBytes("UTF-8"));
           os.close(); 

           // read the response
           InputStream in = new BufferedInputStream(conn.getInputStream());
           result = IOUtils.toString(in, "UTF-8");
          
           // connection close
           in.close();
           conn.disconnect();
                      
           } catch (Exception e) {
   			System.out.println(e);
   		}
		return result;   
	}	
}
