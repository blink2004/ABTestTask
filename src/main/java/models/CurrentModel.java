package models;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "observation_time",
        "temperature",
        "weather_code",
        "weather_icons",
        "weather_descriptions",
        "wind_speed",
        "wind_degree",
        "wind_dir",
        "pressure",
        "precip",
        "humidity",
        "cloudcover",
        "feelslike",
        "uv_index",
        "visibility",
        "is_day"
})
@Generated("jsonschema2pojo")
public class CurrentModel {

    @JsonProperty("observation_time")
    private String observationTime;
    @JsonProperty("temperature")
    private Integer temperature;
    @JsonProperty("weather_code")
    private Integer weatherCode;
    @JsonProperty("weather_icons")
    private List<String> weatherIcons = null;
    @JsonProperty("weather_descriptions")
    private List<String> weatherDescriptions = null;
    @JsonProperty("wind_speed")
    private Integer windSpeed;
    @JsonProperty("wind_degree")
    private Integer windDegree;
    @JsonProperty("wind_dir")
    private String windDir;
    @JsonProperty("pressure")
    private Integer pressure;
    @JsonProperty("precip")
    private Double precip;
    @JsonProperty("humidity")
    private Integer humidity;
    @JsonProperty("cloudcover")
    private Integer cloudcover;
    @JsonProperty("feelslike")
    private Integer feelslike;
    @JsonProperty("uv_index")
    private Integer uvIndex;
    @JsonProperty("visibility")
    private Integer visibility;
    @JsonProperty("is_day")
    private String isDay;

    @JsonProperty("observation_time")
    public String getObservationTime() {
        return observationTime;
    }

    @JsonProperty("observation_time")
    public void setObservationTime(String observationTime) {
        this.observationTime = observationTime;
    }

    @JsonProperty("temperature")
    public Integer getTemperature() {
        return temperature;
    }

    @JsonProperty("temperature")
    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    @JsonProperty("weather_code")
    public Integer getWeatherCode() {
        return weatherCode;
    }

    @JsonProperty("weather_code")
    public void setWeatherCode(Integer weatherCode) {
        this.weatherCode = weatherCode;
    }

    @JsonProperty("weather_icons")
    public List<String> getWeatherIcons() {
        return weatherIcons;
    }

    @JsonProperty("weather_icons")
    public void setWeatherIcons(List<String> weatherIcons) {
        this.weatherIcons = weatherIcons;
    }

    @JsonProperty("weather_descriptions")
    public List<String> getWeatherDescriptions() {
        return weatherDescriptions;
    }

    @JsonProperty("weather_descriptions")
    public void setWeatherDescriptions(List<String> weatherDescriptions) {
        this.weatherDescriptions = weatherDescriptions;
    }

    @JsonProperty("wind_speed")
    public Integer getWindSpeed() {
        return windSpeed;
    }

    @JsonProperty("wind_speed")
    public void setWindSpeed(Integer windSpeed) {
        this.windSpeed = windSpeed;
    }

    @JsonProperty("wind_degree")
    public Integer getWindDegree() {
        return windDegree;
    }

    @JsonProperty("wind_degree")
    public void setWindDegree(Integer windDegree) {
        this.windDegree = windDegree;
    }

    @JsonProperty("wind_dir")
    public String getWindDir() {
        return windDir;
    }

    @JsonProperty("wind_dir")
    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    @JsonProperty("pressure")
    public Integer getPressure() {
        return pressure;
    }

    @JsonProperty("pressure")
    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    @JsonProperty("precip")
    public Double getPrecip() {
        return precip;
    }

    @JsonProperty("precip")
    public void setPrecip(Double precip) {
        this.precip = precip;
    }

    @JsonProperty("humidity")
    public Integer getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    @JsonProperty("cloudcover")
    public Integer getCloudcover() {
        return cloudcover;
    }

    @JsonProperty("cloudcover")
    public void setCloudcover(Integer cloudcover) {
        this.cloudcover = cloudcover;
    }

    @JsonProperty("feelslike")
    public Integer getFeelslike() {
        return feelslike;
    }

    @JsonProperty("feelslike")
    public void setFeelslike(Integer feelslike) {
        this.feelslike = feelslike;
    }

    @JsonProperty("uv_index")
    public Integer getUvIndex() {
        return uvIndex;
    }

    @JsonProperty("uv_index")
    public void setUvIndex(Integer uvIndex) {
        this.uvIndex = uvIndex;
    }

    @JsonProperty("visibility")
    public Integer getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("is_day")
    public String getIsDay() {
        return isDay;
    }

    @JsonProperty("is_day")
    public void setIsDay(String isDay) {
        this.isDay = isDay;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CurrentModel.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("observationTime");
        sb.append('=');
        sb.append(((this.observationTime == null)?"<null>":this.observationTime));
        sb.append(',');
        sb.append("temperature");
        sb.append('=');
        sb.append(((this.temperature == null)?"<null>":this.temperature));
        sb.append(',');
        sb.append("weatherCode");
        sb.append('=');
        sb.append(((this.weatherCode == null)?"<null>":this.weatherCode));
        sb.append(',');
        sb.append("weatherIcons");
        sb.append('=');
        sb.append(((this.weatherIcons == null)?"<null>":this.weatherIcons));
        sb.append(',');
        sb.append("weatherDescriptions");
        sb.append('=');
        sb.append(((this.weatherDescriptions == null)?"<null>":this.weatherDescriptions));
        sb.append(',');
        sb.append("windSpeed");
        sb.append('=');
        sb.append(((this.windSpeed == null)?"<null>":this.windSpeed));
        sb.append(',');
        sb.append("windDegree");
        sb.append('=');
        sb.append(((this.windDegree == null)?"<null>":this.windDegree));
        sb.append(',');
        sb.append("windDir");
        sb.append('=');
        sb.append(((this.windDir == null)?"<null>":this.windDir));
        sb.append(',');
        sb.append("pressure");
        sb.append('=');
        sb.append(((this.pressure == null)?"<null>":this.pressure));
        sb.append(',');
        sb.append("precip");
        sb.append('=');
        sb.append(((this.precip == null)?"<null>":this.precip));
        sb.append(',');
        sb.append("humidity");
        sb.append('=');
        sb.append(((this.humidity == null)?"<null>":this.humidity));
        sb.append(',');
        sb.append("cloudcover");
        sb.append('=');
        sb.append(((this.cloudcover == null)?"<null>":this.cloudcover));
        sb.append(',');
        sb.append("feelslike");
        sb.append('=');
        sb.append(((this.feelslike == null)?"<null>":this.feelslike));
        sb.append(',');
        sb.append("uvIndex");
        sb.append('=');
        sb.append(((this.uvIndex == null)?"<null>":this.uvIndex));
        sb.append(',');
        sb.append("visibility");
        sb.append('=');
        sb.append(((this.visibility == null)?"<null>":this.visibility));
        sb.append(',');
        sb.append("isDay");
        sb.append('=');
        sb.append(((this.isDay == null)?"<null>":this.isDay));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.visibility == null)? 0 :this.visibility.hashCode()));
        result = ((result* 31)+((this.weatherCode == null)? 0 :this.weatherCode.hashCode()));
        result = ((result* 31)+((this.feelslike == null)? 0 :this.feelslike.hashCode()));
        result = ((result* 31)+((this.observationTime == null)? 0 :this.observationTime.hashCode()));
        result = ((result* 31)+((this.windDir == null)? 0 :this.windDir.hashCode()));
        result = ((result* 31)+((this.pressure == null)? 0 :this.pressure.hashCode()));
        result = ((result* 31)+((this.isDay == null)? 0 :this.isDay.hashCode()));
        result = ((result* 31)+((this.cloudcover == null)? 0 :this.cloudcover.hashCode()));
        result = ((result* 31)+((this.weatherDescriptions == null)? 0 :this.weatherDescriptions.hashCode()));
        result = ((result* 31)+((this.precip == null)? 0 :this.precip.hashCode()));
        result = ((result* 31)+((this.weatherIcons == null)? 0 :this.weatherIcons.hashCode()));
        result = ((result* 31)+((this.temperature == null)? 0 :this.temperature.hashCode()));
        result = ((result* 31)+((this.humidity == null)? 0 :this.humidity.hashCode()));
        result = ((result* 31)+((this.windDegree == null)? 0 :this.windDegree.hashCode()));
        result = ((result* 31)+((this.windSpeed == null)? 0 :this.windSpeed.hashCode()));
        result = ((result* 31)+((this.uvIndex == null)? 0 :this.uvIndex.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CurrentModel) == false) {
            return false;
        }
        CurrentModel rhs = ((CurrentModel) other);
        return (((((((((((((((((this.visibility == rhs.visibility)||((this.visibility!= null)&&this.visibility.equals(rhs.visibility)))&&((this.weatherCode == rhs.weatherCode)||((this.weatherCode!= null)&&this.weatherCode.equals(rhs.weatherCode))))&&((this.feelslike == rhs.feelslike)||((this.feelslike!= null)&&this.feelslike.equals(rhs.feelslike))))&&((this.observationTime == rhs.observationTime)||((this.observationTime!= null)&&this.observationTime.equals(rhs.observationTime))))&&((this.windDir == rhs.windDir)||((this.windDir!= null)&&this.windDir.equals(rhs.windDir))))&&((this.pressure == rhs.pressure)||((this.pressure!= null)&&this.pressure.equals(rhs.pressure))))&&((this.isDay == rhs.isDay)||((this.isDay!= null)&&this.isDay.equals(rhs.isDay))))&&((this.cloudcover == rhs.cloudcover)||((this.cloudcover!= null)&&this.cloudcover.equals(rhs.cloudcover))))&&((this.weatherDescriptions == rhs.weatherDescriptions)||((this.weatherDescriptions!= null)&&this.weatherDescriptions.equals(rhs.weatherDescriptions))))&&((this.precip == rhs.precip)||((this.precip!= null)&&this.precip.equals(rhs.precip))))&&((this.weatherIcons == rhs.weatherIcons)||((this.weatherIcons!= null)&&this.weatherIcons.equals(rhs.weatherIcons))))&&((this.temperature == rhs.temperature)||((this.temperature!= null)&&this.temperature.equals(rhs.temperature))))&&((this.humidity == rhs.humidity)||((this.humidity!= null)&&this.humidity.equals(rhs.humidity))))&&((this.windDegree == rhs.windDegree)||((this.windDegree!= null)&&this.windDegree.equals(rhs.windDegree))))&&((this.windSpeed == rhs.windSpeed)||((this.windSpeed!= null)&&this.windSpeed.equals(rhs.windSpeed))))&&((this.uvIndex == rhs.uvIndex)||((this.uvIndex!= null)&&this.uvIndex.equals(rhs.uvIndex))));
    }

}
