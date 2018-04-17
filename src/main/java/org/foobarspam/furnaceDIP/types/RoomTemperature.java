package org.foobarspam.furnaceDIP.types;

import com.google.inject.Singleton;
	
@Singleton
public class RoomTemperature {
	
	private double temperature = 0;
	private static RoomTemperature instance;

	private RoomTemperature(){
		this.temperature = 15;		
	}

	public double getTemperature() {
		return this.temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public void incrementTemperature(double increment){
		this.temperature += increment;
	}

	public static RoomTemperature getInstance(){
		if (instance instanceof RoomTemperature){
			return instance;
		} else {
			instance = new RoomTemperature();
		}
		return instance;
	}

}
