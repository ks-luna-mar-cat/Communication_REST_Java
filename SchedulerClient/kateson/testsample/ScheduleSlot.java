
package kateson.testsample;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ScheduleSlot {

    @SerializedName("appointmentId")
    @Expose
    private Object appointmentId;
    @SerializedName("slotShowTime")
    @Expose
    private String slotShowTime;
    @SerializedName("slotTime")
    @Expose
    private String slotTime;
    @SerializedName("clinicId")
    @Expose
    private String clinicId;
    @SerializedName("clinicCode")
    @Expose
    private String clinicCode;
    @SerializedName("providerId")
    @Expose
    private String providerId;
    @SerializedName("serviceLineId")
    @Expose
    private String serviceLineId;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("machineType")
    @Expose
    private Object machineType;
    @SerializedName("referralId")
    @Expose
    private Object referralId;
    @SerializedName("radiologyMachines")
    @Expose
    private List<Object> radiologyMachines = null;

    public Object getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Object appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getSlotShowTime() {
        return slotShowTime;
    }

    public void setSlotShowTime(String slotShowTime) {
        this.slotShowTime = slotShowTime;
    }

    public String getSlotTime() {
        return slotTime;
    }

    public void setSlotTime(String slotTime) {
        this.slotTime = slotTime;
    }

    public String getClinicId() {
        return clinicId;
    }

    public void setClinicId(String clinicId) {
        this.clinicId = clinicId;
    }

    public String getClinicCode() {
        return clinicCode;
    }

    public void setClinicCode(String clinicCode) {
        this.clinicCode = clinicCode;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getServiceLineId() {
        return serviceLineId;
    }

    public void setServiceLineId(String serviceLineId) {
        this.serviceLineId = serviceLineId;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Object getMachineType() {
        return machineType;
    }

    public void setMachineType(Object machineType) {
        this.machineType = machineType;
    }

    public Object getReferralId() {
        return referralId;
    }

    public void setReferralId(Object referralId) {
        this.referralId = referralId;
    }

    public List<Object> getRadiologyMachines() {
        return radiologyMachines;
    }

    public void setRadiologyMachines(List<Object> radiologyMachines) {
        this.radiologyMachines = radiologyMachines;
    }

}
