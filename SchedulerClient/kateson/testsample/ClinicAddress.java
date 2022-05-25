
package kateson.testsample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClinicAddress {

    @SerializedName("id")
    @Expose
    private Object id;
    @SerializedName("line1")
    @Expose
    private String line1;
    @SerializedName("line2")
    @Expose
    private Object line2;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("country")
    @Expose
    private Object country;
    @SerializedName("postalCode")
    @Expose
    private String postalCode;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public Object getLine2() {
        return line2;
    }

    public void setLine2(Object line2) {
        this.line2 = line2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Object getCountry() {
        return country;
    }

    public void setCountry(Object country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

}
