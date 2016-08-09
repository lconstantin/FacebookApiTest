package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lconstantin on 8/9/2016.
 */
@RestController
public class WebController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public User get(@RequestParam("id") long id, @RequestParam("name") String name) {
        String info = String.format("/GET info: id=%d, name=%s", id, name);
        System.out.println(info);
        return new User(id, name);
    }



}
