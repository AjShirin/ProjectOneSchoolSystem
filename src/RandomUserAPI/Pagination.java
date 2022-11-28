package RandomUserAPI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.Gson;

public class Pagination {
	public void showPagination() throws IOException, InterruptedException {
		System.out.println("Please enter number of page");
		Scanner sc = new Scanner(System.in);
		int numberOfPage = sc.nextInt();

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://randomuser.me/api/?page=" + numberOfPage + "")).build();

		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		String JsonR = response.body();

		System.out.println("THe JSON is :" + response.body());
		Gson GsonObject = new Gson();
		//Unkown unknownObj = GsonObject.fromJson(response.body().toString(), Unkown.class);
		
		/*Creating a file of JSON and saving */
	    try {
	         FileWriter file = new FileWriter("JSONFileWriter.txt");
	         file.write(JsonR.toString());
	         file.close();
	      } catch (IOException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	      System.out.println("JSON file created");
	      
	      /*Read Json From File*/
	      Reader JSONReader = new BufferedReader(new FileReader("JSONFileWriter.txt"));
	      Unkown unknownObj = GsonObject.fromJson(JSONReader,Unkown.class);

		
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
