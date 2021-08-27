package com.kevingates.eth.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import com.kevingates.uniswap.models.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {

        return "user name is "+ User.getUserName();
    }

    @GetMapping("/howto")
    public String howto() {

        return "how to: "+ User.howto();
    }
}
