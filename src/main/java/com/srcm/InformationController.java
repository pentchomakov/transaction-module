package com.srcm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Pentcho on 5/6/2017.
 */
@Controller
@RequestMapping("/information")
public class InformationController {

    @RequestMapping(method= RequestMethod.GET)
    public @ResponseBody Buy sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {

        return new Buy(10, "");
    }

}


