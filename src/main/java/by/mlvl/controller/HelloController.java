package by.mlvl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by avzabr on 06.01.2017
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHi() {
        return "Hi";
    }

}
