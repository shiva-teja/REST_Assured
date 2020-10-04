package testing_class_files;

import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.response.Response.*;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Test01_GET {
	
	@Test
	void test01(){
		
		Response res=RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(res.asString());
		
	}

	@Test
	void test02(){
		
		given()
			.get("https://reqres.in/api/users?page=2")
			.then()
			.statusCode(200)
				.body("data.id[0]",equalTo(7));
			
//		System.out.println(res.asString());
		
	}

	
}
