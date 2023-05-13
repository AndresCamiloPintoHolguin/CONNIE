/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Controller;

import Model.Prioridad;
import Services.PrioridadFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author pc
 */
@Named(value = "prioridadController")
@SessionScoped
public class prioridadController implements Serializable {

    @EJB
    private PrioridadFacade prioridadFacade;
    private Prioridad prioridad = new Prioridad();
    
    public prioridadController() {
    }
    
    public List<Prioridad> getAllPrioridades(){
        return prioridadFacade.findAll();
    }

    /**
     * @return the prioridad
     */
    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }
    
}
