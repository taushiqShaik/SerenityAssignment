package com.proj;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.restassured.RestAssured;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SerenityRunner.class)
public class Assign2 {
	
	@BeforeClass
	public static void init() {
		RestAssured.baseURI="http://restcountries.eu/rest/v1/name";
	}
	
	@Test
	public void getNorwayDetails() {
		SerenityRest.rest().given().when().get("/norway").then().log().all();
		
//		assertThat(reason, assertion);
	}
	
	

}
