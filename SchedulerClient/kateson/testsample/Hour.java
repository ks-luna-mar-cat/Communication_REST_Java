package kateson.testsample;

public class Hour {
	
	int dayOfWeek;
	int openHour;
	int openMinute;
	int closeHour;
	int closeMinute;
	boolean closed;
	
	public int getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(int dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	public int getOpenHour() {
		return openHour;
	}
	public void setOpenHour(int openHour) {
		this.openHour = openHour;
	}
	public int getOpenMinute() {
		return openMinute;
	}
	public void setOpenMinute(int openMinute) {
		this.openMinute = openMinute;
	}
	public int getCloseHour() {
		return closeHour;
	}
	public void setCloseHour(int closeHour) {
		this.closeHour = closeHour;
	}
	public int getCloseMinute() {
		return closeMinute;
	}
	public void setCloseMinute(int closeMinute) {
		this.closeMinute = closeMinute;
	}
	public boolean isClosed() {
		return closed;
	}
	public void setClosed(boolean closed) {
		this.closed = closed;
	}

}
