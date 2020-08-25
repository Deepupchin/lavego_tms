package stepDefinations;

import static io.restassured.RestAssured.given;

import io.cucumber.java.Before;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Hooks {
	
	

	@Before()
	public void authrization() {
		
//		RequestSpecification res=given().spec(Utils.SpecBuilder.authReq());
//		Response response=res.when().post("/chatak-tms-services/secure/oauth/token").
//		then().spec(Utils.SpecBuilder.resspec()).extract().response();
//		String reponseS=response.asString();
//		
//		 String token=Utils.JsonExtractor.jsonExt(reponseS, "access_token");
//		
//		System.out.println(">>>>>>>>Access_Token>>>>>>>>>"+token);
		
		


		
		
	
	
		
	}
	
	
}
