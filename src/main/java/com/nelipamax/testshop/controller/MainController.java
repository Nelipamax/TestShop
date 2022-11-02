package com.nelipamax.testshop.controller;

import com.nelipamax.testshop.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    @Autowired
    CustomerRepository repo;

    public String mainController() {

        return "main";
    }
}
