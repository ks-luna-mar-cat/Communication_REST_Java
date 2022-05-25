
package kateson.testsample;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClinicProviderSchedule {

    @SerializedName("scheduleSlots")
    @Expose
    private List<ScheduleSlot> scheduleSlots = null;
    @SerializedName("providerFirstName")
    @Expose
    private String providerFirstName;
    @SerializedName("providerLastName")
    @Expose
    private String providerLastName;
    @SerializedName("providerCredential")
    @Expose
    private String providerCredential;
    @SerializedName("providerWebUrl")
    @Expose
    private String providerWebUrl;
    @SerializedName("providerImageUrl")
    @Expose
    private String providerImageUrl;
    @SerializedName("providerId")
    @Expose
    private String providerId;
    @SerializedName("providerSpecialty")
    @Expose
    private String providerSpecialty;
    @SerializedName("providerMessage")
    @Expose
    private Object providerMessage;
    @SerializedName("nextAvailableDate")
    @Expose
    private Object nextAvailableDate;

    public List<ScheduleSlot> getScheduleSlots() {
        return scheduleSlots;
    }

    public void setScheduleSlots(List<ScheduleSlot> scheduleSlots) {
        this.scheduleSlots = scheduleSlots;
    }

    public String getProviderFirstName() {
        return providerFirstName;
    }

    public void setProviderFirstName(String providerFirstName) {
        this.providerFirstName = providerFirstName;
    }

    public String getProviderLastName() {
        return providerLastName;
    }

    public void setProviderLastName(String providerLastName) {
        this.providerLastName = providerLastName;
    }

    public String getProviderCredential() {
        return providerCredential;
    }

    public void setProviderCredential(String providerCredential) {
        this.providerCredential = providerCredential;
    }

    public String getProviderWebUrl() {
        return providerWebUrl;
    }

    public void setProviderWebUrl(String providerWebUrl) {
        this.providerWebUrl = providerWebUrl;
    }

    public String getProviderImageUrl() {
        return providerImageUrl;
    }

    public void setProviderImageUrl(String providerImageUrl) {
        this.providerImageUrl = providerImageUrl;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getProviderSpecialty() {
        return providerSpecialty;
    }

    public void setProviderSpecialty(String providerSpecialty) {
        this.providerSpecialty = providerSpecialty;
    }

    public Object getProviderMessage() {
        return providerMessage;
    }

    public void setProviderMessage(Object providerMessage) {
        this.providerMessage = providerMessage;
    }

    public Object getNextAvailableDate() {
        return nextAvailableDate;
    }

    public void setNextAvailableDate(Object nextAvailableDate) {
        this.nextAvailableDate = nextAvailableDate;
    }

}
