package br.com.tgs.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.tgs.ecommerce.model.Usuario;
import br.com.tgs.ecommerce.service.UsuarioService;

@Controller
public class CadastroController {

  @Autowired
  private UsuarioService service;
  
  @GetMapping("/login")
  public String telaLogin() {
    return "paginasCadastro/login";
  }

  @PostMapping("/login")
  public String logar(Model model, String email, String senha) {
    return service.logar(model, email, senha);
  }

  @GetMapping("/cadastro")
  public String telaCadastro() {
    return "paginasCadastro/cadastro";
  }

  @PostMapping("/cadastro")
  public String cadastrar(Model model, Usuario user) {
    return service.cadastrar(model, user);
  }
  
}
