
package kateson.testsample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClinicHour {

    @SerializedName("dayOfWeek")
    @Expose
    private Integer dayOfWeek;
    @SerializedName("openHour")
    @Expose
    private Integer openHour;
    @SerializedName("openMinute")
    @Expose
    private Integer openMinute;
    @SerializedName("closeHour")
    @Expose
    private Integer closeHour;
    @SerializedName("closeMinute")
    @Expose
    private Integer closeMinute;
    @SerializedName("closed")
    @Expose
    private Boolean closed;

    public Integer getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Integer getOpenHour() {
        return openHour;
    }

    public void setOpenHour(Integer openHour) {
        this.openHour = openHour;
    }

    public Integer getOpenMinute() {
        return openMinute;
    }

    public void setOpenMinute(Integer openMinute) {
        this.openMinute = openMinute;
    }

    public Integer getCloseHour() {
        return closeHour;
    }

    public void setCloseHour(Integer closeHour) {
        this.closeHour = closeHour;
    }

    public Integer getCloseMinute() {
        return closeMinute;
    }

    public void setCloseMinute(Integer closeMinute) {
        this.closeMinute = closeMinute;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

}
