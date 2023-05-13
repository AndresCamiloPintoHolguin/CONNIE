/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Controller;

import Model.EstadoPqrs;
import Services.EstadoPqrsFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author pc
 */
@Named(value = "estadoPqrsController")
@SessionScoped
public class EstadoPqrsController implements Serializable {

    @EJB
    private EstadoPqrsFacade estadoPqrsFacade;

    private EstadoPqrs estadoPqrs = new EstadoPqrs();
    
    
    public EstadoPqrsController() {
    }

    public List<EstadoPqrs> getAllEstadosPqrs(){
        return estadoPqrsFacade.findAll();
    }
    
    public EstadoPqrs getEstadoPqrs() {
        return estadoPqrs;
    }

    /**
     * @param estadoPqrs the estadoPqrs to set
     */
    public void setEstadoPqrs(EstadoPqrs estadoPqrs) {
        this.estadoPqrs = estadoPqrs;
    }
    
    
    
}
