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
    Usuario user = repository.Login(email, senha);

    if (user != null) {
      return "redirect:/home";
    }

    model.addAttribute("erro", "Usuário ou senha inválidos");

    return "paginasCadastro/login";
  }

  public String cadastrar(Model model, Usuario usuarioCadastrado) {

    Boolean emailNaoExiste = repository.findByEmail(usuarioCadastrado.getEmail())
        .stream()
        .allMatch(email -> email.equals(usuarioCadastrado));

    if (emailNaoExiste) {
      repository.save(usuarioCadastrado);
      model.addAttribute("sucesso", "Conta criada com sucesso");
      return "paginasCadastro/login";   
    }

    model.addAttribute("erro", "Esse email já foi cadastrado");

    return "paginasCadastro/cadastro";

  }
}
