/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.daione.pavan.Papelaria.Papelaria.Controllers;

import Services.EnderecoService;
import br.edu.ifrs.restinga.daione.pavan.Papelaria.Papelaria.DAO.EnderecoDAO;
import br.edu.ifrs.restinga.daione.pavan.Papelaria.Papelaria.DAO.UnidadeFederativaDAO;
import br.edu.ifrs.restinga.daione.pavan.Papelaria.Papelaria.Entities.Endereco;
import br.edu.ifrs.restinga.daione.pavan.Papelaria.Papelaria.Entities.UnidadeFederativa;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author daione.pavan
 */
@RestController
public class EnderecoController {
    EnderecoDAO eDAO; 
    
    @RequestMapping(path="/endereco/", method=RequestMethod.POST)
    public void InserirEndereco(Endereco endereco){
        
    }
   
}
