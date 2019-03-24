/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.daione.pavan.Papelaria.Papelaria.Entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author daione.pavan
 */
@Entity
@PrimaryKeyJoinColumn(name="id")
public class Cliente extends Usuario{
   
    private int quantidadeDePontos; 
    @ManyToMany
    List<Venda> vendas; 
  
    public int getQuantidadeDePontos() {
        return quantidadeDePontos;
    }

    public void setQuantidadeDePontos(int quantidadeDePontos) {
        this.quantidadeDePontos = quantidadeDePontos;
    }

     
}
