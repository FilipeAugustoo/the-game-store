package br.com.tgs.ecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.tgs.ecommerce.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {

  @Query(value = "select * from usuario where email = :email and senha = :senha",
    nativeQuery = true)
  public Usuario Login(String email, String senha);

  public Optional<Usuario> findByEmail(String email);
} 
