package ch.rwi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.TimeUnit;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(HttpServletResponse response) throws InterruptedException {
        response.setHeader("Cache-Control", "max-age=5");
        TimeUnit.SECONDS.sleep(2);
        return "Hello World!";
    }
}
