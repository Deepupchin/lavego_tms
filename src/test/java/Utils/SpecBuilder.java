package Utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.logging.LoggingMXBean;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class SpecBuilder {
	

	
	/* 
	 * RequestSpecification method for authentication request 
	 */
	public static RequestSpecification authReq()  {
		
		
		
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
	public static RequestSpecification initReq() throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintStream log=new PrintStream(new FileOutputStream("logging.text"));
		
		RequestSpecification initRequest=(RequestSpecification) new RequestSpecBuilder().setBaseUri("http://192.168.2.78:8070")
				.addFilter(RequestLoggingFilter.logRequestTo(log))
				.addFilter(ResponseLoggingFilter.logResponseTo(log))
				.setContentType(ContentType.JSON).setBody(Utils.RequestBody.intialise_RequestBody())
								.addQueryParam("grant_type", "client_credentials").build();
		return initRequest;
	}

}
