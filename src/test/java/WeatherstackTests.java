import controllers.WeatherstackCtrl;
import models.CurrentWeatherModel;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WeatherstackTests {

    public WeatherstackCtrl weatherstackCtrl;
    public RestApi restApi;
    private String API_KEY = "";

    @BeforeClass
    public void beforeClass() {
        API_KEY = System.getenv("apikey");

        weatherstackCtrl = new WeatherstackCtrl();
        restApi = new RestApi();
    }

    @Test
    public void CurrentWeatherTest(){
        final String city = "Dnepropetrovsk";
//        final String city = "Dnipro";

        CurrentWeatherModel currentWeatherModel = restApi.weatherstackCtrl.getCurrentWeather(city);

        Assert.assertNotNull(currentWeatherModel);
        Assert.assertEquals(currentWeatherModel.getLocation().getName(), city, "City name is different");
    }

}
