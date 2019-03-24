/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.daione.pavan.Papelaria.Papelaria.Controllers;

import Services.EnderecoService;
import br.edu.ifrs.restinga.daione.pavan.Papelaria.Papelaria.DAO.UnidadeFederativaDAO;
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
public class UnidadeFederativaController {
     @Autowired
    UnidadeFederativaDAO ufDAO; 
    
    EnderecoService enderecoService = new EnderecoService(); 
    
    // UF Session
    @RequestMapping(path = "/uf/",  method = RequestMethod.GET)
    public List<UnidadeFederativa> ufList (){
        List<UnidadeFederativa> ufs = enderecoService.Ufs(ufDAO.findAll()); 
        if(ufs!= null){
            return ufs;
        }
     return null;    
    }
    
    
    public void insertUf(UnidadeFederativa uf){
        UnidadeFederativa ufInt = enderecoService.unidadeFederativaReturn(uf); 
        if(ufInt!= null){
            ufDAO.save(ufInt);
        }
        
    }
    
}
