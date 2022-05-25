
package kateson.testsample;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("serviceSchedules")
    @Expose
    private List<ServiceSchedule> serviceSchedules = null;

    public List<ServiceSchedule> getServiceSchedules() {
        return serviceSchedules;
    }

    public void setServiceSchedules(List<ServiceSchedule> serviceSchedules) {
        this.serviceSchedules = serviceSchedules;
    }

}
