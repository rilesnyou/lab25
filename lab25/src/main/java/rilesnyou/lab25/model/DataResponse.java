package rilesnyou.lab25.model;

import java.util.List;



public class DataResponse {
	private String latitude;
	private String longitude;
	private List<String> data;
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public List<String> getData() {
		return data;
	}
	public void setData(List<String> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "DataResponse [latitude=" + latitude + ", longitude=" + longitude + ", data=" + data + "]";
	}
	
	
	
}
