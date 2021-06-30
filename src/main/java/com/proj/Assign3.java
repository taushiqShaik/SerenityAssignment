package com.proj;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.proj.model.RegisterClass;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class Assign3 extends RegisterClass {
	
	@BeforeClass
	public static void init() {
		RestAssured.baseURI="http://restapi.demoqa.com/customer/register";
	}
	
	static String firstName = "fisrtName123";
	static String lastName = "lastName123";
	static String userName = "userName1234";
	static String password = "password123";
	static String email = "email184@gmail.com";
	
	@Title("This will create a new User")
	@Test
	public void createUser() {
		try {
			
		
		RegisterClass user = new RegisterClass();
		
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setUserName(userName);
		user.setPassword(password);
		user.setEmail(email);
		
		System.out.println(user);
		SerenityRest.rest()
		.given().contentType(ContentType.JSON)
		.log()
		.all()
		.when()
		.body(user)
		.post()
		.then()
		.log()
		.all()
		.statusCode(201);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
