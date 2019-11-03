package controller;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.ntp.TimeInfo;

public class ServerHour {
	{
		String TIME_SERVER = "time-a.nist.gov";
		NTPUDPClient timeClient = new NTPUDPClient();
		InetAddress inetAddress = null;

		try {
			inetAddress = InetAddress.getByName(TIME_SERVER);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		TimeInfo timeInfo = null;

		try {
			timeInfo = timeClient.getTime(inetAddress);
		} catch (IOException e) {
			e.printStackTrace();
		}
		long returnTime = timeInfo.getReturnTime();
		Date time = new Date(returnTime);
		System.out.println("Time from " + TIME_SERVER + ": " + time);
	}
}
