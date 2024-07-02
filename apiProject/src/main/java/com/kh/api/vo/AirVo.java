package com.kh.api.vo;

public class AirVo {
	private String pm10Value;
	private String stationname;
	private String dataTime;
	private String o3time;
	private String khaiValue;
	public AirVo(String pm10Value, String stationname, String dataTime, String o3time, String khaiValue) {
		super();
		this.pm10Value = pm10Value;
		this.stationname = stationname;
		this.dataTime = dataTime;
		this.o3time = o3time;
		this.khaiValue = khaiValue;
	}
	public String getPm10Value() {
		return pm10Value;
	}
	public void setPm10Value(String pm10Value) {
		this.pm10Value = pm10Value;
	}
	public String getStationname() {
		return stationname;
	}
	public void setStationname(String stationname) {
		this.stationname = stationname;
	}
	public String getDataTime() {
		return dataTime;
	}
	public void setDataTime(String dataTime) {
		this.dataTime = dataTime;
	}
	public String getO3time() {
		return o3time;
	}
	public void setO3time(String o3time) {
		this.o3time = o3time;
	}
	public String getkhaiValue() {
		return khaiValue;
	}
	public AirVo() {
		super();
	}
	public void setkhaiValue(String khaiValue) {
		this.khaiValue = khaiValue;
	}
}
