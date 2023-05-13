/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Controller;

import Model.Cliente;
import Model.Producto;
import Model.Tiposdepago;
import Model.Ventas;
import Services.ClienteFacade;
import Services.ProductoFacade;
import Services.TiposdepagoFacade;
import Services.VentasFacade;
import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author camil
 */
@Named(value = "ventasController")
@SessionScoped
public class ventasController implements Serializable {
    
    //    primero que todo importamos los facade de las clases que usaremos y le agregamos una variable para llamarlas

    @EJB
    private TiposdepagoFacade tiposdepagoFacade;
    @EJB
    private ProductoFacade productoFacade;
    @EJB
    private ClienteFacade clienteFacade;
    @EJB
    private VentasFacade ventasFacade;
    
      /////////////////////////////////////////
    
    
//    creamos un constructir y creamos objetos de las clases
      public ventasController() {
        cliente = new Cliente();
        producto = new Producto();
        tipoPago = new Tiposdepago();
    }
           ///////////////////////////////////
    
    //    creamos un nuevo objeto de venta 
    private Ventas venta = new Ventas();
    
      ///////////////////////////////////
    
    //    creamos variables para llamar a las clases
    private Cliente cliente;
    private Tiposdepago tipoPago;
    private Producto producto;
    /////////////////////////////
    
    
    //    creamos las alertas que se mostraran al usar los metodos
    
    private String messageCrear;
    private String messageEliminar;
    private String messageEditar;
    
    
    //////////////////////////////////
    
    
    //    metodo listar ventas
//    creamos un public List y adentro le ponemos la clase que va a listar 
//    despues le agragamos el metodo de getALL y la clase ventas para que nos liste todo lo que alla en ventas
//    agregamos un return y el facade de ventas con el metodo findall
   
    
     public List<Ventas> getAllVentas() {
        return ventasFacade.findAll();
    }
///////////////////////////////////////
     
    
    
//    metodo guardar 
//     lo que hacemos es usar el objeto de venta que creamos anteriormente y lo que hacemos es buscar los datos y que los almacene en venta
    
     public void guardarVenta() {
        venta.setIdCliente(clienteFacade.find(cliente.getIdCliente()));
        venta.setIdProducto(productoFacade.find(producto.getIdProducto()));
        venta.setIdtipoPago(tiposdepagoFacade.find(tipoPago.getIdtipoPago()));
        ventasFacade.create(venta);
        messageCrear = "venta guardada";
    }
    /////////////////////////////////////
     
     
    
//     metodo actualizar 
//     se basa en la misma teoria de el metodo guardar buscar los datos y almacenarlos en venta
    
    public void editarVenta() throws IOException{
        venta.setIdCliente(clienteFacade.find(cliente.getIdCliente()));
        venta.setIdProducto(productoFacade.find(producto.getIdProducto()));
        venta.setIdtipoPago(tiposdepagoFacade.find(tipoPago.getIdtipoPago()));
        ventasFacade.edit(venta);
        messageEditar = "Venta Actualizada correctamente";
    }
    /////////////////////////////
    
    
//    metodo eliminar
//    se basa en usar un metodo que ya esta predefinido y solo seria invocarlos el cual es el remove
//            y le decimos que es lo que va a eliminar y pues en este ejercicio eliminaremos una venta entonces ponemos el objeto de venta 
    
     public void eliminarVenta(Ventas ventas) {
        ventasFacade.remove(ventas);
        messageEliminar = "Venta Eliminada";
    }
    
    ///////////////////////////////////
    
//    metodo cargar datos para despues poder actualizarlos este metodo es para que en el apartado de actualizar
//     y nos llene los espacios con la infomarcion que hay en la base de datos se basa basicamente 
//     en lo mismo buscamos los datos y los almacenamos para mostrarlos 
//    
    public void cargarDatosVenta(Ventas venta){
        this.venta.setIdVenta(venta.getIdVenta());
        this.cliente.setIdCliente(venta.getIdCliente().getIdCliente());
        this.producto.setIdProducto(venta.getIdProducto().getIdProducto());
        this.tipoPago.setIdtipoPago(venta.getIdtipoPago().getIdtipoPago());
        this.venta.setPrecioTotal(venta.getPrecioTotal());
        this.venta.setPuntosCompra(venta.getPuntosCompra());
        this.venta.setUnidades(venta.getUnidades());
        this.venta.setFecha(venta.getFecha());
    }
    
    ////////////////////////////////// 
//    creamos los geters and seters 

    /**
     * @return the tiposdepagoFacade
     */
    public TiposdepagoFacade getTiposdepagoFacade() {
        return tiposdepagoFacade;
    }

    /**
     * @param tiposdepagoFacade the tiposdepagoFacade to set
     */
    public void setTiposdepagoFacade(TiposdepagoFacade tiposdepagoFacade) {
        this.tiposdepagoFacade = tiposdepagoFacade;
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
     * @return the clienteFacade
     */
    public ClienteFacade getClienteFacade() {
        return clienteFacade;
    }

    /**
     * @param clienteFacade the clienteFacade to set
     */
    public void setClienteFacade(ClienteFacade clienteFacade) {
        this.clienteFacade = clienteFacade;
    }

    /**
     * @return the venta
     */
    public Ventas getVenta() {
        return venta;
    }

    /**
     * @param venta the venta to set
     */
    public void setVenta(Ventas venta) {
        this.venta = venta;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

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
     * @return the messageCrear
     */
    public String getMessageCrear() {
        return messageCrear;
    }

    /**
     * @param messageCrear the messageCrear to set
     */
    public void setMessageCrear(String messageCrear) {
        this.messageCrear = messageCrear;
    }

    /**
     * @return the messageEliminar
     */
    public String getMessageEliminar() {
        return messageEliminar;
    }

    /**
     * @param messageEliminar the messageEliminar to set
     */
    public void setMessageEliminar(String messageEliminar) {
        this.messageEliminar = messageEliminar;
    }

    /**
     * @return the messageEditar
     */
    public String getMessageEditar() {
        return messageEditar;
    }

    /**
     * @param messageEditar the messageEditar to set
     */
    public void setMessageEditar(String messageEditar) {
        this.messageEditar = messageEditar;
    }
    
}
