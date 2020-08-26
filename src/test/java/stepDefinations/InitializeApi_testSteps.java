package stepDefinations;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import java.io.FileNotFoundException;

import Utils.RequestBody;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class InitializeApi_testSteps {

	private static String token;
	static String reponseS;
	RequestSpecification res;

	@Before
	public void authorization() {

		RequestSpecification res = given().spec(Utils.SpecBuilder.authReq());
		Response response = res.when().post("/chatak-tms-services/secure/oauth/token").then()
				.spec(Utils.SpecBuilder.resspec()).extract().response();
		reponseS = response.asString();
	}

	@Given("i am authorized user")
	public void i_am_authorized_user() {
		token = Utils.JsonExtractor.jsonExt(reponseS, "access_token");
		System.out.println(">>>>>>>>Access_Token>>>>>>>>> " + token);
	}

	@When("i add device info to server")
	public void i_add_device_info_to_server() throws FileNotFoundException {
		 res = given().log().all().spec(Utils.SpecBuilder.initReq()).header("Authorization",
				"Bearer " + token);
		res.when().post("/chatak-tms-services/tms/rest/tposInitialize/v2.0").then().log().all()
				.spec(Utils.SpecBuilder.resspec()).extract().response();
		
	}

	@Then("Information added")
	public void information_added() {
		
//		String InitialResponse_body=res.toString();
//		
//		// validate responseMessage from response body
//	
//		String responseMessage=Utils.JsonExtractor.jsonExt(InitialResponse_body, "responseMessage");
//		Assert.assertEquals("No Updates Available", responseMessage);
//		System.out.println(">>>>>>>>>>>>>>>>>>>>"+responseMessage);
		
		System.out.println("Test");
	}

}
