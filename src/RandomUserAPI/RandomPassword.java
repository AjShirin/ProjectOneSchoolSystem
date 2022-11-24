package RandomUserAPI;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class RandomPassword {
	public void passwordGenerator()throws IOException, InterruptedException{
            
	        HttpClient client = HttpClient.newHttpClient();
	        HttpRequest request = HttpRequest.newBuilder()
	                .uri(URI.create("https://randomuser.me/api/?password=special,upper,lower"))
	                .build();

	        HttpResponse<String> response = client.send(request,
	                HttpResponse.BodyHandlers.ofString());

	        System.out.println("THe JSON is :" +response.body());
	        Gson GsonObject = new Gson();
	        Unkown unknownObj = GsonObject.fromJson(response.body().toString(),Unkown.class);
	        System.out.println("*************************************************");
	        
	        System.out.println("The 1st password is:"+ unknownObj.getResults().get(0).getLogin().getPassword());     
	    
	    }
	}

