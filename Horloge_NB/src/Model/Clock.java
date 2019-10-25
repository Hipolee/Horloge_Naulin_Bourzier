package Model;
import java.time.LocalTime;

public abstract class Clock {
	protected LocalTime temps;
	protected int refreshFrequency;
	
	LocalTime getTemps() {
		return temps;
	}
	
	void setTemps(LocalTime temps) {
		this.temps = temps;
	}

	public int getRefreshFrequency() {
		return refreshFrequency;
	}

	public void setRefreshFrequency(int refreshFrequency) {
		this.refreshFrequency = refreshFrequency;
	}
}
