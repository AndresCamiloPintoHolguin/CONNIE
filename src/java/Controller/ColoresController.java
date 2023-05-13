/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Controller;

import Model.Colores;
import Services.ColoresFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author camil
 */
@Named(value = "coloresController")
@SessionScoped
public class ColoresController implements Serializable {

//   importamos el ejb y instanciamos el facade de colores;
    @EJB
    private ColoresFacade coloresFacade;
    
    /////////////////////
    
    
//    creamos una variable para nombre color
    private String nombre_color;
    //////////////////////////
    
//    cramos un objeto nuevo de colores
    private Colores color = new Colores();
    ////////////////////
    
    public ColoresController() {
    }

    
//    metodo listar 
    
    
    public List<Colores>getALLColores(){
    return coloresFacade.findAll();
}
    
    ///////////////////////
    
    
    
    
    
    
    
    
//    cramos los geters and seters
    /**
     * @return the coloresFacade
     */
    public ColoresFacade getColoresFacade() {
        return coloresFacade;
    }

    /**
     * @param coloresFacade the coloresFacade to set
     */
    public void setColoresFacade(ColoresFacade coloresFacade) {
        this.coloresFacade = coloresFacade;
    }

    /**
     * @return the nombre_color
     */
    public String getNombre_color() {
        return nombre_color;
    }

    /**
     * @param nombre_color the nombre_color to set
     */
    public void setNombre_color(String nombre_color) {
        this.nombre_color = nombre_color;
    }

    /**
     * @return the color
     */
    public Colores getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Colores color) {
        this.color = color;
    }
    
}
