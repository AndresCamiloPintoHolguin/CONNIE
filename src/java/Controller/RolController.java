/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Controller;

import Model.Rolusuario;
import Services.RolusuarioFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author camil
 */
@Named(value = "rolController")
@SessionScoped
public class RolController implements Serializable {

    /**
     * Creates a new instance of RolController
     */
    public RolController() {
    }
    
    private String message;
    private Rolusuario rol = new Rolusuario();

    @EJB
    private RolusuarioFacade rolfacade;
    
    
     
    public List<Rolusuario>getALLRolusuario(){
        return rolfacade.findAll();
    }
    
    
    
    
    
    
    

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the rol
     */
    public Rolusuario getRol() {
        return rol;
    }

    /**
     * @param rol the rol to set
     */
    public void setRol(Rolusuario rol) {
        this.rol = rol;
    }

    /**
     * @return the rolfacade
     */
    public RolusuarioFacade getRolfacade() {
        return rolfacade;
    }

    /**
     * @param rolfacade the rolfacade to set
     */
    public void setRolfacade(RolusuarioFacade rolfacade) {
        this.rolfacade = rolfacade;
    }
}
