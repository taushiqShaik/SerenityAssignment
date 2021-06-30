package com.proj;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.hamcrest.Matchers.hasValue;


//import static org.hamcrest.MatcherAssert.assertThat();
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.HashMap;

//import static org.hamcrest.CoreMatchers.equalTo; import static org.hamcrest.CoreMatchers.not; import static org.hamcrest.collection.IsMapContaining.hasEntry; import static org.junit.Assert.assertEquals; import static org.junit.Assert.assertThat; import static org.junit.Assert.assertTrue; import static org.junit.matchers.JUnitMatchers.hasItems;
//
//import java.io.IOException; import java.io.InputStream; import java.util.Arrays; import java.util.HashSet; import java.util.Iterator; import java.util.List; import java.util.Map; import java.util.Properties; import java.util.Scanner; import java.util.Set; import java.util.TreeMap;
//
////import main.PriceServiceLookup;
//
//import org.hamcrest.Matcher; import org.junit.Assert; import org.junit.Test;
//import org.junit.Test;
import org.junit.runner.RunWith;

import com.gargoylesoftware.htmlunit.javascript.host.fetch.Response;

import io.restassured.RestAssured;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;

@RunWith(SerenityRunner.class)
public class Assign {
	
	@BeforeClass
	public static void init(){
		RestAssured.baseURI="http://restcountries.eu/rest/v1/name";
	}
	
	@Test
	public void verifyIndiaIsPresent() {
//		String p1 = "findAll{it.name=='" ;
//		String p2 = "'}.name.get(0)";
		String[] a = {"Republic of India"};
		
		String value =
		SerenityRest.rest()
		.given()
		.when()
		.get("/INDIA")
		.then()
		.extract()
		.path("findAll{it.name=='India'}.get(0).altSpellings.get(2)");
		
		
		System.out.println(value);
		
//		assertThat(value,hasValue(a));

//	 assertThat(actual, matcher);

	}
	@Test
	public void verifyXYZisPresent() {
		SerenityRest.rest().given().when().get("/xyz").then().log().all().statusCode(404);
	}
}

/*

*/