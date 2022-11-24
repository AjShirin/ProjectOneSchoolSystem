package RandomUserAPI;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.Gson;

public class Seeding {

	public void showSeed()throws IOException, InterruptedException{
		System.out.println("Please enter seed");
		Scanner sc = new Scanner(System.in);
		int numberOfSeed = sc.nextInt();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://randomuser.me/api/?seed="+numberOfSeed))
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        System.out.println("THe JSON is :" +response.body());
        Gson GsonObject = new Gson();
        Unkown unknownObj = GsonObject.fromJson(response.body().toString(),Unkown.class);
        System.out.println("*************************************************");
		System.out.println("The pagination is  :" + unknownObj.getInfo().getPage());
		System.out.println("The results is  :" + unknownObj.getInfo().getResults());
		System.out.println("The seed is  :" + unknownObj.getInfo().getSeed());
	    System.out.println("The 1st Name is:"+unknownObj.getResults().get(0).getName().getFirst());
	    System.out.println("The  Email is:"+unknownObj.getResults().get(0).getEmail());
	    System.out.println("The  phone is:"+unknownObj.getResults().get(0).getPhone());
	    System.out.println("The  Gender is:"+unknownObj.getResults().get(0).getGender());
	    System.out.println("The  Dob is:"+unknownObj.getResults().get(0).getDob().getDate());
    
    }
}

