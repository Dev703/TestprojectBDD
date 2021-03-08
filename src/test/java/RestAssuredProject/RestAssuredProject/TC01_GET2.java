package RestAssuredProject.RestAssuredProject;

import org.junit.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static  io.restassured.assertion.BodyMatcher.*;
import  static io.restassured.response.Response.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.codehaus.groovy.ast.expr.ArgumentListExpression;

public class TC01_GET2 {

	@Test
	void test_01()
	{
		Response response =get("https://reqres.in/api/users?page=2");
		System.out.println(response.asString());
		System.out.println(response.getBody());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
		
		int statusCode=response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		
	}
	@Test
	void test_02() {
		given().get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(201);
		
		
		
	
		
		
		
		
		
		
		
		

}
}