package hello;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import sun.net.www.http.HttpClient;

/**
 * Created by lconstantin on 8/9/2016.
 */
public class RestfulUser{

    RestTemplate restTemplate;

    public RestfulUser() {
    }

    public RestfulUser(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    protected static final String ACCESS_TOKEN = "EAACEdEose0cBAM4Co67TdHNoXHdt9sy1EyJQYZBt5W1408FiFYb3pG1yzmUgpnhixijnmsTS3bEZCIQEhYsQnZAuLybZC17dbmVQpUBHTzv8YkDHJ2D3tkm1DKZCNMN8BhHYUZB7ISFZBVWeZC1ZBmRnylyAhdRKdhvFMcTrFNbDBPgZDZD";
    private static final String API_VERSION = "2.7";
    private static final String GRAPH_API_URL = "https://graph.facebook.com/v" + API_VERSION + "/" ;



//
//    public void getEntity(){
//
//        System.out.println("Begin /GET request!");
//        String getUrl = GRAPH_API_URL;
//
//        String result = restTemplate.getForObject(getUrl, String.class);
//
//        System.out.println(result);
//        ResponseEntity<User> getResponse = restTemplate.getForEntity(getUrl, User.class);
//        if(getResponse.getBody() != null){
//            System.out.println("Response for Get Request: " + getResponse.getBody().toString());
//        }else{
//            System.out.println("Response for Get Request: NULL");
//        }
//    }

}
