package hello;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.EmbeddedServletContainerAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lconstantin on 8/9/2016.
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = {EmbeddedServletContainerAutoConfiguration.class, WebMvcAutoConfiguration.class})

public class SpringbootResttemplateApplication {
    protected static final String ACCESS_TOKEN = "EAACEdEose0cBAM4Co67TdHNoXHdt9sy1EyJQYZBt5W1408FiFYb3pG1yzmUgpnhixijnmsTS3bEZCIQEhYsQnZAuLybZC17dbmVQpUBHTzv8YkDHJ2D3tkm1DKZCNMN8BhHYUZB7ISFZBVWeZC1ZBmRnylyAhdRKdhvFMcTrFNbDBPgZDZD";
    private static final String API_VERSION = "2.7";
    private static final String GRAPH_API_URL = "https://graph.facebook.com/v" + API_VERSION + "/me";

    public static void main(String[] args) {

        RestTemplate restTemplate = new RestTemplate();
        RestfulUser restfulUser = new RestfulUser();

        User user = restTemplate.getForObject(GRAPH_API_URL,User.class,200);
        System.out.println("ID: " + user.getId());
        System.out.println("ID: " + user.getName());
      //  restfulUser.getEntity();

    }
}
