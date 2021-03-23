package com.service.SpringNewWeb.controllers;

import com.service.SpringNewWeb.models.Accounts;
import com.service.SpringNewWeb.models.Clients;
import com.service.SpringNewWeb.models.Organizations;
import com.service.SpringNewWeb.repo.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientsListController {

    @Autowired
    private ClientRepository clientsRepository;

    @GetMapping("/clients-list")
    public String createClients(Model model) {
        Iterable<Clients> clients = clientsRepository.findAll();

        model.addAttribute("title", "Список клиентов");
        model.addAttribute("clients", clients);

        return "clients-list";
    }
}
