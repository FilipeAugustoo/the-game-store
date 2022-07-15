package br.com.tgs.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import br.com.tgs.ecommerce.model.Usuario;
import br.com.tgs.ecommerce.repository.UsuarioRepository;

@Service
public class UsuarioService {
  
  @Autowired
  private UsuarioRepository repository;

  public String logar(Model model, String email, String senha) {
    Usuario user = this.repository.Login(email, senha);

    if(user != null) {
      return "redirect:/home";
    }
    
    model.addAttribute("erro", "Usuário ou senha inválidos");

    return "login";
  }
}
