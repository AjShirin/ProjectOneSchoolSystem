package RandomUserAPI;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.Gson;

public class ExcludingParamter {
	public void showExcludingParamter() throws IOException, InterruptedException {
		System.out.println("====================================");
		System.out.println("1)Gender");
		System.out.println("2)Name");
		System.out.println("3)Nationalty");
		System.out.println("====================================");
		System.out.println("what you want to execlude for user ");
		
		Scanner sc = new Scanner(System.in);
		String exclude = sc.next();

		
			HttpClient client = HttpClient.newHttpClient();
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create("https://randomuser.me/api/?exc="+exclude)).build();

			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

			System.out.println("THe JSON is :" + response.body());
			Gson GsonObject = new Gson();
			Unkown unknownObj = GsonObject.fromJson(response.body().toString(), Unkown.class);
			System.out.println("*************************************************");
            
			System.out.println("The pagination is  :" + unknownObj.getInfo().getPage());
			System.out.println("The results is  :" + unknownObj.getInfo().getResults());
			System.out.println("The seed is  :" + unknownObj.getInfo().getSeed());
		    System.out.println("The 1st Name is:"+unknownObj.getResults().get(0).getName());
		    System.out.println("The  Email is:"+unknownObj.getResults().get(0).getEmail());
		    System.out.println("The  phone is:"+unknownObj.getResults().get(0).getPhone());
		    System.out.println("The  Gender is:"+unknownObj.getResults().get(0).getGender());
		    System.out.println("The  Dob is:"+unknownObj.getResults().get(0).getDob());
		    System.out.println("The  Dob is:"+unknownObj.getResults().get(0).getNat());
			
			
		
		

		
	}
}
