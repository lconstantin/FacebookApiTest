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

public class MainRestfulUser {
    protected static final String ACCESS_TOKEN = "EAACEdEose0cBAMGGv3mkZAHLBAI3mFuabFsKc02zyfxbypeCCZCBGseaJy8hpCDsOXKB838vpvmo3m0chrJdZBma74WVJR22mkL87UVChsUjYrmDoZB5DKmGBgOR8Bx1rF06B5YGVWkJVhIUz7BIZBIq7Ng5jsS8r7RzOpeVtLAZDZD";
    private static final String API_VERSION = "2.7";
    private static final String GRAPH_API_URL = "https://graph.facebook.com/v" + API_VERSION + "/me?access_token=" + ACCESS_TOKEN;

    public static void main(String[] args) {

        RestTemplate restTemplate = new RestTemplate();

        User user = restTemplate.getForObject(GRAPH_API_URL,User.class,200);
        System.out.println("ID: " + user.getId());
        System.out.println("ID: " + user.getName());
      //  restfulUser.getEntity();

    }
}
