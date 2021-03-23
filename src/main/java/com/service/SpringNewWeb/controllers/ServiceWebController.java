package com.service.SpringNewWeb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServiceWebController {

    @GetMapping("/create-clients")
    public String createClients(Model model) {
        return "create-clients";
    }
}
