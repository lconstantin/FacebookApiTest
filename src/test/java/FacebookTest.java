import hello.User;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lconstantin on 8/9/2016.
 */
public class FacebookTest {


    @Test
    public void convert_json_response_to_java_obj() {
        RestTemplate restTemplate = new RestTemplate();

        User user = restTemplate.getForObject(GRAPH_API_URL,User.class,200);
        System.out.println("ID: " + user.getId());
        System.out.println("ID: " + user.getName());

    }
}
