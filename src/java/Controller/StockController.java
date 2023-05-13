/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Controller;

import Model.Producto;
import Model.StockProducto;
import Services.ProductoFacade;
import Services.StockProductoFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author camil
 */
@Named(value = "stockController")
@SessionScoped
public class StockController implements Serializable {

    private StockProducto stproducto =new StockProducto(); 
    
    public StockController() {
        producto =new Producto();
        
    }
    @EJB
    private StockProductoFacade stockFacade;
    @EJB
    private ProductoFacade productoFacade;
    
    private Producto producto;
    
    
    
    
    public List<StockProducto> getAllStock(){
        return stockFacade.findAll();
    }
    
    
    public void crearStock(){
        
        stproducto.setIdProducto(productoFacade.find(producto.getIdProducto()));
        stockFacade.create(stproducto);
    }
    
    
        
    public void updateStock(){
        
        stproducto.setIdProducto(productoFacade.find(producto.getIdProducto()));
        stockFacade.edit(stproducto);
    }
    
    
    public void eliminarStock(StockProducto stockproducto){
        stockFacade.remove(stproducto);
    }
    
    public void cargarStock( StockProducto stproducto){
        this.stproducto.setIdStockProducto(stproducto.getIdStockProducto());
        this.producto.setIdProducto(stproducto.getIdProducto().getIdProducto());
        this.stproducto.setFechaEntrada(stproducto.getFechaEntrada());
        this.stproducto.setFechaSalida(stproducto.getFechaSalida());
        this.stproducto.setCantidad(stproducto.getCantidad());
        this.stproducto.setUnidadesVendidas(stproducto.getUnidadesVendidas());
    }
    

    /**
     * @return the stockFacade
     */
    public StockProductoFacade getStockFacade() {
        return stockFacade;
    }

    /**
     * @param stockFacade the stockFacade to set
     */
    public void setStockFacade(StockProductoFacade stockFacade) {
        this.stockFacade = stockFacade;
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
     * @return the stproducto
     */
    public StockProducto getStproducto() {
        return stproducto;
    }

    /**
     * @param stproducto the stproducto to set
     */
    public void setStproducto(StockProducto stproducto) {
        this.stproducto = stproducto;
    }
    
    
    
}
