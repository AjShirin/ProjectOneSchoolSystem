package RandomUserAPI;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.Gson;

public class IncludingParamter {
	public void showIncludeParamter() throws IOException, InterruptedException {
		System.out.println("what you want to appears for user from the choices:");
		System.out.println("___________________________________");
		System.out.println(
				"name\r\n"
				+ "nat\r\n"
				+ "email\r\n"
				+ "login\r\n"
				+ "location\r\n"
				+ "gender"
				);
		System.out.println("___________________________________");
		
		
		Scanner sc = new Scanner(System.in);
		String include = sc.next();

		
			HttpClient client = HttpClient.newHttpClient();
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create("https://randomuser.me/api/?inc="+include)).build();

			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

			System.out.println("THe JSON is :" + response.body());
			Gson GsonObject = new Gson();
			Unkown unknownObj = GsonObject.fromJson(response.body().toString(), Unkown.class);
			//System.out.println(response.body().formatted(null));
			System.out.println("*************************************************");
           if((unknownObj.getResults().get(0).getName()!= null)) {
		    System.out.println("The Name is:"+unknownObj.getResults().get(0).getName().getFirst());
           }
         
           
           else  if((unknownObj.getResults().get(0).getLocation()!=null)) {
		    	 System.out.println("The location is:"+unknownObj.getResults().get(0).getLocation().getState());
			
          }
          else  if((unknownObj.getResults().get(0).getEmail()!=null)) {
		    	 System.out.println("The email is:"+unknownObj.getResults().get(0).getEmail());
			
        }
          else  if((unknownObj.getResults().get(0).getLogin()!=null)) {
		    	 System.out.println("The login is:"+unknownObj.getResults().get(0).getLogin());
			
     } 
     
          else  if((unknownObj.getResults().get(0).getNat()!=null)) {
  		    	 System.out.println("The nat is:"+unknownObj.getResults().get(0).getNat());
  			
    } 
          else  if((unknownObj.getResults().get(0).getGender()!=null)) {
		    	 System.out.println("The gender is:"+unknownObj.getResults().get(0).getGender());
			
 }

		
	}
}
