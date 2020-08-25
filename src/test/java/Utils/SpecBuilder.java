package Utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class SpecBuilder {
	
	
	
	/* 
	 * RequestSpecification method for authentication request 
	 */
	public static RequestSpecification authReq() {
		// TODO Auto-generated method stub
		RequestSpecification authRequest=(RequestSpecification) new RequestSpecBuilder().setBaseUri("http://192.168.2.78:8070")
				.setContentType(ContentType.JSON)
				.addHeader("Authorization","Basic Q2hhdGFrV2FsbGV0QmFzaWNBdXRoOkNoYXRha1dhbGxldEBTZWN1cmU=")
				.addQueryParam("grant_type", "client_credentials").build();
		return authRequest;
	}
	
	
	public static ResponseSpecification resspec() {
		ResponseSpecification resSpec= new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		return resSpec;
	}
	
	/*
	 *  RequestSpecification method for initialize request 
	 */
	public static RequestSpecification initReq() {
		// TODO Auto-generated method stub
		RequestSpecification initRequest=(RequestSpecification) new RequestSpecBuilder().setBaseUri("http://192.168.2.78:8070")
				.setContentType(ContentType.JSON).setBody(Utils.RequestBody.intialise_RequestBody())
								.addQueryParam("grant_type", "client_credentials").build();
		return initRequest;
	}

}
