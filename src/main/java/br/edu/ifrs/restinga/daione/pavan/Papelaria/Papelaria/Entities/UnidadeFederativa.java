/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.daione.pavan.Papelaria.Papelaria.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author daione.pavan
 */
@Entity
public class UnidadeFederativa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id; 
   private String nome; 
   private String sigla; 
   @ManyToOne
   private Endereco e; 
   
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Endereco getE() {
        return e;
    }

    public void setE(Endereco e) {
        this.e = e;
    }
   
   
}
