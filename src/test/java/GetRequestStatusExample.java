import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetRequestStatusExample {

    @Test
    public void GetBookingIds_VerifyStatusCode()
    {
        RequestSpecification request= RestAssured.given();

        request.baseUri("https://restful-booker.herokuapp.com/booking");

        Response response=request.get();

        /*String respString = response.asString();
        System.out.println(respString);*/

        ValidatableResponse valRes=response.then();

        //valRes.toString();
        valRes.statusCode(200);



    }
    @Test
    public void Bdd_GetBookingIds_VerifyStatusCode()
    {
        RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
                .get("/booking")
                .then()
                .statusCode(200);
    }

}
