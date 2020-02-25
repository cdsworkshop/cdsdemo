package com.ovh.cds.controller;

import com.ovh.cds.model.ResponseHello;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping(method= RequestMethod.GET)
    public @ResponseBody
    ResponseHello sayHello(@RequestParam(value="name", required=false, defaultValue="World") String name) {
        return new ResponseHello(name);
    }
}
