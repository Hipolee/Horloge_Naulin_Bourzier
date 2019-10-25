package Model;

import java.time.format.DateTimeFormatter;

public abstract class ClockFactory {
	protected DateTimeFormatter formatter;
	
	public abstract Clock fabriqueClock();
}
