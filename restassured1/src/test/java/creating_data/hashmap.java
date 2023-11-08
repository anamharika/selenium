package creating_data;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class hashmap {
	@Test
	public void tc1() {
		baseURI="https://reqres.in/";
		// creat data using hashmap
		HashMap m = new HashMap();
		m.put("name", "harika");
		m.put("job", "tester");
		given().body(m).contentType(ContentType.JSON).when().post("/api/users").then().log().all();
		
	}

}
