/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.daione.pavan.Papelaria.Papelaria.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author daione.pavan
 */
@RestController
public class EnderecoController {
    
    @RequestMapping(path = "/endereco/",  method = RequestMethod.GET)
    public String teste (){
     return "teste";    
    }
}
