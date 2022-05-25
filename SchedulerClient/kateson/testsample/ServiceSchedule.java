
package kateson.testsample;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ServiceSchedule {

    @SerializedName("scheduleDateString")
    @Expose
    private String scheduleDateString;
    @SerializedName("scheduleDate")
    @Expose
    private String scheduleDate;
    @SerializedName("serviceLineId")
    @Expose
    private String serviceLineId;
    @SerializedName("clinicPage")
    @Expose
    private Integer clinicPage;
    @SerializedName("clinics")
    @Expose
    private List<Clinic> clinics = null;
    @SerializedName("showMore")
    @Expose
    private Boolean showMore;
    @SerializedName("serviceMessage")
    @Expose
    private Object serviceMessage;
    @SerializedName("nextAvailableDate")
    @Expose
    private Object nextAvailableDate;
    @SerializedName("foldClinics")
    @Expose
    private Boolean foldClinics;

    public String getScheduleDateString() {
        return scheduleDateString;
    }

    public void setScheduleDateString(String scheduleDateString) {
        this.scheduleDateString = scheduleDateString;
    }

    public String getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(String scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public String getServiceLineId() {
        return serviceLineId;
    }

    public void setServiceLineId(String serviceLineId) {
        this.serviceLineId = serviceLineId;
    }

    public Integer getClinicPage() {
        return clinicPage;
    }

    public void setClinicPage(Integer clinicPage) {
        this.clinicPage = clinicPage;
    }

    public List<Clinic> getClinics() {
        return clinics;
    }

    public void setClinics(List<Clinic> clinics) {
        this.clinics = clinics;
    }

    public Boolean getShowMore() {
        return showMore;
    }

    public void setShowMore(Boolean showMore) {
        this.showMore = showMore;
    }

    public Object getServiceMessage() {
        return serviceMessage;
    }

    public void setServiceMessage(Object serviceMessage) {
        this.serviceMessage = serviceMessage;
    }

    public Object getNextAvailableDate() {
        return nextAvailableDate;
    }

    public void setNextAvailableDate(Object nextAvailableDate) {
        this.nextAvailableDate = nextAvailableDate;
    }

    public Boolean getFoldClinics() {
        return foldClinics;
    }

    public void setFoldClinics(Boolean foldClinics) {
        this.foldClinics = foldClinics;
    }

}
