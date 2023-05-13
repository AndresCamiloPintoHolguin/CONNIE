/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Controller;

import Model.Tiposdepago;
import Services.TiposdepagoFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author camil
 */
@Named(value = "tipoPagocontroller")
@SessionScoped
public class tipoPagocontroller implements Serializable {

//    importamos los EJB
    
    @EJB
    TiposdepagoFacade tiposdepagoFacade;
    
 /////////////////////////////////////   
    
//    creamos un objeto de tipo de pago
    
     private Tiposdepago tipoPago =new Tiposdepago();
    //////////////////////////
    
    public tipoPagocontroller() {
    }

//    metodo listar
    
    public List<Tiposdepago> getAllTiposdepago(){
        return tiposdepagoFacade.findAll();
    }
       //////////////////////////

//metodo guardar
    public void guardarTiposdepago(){
        tiposdepagoFacade.create(tipoPago);
    }
    ////////////////////
    
    
//    creamos los geters and seters

    /**
     * @return the tipoPago
     */
    public Tiposdepago getTipoPago() {
        return tipoPago;
    }

    /**
     * @param tipoPago the tipoPago to set
     */
    public void setTipoPago(Tiposdepago tipoPago) {
        this.tipoPago = tipoPago;
    }
    
}
