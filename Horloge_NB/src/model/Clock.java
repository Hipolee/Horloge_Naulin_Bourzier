package model;
import java.time.LocalTime;

public abstract class Clock {
	private LocalTime temps;
	private int refreshFrequency;
	
	public LocalTime getTemps() {
		return temps;
	}
	
	public void setTemps(LocalTime temps) {
		this.temps = temps;
	}

	public int getRefreshFrequency() {
		return refreshFrequency;
	}

	public void setRefreshFrequency(int refreshFrequency) {
		this.refreshFrequency = refreshFrequency;
	}
}
