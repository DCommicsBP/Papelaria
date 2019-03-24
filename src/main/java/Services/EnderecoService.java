/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import br.edu.ifrs.restinga.daione.pavan.Papelaria.Papelaria.Entities.UnidadeFederativa;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author daione.pavan
 */
public class EnderecoService {

    public List<UnidadeFederativa> Ufs(Iterable<UnidadeFederativa> ufs) {
        List<UnidadeFederativa> ufsInternal = new ArrayList<>();
        if (ufs != null) {
            for (UnidadeFederativa uf : ufs) {
                ufsInternal.add(uf);
            }
            return ufsInternal;
        }
        return null;
    }

    public UnidadeFederativa unidadeFederativaReturn(UnidadeFederativa uf) {
        if (uf != null) {
            return uf;
        } else {
            return null;
        }
    }
}
