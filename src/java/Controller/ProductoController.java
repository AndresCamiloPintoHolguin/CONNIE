/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Controller;

import Model.Colores;
import Model.Producto;
import Services.ColoresFacade;
import Services.ProductoFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author camil
 */
@Named(value = "productoController")
@SessionScoped
public class ProductoController implements Serializable {

//   importamos los ejb
    @EJB
    private ColoresFacade coloresFacade;
    @EJB
    private ProductoFacade productoFacade;

    //////////////////////////
//    creamos un objeto de producto
    private Producto producto = new Producto();

    //////////////////////////
//    creamos una variable para color y para messaje
    private String message;
    private Colores color;

    ////////////////////////////
    
//    creamos un objeto de colores en el contructor de producto
    
    public ProductoController() {
          color = new Colores();
    }

    //////////////////
    
    
//    metodo listar 
    
     public List<Producto> getALLProducto() {
        return productoFacade.findAll();
    }
    ///////////////
     
     
//     metodo crear
     
    public void createProducto() {
        producto.setIdColor(coloresFacade.find(color.getIdColor()));
        productoFacade.create(producto);        
        
    }
    
    /////////////////
    
    
//    metodo borrar
    
    public void deleteProducto(Producto producto) {
        
        productoFacade.remove(producto);
        
    }
    
    /////////////////////
    
    
//    metodo actualizar
    
    public void update() {
        producto.setIdColor(coloresFacade.find(color.getIdColor()));
        this.productoFacade.edit(producto);
    }

    /////////////////////////////
    
    
//    metodo de cargar datos 
    
    public void CargarDatosProducto( Producto pro){
        this.color.setIdColor(color.getIdColor());
        this.producto = pro;
    }
    
    /////////////  
    
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
     * @return the productoFacade
     */
    public ProductoFacade getProductoFacade() {
        return productoFacade;
    }

    /**
     * @param productoFacade the productoFacade to set
     */
    public void setProductoFacade(ProductoFacade productoFacade) {
        this.productoFacade = productoFacade;
    }

    /**
     * @return the producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
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
