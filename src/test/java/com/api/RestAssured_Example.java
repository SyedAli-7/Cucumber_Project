package com.api;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssured_Example {
	
public static void main(String[] args) {
	
	RestAssured.baseURI ="https://reqres.in/";
	
	RequestSpecification req = RestAssured.given();
	
	Response res = req.get("/api/users?page=2");
	
	String asString = res.asString();
	
	System.out.println("Response Body :" +asString);
	
	int statusCode = res.getStatusCode();
	
	System.out.println("Status code :" +statusCode);
	
	Assert.assertEquals(statusCode, 200);
	
	System.out.println("Validation Successful");
	
	
	
	
}	

}
