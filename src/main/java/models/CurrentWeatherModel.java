package models;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "request",
        "location",
        "current"
})
@Generated("jsonschema2pojo")
public class CurrentWeatherModel {

    @JsonProperty("request")
    private RequestModel request;
    @JsonProperty("location")
    private LocationModel location;
    @JsonProperty("current")
    private CurrentModel current;

    @JsonProperty("request")
    public RequestModel getRequest() {
        return request;
    }

    @JsonProperty("request")
    public void setRequest(RequestModel request) {
        this.request = request;
    }

    @JsonProperty("location")
    public LocationModel getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(LocationModel location) {
        this.location = location;
    }

    @JsonProperty("current")
    public CurrentModel getCurrent() {
        return current;
    }

    @JsonProperty("current")
    public void setCurrent(CurrentModel current) {
        this.current = current;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CurrentWeatherModel.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("request");
        sb.append('=');
        sb.append(((this.request == null)?"<null>":this.request));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("current");
        sb.append('=');
        sb.append(((this.current == null)?"<null>":this.current));
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
        result = ((result* 31)+((this.request == null)? 0 :this.request.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.current == null)? 0 :this.current.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CurrentWeatherModel) == false) {
            return false;
        }
        CurrentWeatherModel rhs = ((CurrentWeatherModel) other);
        return ((((this.request == rhs.request)||((this.request != null)&&this.request.equals(rhs.request)))&&((this.location == rhs.location)||((this.location != null)&&this.location.equals(rhs.location))))&&((this.current == rhs.current)||((this.current != null)&&this.current.equals(rhs.current))));
    }

}
