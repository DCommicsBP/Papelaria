/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.daione.pavan.Papelaria.Papelaria.DAO;

import br.edu.ifrs.restinga.daione.pavan.Papelaria.Papelaria.Entities.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author daione.pavan
 */
@Repository
public interface EnderecoDAO extends  CrudRepository<Endereco, Integer> {
    
}