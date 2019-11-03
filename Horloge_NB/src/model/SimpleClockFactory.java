package model;

import java.time.format.DateTimeFormatter;

public class SimpleClockFactory extends ClockFactory {
	
	private String heure;
	private String refreshFreq;
	
	public SimpleClockFactory(String heure, String refreshFreq){
		this.setHeure(heure);
		this.setRefreshFreq(refreshFreq);
	}

	public String getHeure() {
		return heure;
	}

	public void setHeure(String heure) {
		this.heure = heure;
	}

	public String getRefreshFreq() {
		return refreshFreq;
	}

	public void setRefreshFreq(String refreshFreq) {
		this.refreshFreq = refreshFreq;
	}
	
	@Override
	public Clock fabriqueClock() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(this.getHeure());
		Clock temp = new SimpleClockConcret(formatter,Integer.parseInt(this.getRefreshFreq()));
		return temp;
	}

}
