package com.rest;

import java.io.File;

import org.junit.Test;

import com.responseBody.CreateFlight_Res;
import com.responseBody.Data;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class RestAssuredTest {

	@Test
	public void method() {

		Pojo p = new Pojo("AirIndia", "India", "87", "https://www.google.com/");

		RequestSpecification given = RestAssured.given();

		RequestSpecification requestSpecification = given.header("content-type", "application/json");

		RequestSpecification when = requestSpecification.body(p).when();

		Response post = when.post("https://omrbranch.com/api/flights");

		post.prettyPrint();
//		JsonPath jsonPath = post.jsonPath();
//		String object = jsonPath.get("message");
//		String object2 = jsonPath.get("data.flightName");

		
		CreateFlight_Res d = new CreateFlight_Res();
		CreateFlight_Res as = post.as(d.getClass());
		
		System.out.println(as.getData().getCreated_date());
			
		Assert.assertEquals("Flight Created Successfully", as.getMessage());

		System.out.println(post.getStatusCode());

	}

}
