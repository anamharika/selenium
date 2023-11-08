package creating_data;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.FileInputStream;


import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class json_file {
	@Test
	public void m1() throws Throwable
	{
		baseURI="https://reqres.in/";
		FileInputStream fis = new FileInputStream("D:\\for_ selenium\\restassured1\\src\\main\\resources\\js.json");
		given().body(fis).contentType(ContentType.JSON).when().post("/api/users").then().log().all();
		
		
	}
}
