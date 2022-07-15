package br.com.tgs.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.tgs.ecommerce.service.UsuarioService;

@Controller
@RequestMapping("/login")
public class LoginController {

  @Autowired
  private UsuarioService service;
  
  @GetMapping
  public String telaLogin() {
    return "login";
  }

  @PostMapping
  public String logar(Model model, String email, String senha) {
    return service.logar(model, email, senha);
  }
}
