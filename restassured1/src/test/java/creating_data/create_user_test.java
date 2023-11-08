package creating_data;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class create_user_test {
public static void main(String[] args) {
	//to creat request body we need to use json object
	JSONObject j = new JSONObject();
	j.put("name", "harika");
	j.put("job", "tester");
//send the request 
	RequestSpecification req = RestAssured.given();
	// use the url
	req.body(j);
	req.contentType(ContentType.JSON);
	//hit the API
	Response res = req.post("https://reqres.in/api/users");
	
	System.out.println(res.prettyPrint());
	
	
}
}
