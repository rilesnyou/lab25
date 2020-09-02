package rilesnyou.lab25;
import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import rilesnyou.lab25.model.Data;
//import rilesnyou.lab25.model.DataResponse;
import rilesnyou.lab25.model.DataResponse;


@Service
public class ApiService {

	private RestTemplate rt;

//	private String latitude;
//	private String longitude;
	// ADD DECK_ID value
	

	// initialization block that runs when a new instance of the class is created
	// loaded before the constructor
	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
			return execution.execute(request, body);
		};
		rt = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}
	
//	public List<String> findData () {
//		
//		String url="https://forecast.weather.gov/MapClick.php?lat=38.4247341&lon=-86.9624086&FcstType=json";
//		DataResponse response = rt.getForObject(url, DataResponse.class, "spring");
//		
//		return response.getData();
//	}
	public DataResponse fetchWeather(double lat, double lon) {
		String url = "https://forecast.weather.gov/MapClick.php?lat={lat}&lon={lon}&FcstType=json";

		DataResponse response = rt.getForObject(url, DataResponse.class, lat, lon);
		
		return response;
	}
	


}