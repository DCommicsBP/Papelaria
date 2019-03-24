/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.daione.pavan.Papelaria.Papelaria.Entities;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author daione.pavan
 */
@Entity
public class Venda {
    @Id
    int id; 
    double valorTotal; 
    Date data; 
    @OneToOne
    Cliente cliente; 
    @OneToOne
    Funcionario funcionario; 
    @ManyToMany
    List<Produto> produtos; 
    
    
    
    
    
}
