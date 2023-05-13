/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Controller;

import Model.Cliente;
import Model.EstadoPqrs;
import Model.Pqrs;
import Model.Prioridad;
import Services.ClienteFacade;
import Services.EstadoPqrsFacade;
import Services.PqrsFacade;
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
@Named(value = "pqrsController")
@SessionScoped
public class pqrsController implements Serializable {

    @EJB
    private ClienteFacade clienteFacade;
    @EJB
    private EstadoPqrsFacade estadoPqrsFacade;
    @EJB
    private PrioridadFacade prioridadFacade;
    @EJB
    private PqrsFacade pqrsFacade;
    
    private Pqrs pqrs = new Pqrs();
    private Cliente cliente;
    private EstadoPqrs estado;
    private Prioridad prioridad;
    
    /**
     * Creates a new instance of pqrsController
     */
    public pqrsController() {
        cliente = new Cliente();
        estado = new EstadoPqrs();
        prioridad = new Prioridad();
    }
    
    public List<Pqrs> getAllPqrs(){
        return pqrsFacade.findAll();
    }
    
    public void editarPqrs(){
        getPqrs().setIdCliente(getClienteFacade().find(cliente.getIdCliente()));
        getPqrs().setIdPrioridad(getPrioridadFacade().find(prioridad.getIdPrioridad()));
        getPqrs().setIdestadoPqrs(getEstadoPqrsFacade().find(estado.getIdestadoPqrs()));
        pqrsFacade.edit(pqrs);
    }
    
    public void guardarPqrs(){
        pqrs.setIdCliente(getClienteFacade().find(cliente.getIdCliente()));
        pqrs.setIdPrioridad(getPrioridadFacade().find(prioridad.getIdPrioridad()));
        pqrs.setIdestadoPqrs(getEstadoPqrsFacade().find(estado.getIdestadoPqrs()));
        pqrsFacade.create(pqrs);
    }
    
    public void mostrarDatosPqrs(Pqrs pqrs){
        this.pqrs.setIdSolicitud(pqrs.getIdSolicitud());
        this.cliente.setIdCliente(pqrs.getIdCliente().getIdCliente());
        this.prioridad.setIdPrioridad(pqrs.getIdPrioridad().getIdPrioridad());
        this.estado.setIdestadoPqrs(pqrs.getIdestadoPqrs().getIdestadoPqrs());
        this.pqrs.setDescripcion(pqrs.getDescripcion());
        this.pqrs.setFecha(pqrs.getFecha());
    }
    
    public void eliminarPqrs(Pqrs pqrs){     
        pqrsFacade.remove(pqrs);        
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
     * @return the estadoPqrsFacade
     */
    public EstadoPqrsFacade getEstadoPqrsFacade() {
        return estadoPqrsFacade;
    }

    /**
     * @param estadoPqrsFacade the estadoPqrsFacade to set
     */
    public void setEstadoPqrsFacade(EstadoPqrsFacade estadoPqrsFacade) {
        this.estadoPqrsFacade = estadoPqrsFacade;
    }

    /**
     * @return the prioridadFacade
     */
    public PrioridadFacade getPrioridadFacade() {
        return prioridadFacade;
    }

    /**
     * @param prioridadFacade the prioridadFacade to set
     */
    public void setPrioridadFacade(PrioridadFacade prioridadFacade) {
        this.prioridadFacade = prioridadFacade;
    }

    /**
     * @return the pqrs
     */
    public Pqrs getPqrs() {
        return pqrs;
    }

    /**
     * @param pqrs the pqrs to set
     */
    public void setPqrs(Pqrs pqrs) {
        this.pqrs = pqrs;
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
     * @return the estado
     */
    public EstadoPqrs getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(EstadoPqrs estado) {
        this.estado = estado;
    }

    /**
     * @return the prioridad
     */
    public Prioridad getPrioridad() {
        return prioridad;
    }

    /**
     * @param prioridad the prioridad to set
     */
    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }
    
}
