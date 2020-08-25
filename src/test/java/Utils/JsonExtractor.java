package Utils;

import io.restassured.path.json.JsonPath;

public class JsonExtractor {
	
	public  static String jsonExt(String response,String response_attribute) {
   	 
 		JsonPath js=new JsonPath(response);
 		return js.getString(response_attribute);
 		
     }

}
