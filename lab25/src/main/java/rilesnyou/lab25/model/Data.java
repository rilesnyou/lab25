package rilesnyou.lab25.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {
	private List <String> weather;
	private List <String> image;

	private List<String> text;
	private List<String> iconLink;
	public List<String> getWeather() {
		return weather;
	}
	public void setWeather(List<String> weather) {
		this.weather = weather;
	}
	public List<String> getImage() {
		return image;
	}
	public void setImage(List<String> image) {
		this.image = image;
	}
	public List<String> getText() {
		return text;
	}
	public void setText(List<String> text) {
		this.text = text;
	}
	
	public List<String> getIconLink() {
		return iconLink;
	}
	public void setIconLink(List<String> iconLink) {
		this.iconLink = iconLink;
	}
	@Override
	public String toString() {
		return "Data [weather=" + weather + ", image=" + image + ", text=" + text + ", iconLink=" + iconLink + "]";
	}
	

	

}
