package br.com.hastydev.hastydev.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.hastydev.hastydev.model.Person;
import br.com.hastydev.hastydev.repositories.Repositories;

@RestController
public class Controller {

  @Autowired
  private Repositories action;

  @GetMapping("")
  public String mensagem() {
    return "Seja Bem-Vindo à HastyDEV API!";
  }

  @GetMapping("/boasvindas/{nome}")
  public String boasVindas(@PathVariable String nome) {
    return "Seja Bem-Vindo(a), " + nome + "!";
  }

  @PostMapping("/person")
  public String person(@RequestBody Person p){
    return "Seu Nome é: " + p.getNome() + ". E sua idade é: " + p.getIdade();
  }
}
