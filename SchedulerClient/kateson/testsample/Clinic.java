
package kateson.testsample;

import java.lang.reflect.Field;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Clinic {

    @SerializedName("clinicId")
    @Expose
    private String clinicId;
    @SerializedName("clinicName")
    @Expose
    private String clinicName;
    @SerializedName("clinicCode")
    @Expose
    private String clinicCode;
    @SerializedName("clinicURL")
    @Expose
    private String clinicURL;
    @SerializedName("clinicAddress")
    @Expose
    private ClinicAddress clinicAddress;
    @SerializedName("clinicIcon")
    @Expose
    private String clinicIcon;
    @SerializedName("clinicMessage")
    @Expose
    private Object clinicMessage;
    @SerializedName("nextScheduleDate")
    @Expose
    private String nextScheduleDate;
    @SerializedName("nextScheduleDateParam")
    @Expose
    private String nextScheduleDateParam;
    @SerializedName("clinicMapLink")
    @Expose
    private String clinicMapLink;
    @SerializedName("distance")
    @Expose
    private String distance;
    @SerializedName("clinicProviderSchedules")
    @Expose
    private List<ClinicProviderSchedule> clinicProviderSchedules = null;
    @SerializedName("clinicHours")
    @Expose
    private List<ClinicHour> clinicHours = null;
    @SerializedName("clinicHoursText")
    @Expose
    private String clinicHoursText;

    public String getClinicId() {
        return clinicId;
    }

    public void setClinicId(String clinicId) {
        this.clinicId = clinicId;
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public String getClinicCode() {
        return clinicCode;
    }

    public void setClinicCode(String clinicCode) {
        this.clinicCode = clinicCode;
    }

    public String getClinicURL() {
        return clinicURL;
    }

    public void setClinicURL(String clinicURL) {
        this.clinicURL = clinicURL;
    }

    public ClinicAddress getClinicAddress() {
        return clinicAddress;
    }

    public void setClinicAddress(ClinicAddress clinicAddress) {
        this.clinicAddress = clinicAddress;
    }

    public String getClinicIcon() {
        return clinicIcon;
    }

    public void setClinicIcon(String clinicIcon) {
        this.clinicIcon = clinicIcon;
    }

    public Object getClinicMessage() {
        return clinicMessage;
    }

    public void setClinicMessage(Object clinicMessage) {
        this.clinicMessage = clinicMessage;
    }

    public String getNextScheduleDate() {
        return nextScheduleDate;
    }

    public void setNextScheduleDate(String nextScheduleDate) {
        this.nextScheduleDate = nextScheduleDate;
    }

    public String getNextScheduleDateParam() {
        return nextScheduleDateParam;
    }

    public void setNextScheduleDateParam(String nextScheduleDateParam) {
        this.nextScheduleDateParam = nextScheduleDateParam;
    }

    public String getClinicMapLink() {
        return clinicMapLink;
    }

    public void setClinicMapLink(String clinicMapLink) {
        this.clinicMapLink = clinicMapLink;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public List<ClinicProviderSchedule> getClinicProviderSchedules() {
        return clinicProviderSchedules;
    }

    public void setClinicProviderSchedules(List<ClinicProviderSchedule> clinicProviderSchedules) {
        this.clinicProviderSchedules = clinicProviderSchedules;
    }

    public List<ClinicHour> getClinicHours() {
        return clinicHours;
    }

    public void setClinicHours(List<ClinicHour> clinicHours) {
        this.clinicHours = clinicHours;
    }

    public String getClinicHoursText() {
        return clinicHoursText;
    }

    public void setClinicHoursText(String clinicHoursText) {
        this.clinicHoursText = clinicHoursText;
    }

    public  String toString() {
    	  StringBuilder result = new StringBuilder();
    	  String newLine = System.getProperty("line.separator");

    	  result.append( this.getClass().getName() );
    	  result.append( " Object {" );
    	  result.append(newLine);

    	  //determine fields declared in this class only (no fields of superclass)
    	  Field[] fields = this.getClass().getDeclaredFields();

    	  //print field names paired with their values
    	  for ( Field field : fields  ) {
    	    result.append("  ");
    	    try {
    	      result.append( field.getName() );
    	      result.append(": ");
    	      //requires access to private field:
    	      result.append( field.get(this) );
    	    } catch ( IllegalAccessException ex ) {
    	      System.out.println(ex);
    	    }
    	    result.append(newLine);
    	  }
    	  result.append("}");

    	  return result.toString();
    	}
}
