package br.com.tgs.ecommerce.controller;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.tgs.ecommerce.model.ApiModel;
import br.com.tgs.ecommerce.service.ApiModelService;

@Controller
@RequestMapping("/home")
public class HomeController {

  @Autowired
  private ApiModelService service;
  
  @GetMapping
  public String home(Model model) throws URISyntaxException {
    ApiModel results = service.teste();

    model.addAttribute("jogos", results);
    return "home";
  }
}
