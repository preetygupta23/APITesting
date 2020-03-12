import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetWeather {

@Test
    public void getWeather()
{
    System.out.println("Hello, its my first function");
    //Response res = RestAssured.get("http://api.openweathermap.org/data/2.5/weather?q=Delhi&appid=93cd45be0c9bc0dd88681f2f4f5e5ee2");
  //  Assert.assertEquals(200,res.getStatusCode());
    String json = RestAssured.get("http://api.openweathermap.org/data/2.5/weather?q=Delhi&appid=93cd45be0c9bc0dd88681f2f4f5e5ee2").asString();
    JsonPath jsonPath = new JsonPath(json).setRootPath("main");
    float temp = jsonPath.getFloat("temp");
    //Assert.assertTrue();
    System.out.println(temp);
    Assert.assertTrue(temp>0);
}
    @Test
    public void getWeatherStatus401()
    {
        System.out.println("Hello, its my first function");
        Response res = RestAssured.get("http://api.openweathermap.org/data/2.5/weather?q=Delhi&appid=93cd45be0c9bc0dd88681f2f4f5e5e2");
        Assert.assertEquals(401,res.getStatusCode());
    }
  @Test
    public void parseWeather()
  {
      String uri =RestAssured.baseURI = "http://api.openweathermap.org/data/2.5/weather";
     // String appid = RestAssured.oauth2("93cd45be0c9bc0dd88681f2f4f5e5ee2");
      String queryparam = "?q=Delhi&appid=";
      Response res = RestAssured.get(uri + queryparam + "93cd45be0c9bc0dd88681f2f4f5e5ee2");
      System.out.println(res);
  }
  @Test
  public void postspotify()
  {
     // Response res = RestAssured.post("https://api.spotify.com/v1/users/31oqcsvt6p63ule7eayygwp2tfp4/playlists");

      RestAssured.baseURI ="http://api.spotify.com/v1/users/31oqcsvt6p63ule7eayygwp2tfp4/playlists";

          RequestSpecification request = RestAssured.given().header("Authorization" ,"Bearer BQD9bpBGaaHD2Nvq4jZavxQrzB12Pxi1SBUU-8jfi3eZ7KhYPAUJU49eNn7yA3V6BpUAgC0mpBS3mymoouXr4Sieg7aVdWhtX7ShpnIitlzlVBj3ieajVeR0Xs2qizWwakAw6YuwyEBZGb5zpL_2JqNhmBPQabW1vIvIKS_lJbGA6z0pvktdsrzltKMgI8GCQ8LjmQC3n68t6ZZydrhXA6nKPw0O-3O42xdYDj08SEfNPGSDYHYk-2S3Z4g595Sa80qBMYwfYDy-895xdOVlSQ1m7UotnsaQBg");

      request.body("{\"name\":\"From Inteli\",\"description\":\"New playlist description\",\"public\":false}");


      System.out.println("Response :" + request.asString());
      System.out.println("Status Code :" + request.getStatusCode());
      System.out.println("Does Reponse contains 'From Inteli'? :" + request.asString().contains("From Inteli"));


      assertEquals(200, response.getStatusCode());

     // RestAssured.post().then().assertThat().statusCode(201);


  }
}
