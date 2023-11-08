package creating_data;

import org.testng.annotations.Test;



import static io.restassured.RestAssured.*;
import  io.restassured.http.ContentType;

public class sample1 {
	
		@Test
		public void m() {

	 baseURI="https://reqres.in/";
	simple o =new simple("harika", "sripathi");
	given().body(o).contentType(ContentType.JSON).when().post("/api/users").then().log().all();
					
	}

}

	


















