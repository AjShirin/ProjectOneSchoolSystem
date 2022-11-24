package RandomUserAPI;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class GetRequest {

    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://randomuser.me/api/?results=5&page=3&seed=shirin&password=special,upper,lower,number"))
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        System.out.println("THe JSON is :" +response.body());
        Gson GsonObject = new Gson();
        Unkown unknownObj = GsonObject.fromJson(response.body().toString(),Unkown.class);
        System.out.println("*************************************************");
        
        System.out.println("The 1st Email is:"+unknownObj.getResults().get(0).getEmail());
        System.out.println("The 2nd Email is:"+unknownObj.getResults().get(1).getEmail());
        System.out.println("The 3rd Email is:"+unknownObj.getResults().get(2).getEmail());
        System.out.println("The 4th Email is:"+unknownObj.getResults().get(3).getEmail());
        System.out.println("The 5th Email is:"+unknownObj.getResults().get(4).getEmail());
        System.out.println("*************************************************");
        
        System.out.println("The 1st page number is :"+ unknownObj.getInfo().getPage());
        System.out.println("The 2nd page number is :"+ unknownObj.getInfo().getPage());
        System.out.println("*************************************************");
        System.out.println("The seed is :" + unknownObj.getInfo().getSeed());
        System.out.println("*************************************************");
        System.out.println("The 1st Results is:"+ unknownObj.getInfo().getResults());
        System.out.println("The 2nd Results is:"+ unknownObj.getInfo().getResults());
        System.out.println("*************************************************");
        System.out.println("The 1st password is:"+ unknownObj.getResults().get(0).getLogin().getPassword());
        System.out.println("The 2nd password is:"+ unknownObj.getResults().get(1).getLogin().getPassword());
      
    
    }
}