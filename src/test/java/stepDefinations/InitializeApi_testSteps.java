package stepDefinations;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import Utils.RequestBody;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class InitializeApi_testSteps {
	
	private static String token;
	
	@Before
	public void authorization() {
		
		RequestSpecification res=given().spec(Utils.SpecBuilder.authReq());
		Response response=res.when().post("/chatak-tms-services/secure/oauth/token").
		then().spec(Utils.SpecBuilder.resspec()).extract().response();
		String reponseS=response.asString();
		
		 token=Utils.JsonExtractor.jsonExt(reponseS, "access_token");
		 
		 System.out.println(">>>>>>>>Access_Token>>>>>>>>>"+token);
		
		
	}
	
	
	@Given("device info is available")
	public void device_info_is_available() {
		RequestSpecification res=given().log().all().spec(Utils.SpecBuilder.initReq());
		res.when().post("/chatak-tms-services/tms/rest/tposInitialize/v2.0")
		.then().log().all().spec(Utils.SpecBuilder.resspec()).extract().response();
	    
	}

	@When("i add device info to server")
	public void i_add_device_info_to_server() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Test");
	}

	@Then("Information added")
	public void information_added() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Test");
	}


}
