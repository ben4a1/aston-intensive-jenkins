package by.paramonov.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @RequestMapping("/answer")
    public String varText() {
        return "They killed Kenny! at 12-31";
    }
}
