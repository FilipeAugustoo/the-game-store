package br.com.tgs.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Usuario {

  @Id
  private String email;

  private String senha;

  private String username;

  private Integer saldo = 0;
}
