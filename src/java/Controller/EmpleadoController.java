/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Controller;

import Model.Cargo;
import Model.Documento;
import Model.Empleado;
import Model.Usuario;
import Services.CargoFacade;
import Services.DocumentoFacade;
import Services.EmpleadoFacade;
import Services.UsuarioFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author camil
 */
@Named(value = "empleadoController")
@SessionScoped
public class EmpleadoController implements Serializable {

    @EJB
     private CargoFacade cargoFacade;
    @EJB 
    private DocumentoFacade documentoFacade;
    
    @EJB
    private UsuarioFacade usuarioFacade;
    
    @EJB 
    private EmpleadoFacade empleadoFacade;
    
    
    private Cargo cargo;
    private Documento documento;
    private Usuario usuario;
    
    
    
    
    
    public EmpleadoController (){
       
        cargo = new Cargo();
        documento = new Documento();
        usuario = new Usuario();
    }
    
     private Empleado empleado = new Empleado();

      private String messageCrear;
    private String messageEliminar;
    private String messageEditar;
    
    
    public List <Empleado> getALLEmpleado(){
        return empleadoFacade.findAll();
    }
    
    
    public void CrearEmpleado(){  
        empleado.setIdCargo(cargoFacade.find(cargo.getIdCargo()));
        empleado.setIdUsuario(usuarioFacade.find(usuario.getIdUsuario()));
        empleado.setIdtipoDocumento(documentoFacade.find(documento.getIdtipoDocumento()));
        empleadoFacade.create(empleado);
    }
    
    
     public void updateEmpleado(){
        
        empleado.setIdCargo(cargoFacade.find(cargo.getIdCargo()));
        empleado.setIdUsuario(usuarioFacade.find(usuario.getIdUsuario()));
        empleado.setIdtipoDocumento(documentoFacade.find(documento.getIdtipoDocumento()));
        empleadoFacade.edit(empleado);
    }
    
    
    public void EliminarEmpleado(Empleado empleado){
        empleadoFacade.remove(empleado);
    }
    
    
    public void CargarDatosEmpleado(Empleado empleado){
        
        this.empleado.setIdEmpleado(empleado.getIdEmpleado());
        this.empleado.setNombreEmpleado(empleado.getNombreEmpleado());
        this.empleado.setApellidoEmpleado(empleado.getApellidoEmpleado());
        this.cargo.setIdCargo(empleado.getIdCargo().getIdCargo());
        this.empleado.setCorreoElectronico(empleado.getCorreoElectronico());
        this.documento.setIdtipoDocumento(empleado.getIdtipoDocumento().getIdtipoDocumento());
        this.empleado.setNumeroDocumento(empleado.getNumeroDocumento());
        this.empleado.setTelefonoCelular(empleado.getTelefonoCelular());
        this.usuario.setIdUsuario(empleado.getIdUsuario().getIdUsuario());
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    /**
     * @return the cargofacade
     */
    public CargoFacade getCargoFacade() {
        return cargoFacade;
    }

    /**
     * @param cargofacade the cargofacade to set
     */
    public void setCargoFacade(CargoFacade cargofacade) {
        this.cargoFacade = cargofacade;
    }

    /**
     * @return the documentofacade
     */
    public DocumentoFacade getDocumentoFacade() {
        return documentoFacade;
    }

    /**
     * @param documentoFacade the documentofacade to set
     */
    public void setDocumentoFacade(DocumentoFacade documentoFacade) {
        this.documentoFacade = documentoFacade;
    }

    /**
     * @return the usuariofacade
     */
    public UsuarioFacade getUsuarioFacade() {
        return usuarioFacade;
    }

    /**
     * @param usuarioFacade the usuariofacade to set
     */
    public void setUsuarioFacade(UsuarioFacade usuarioFacade) {
        this.usuarioFacade = usuarioFacade;
    }

    /**
     * @return the cargo
     */
    public Cargo getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the documento
     */
    public Documento getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the empleado
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * @param empleado the empleado to set
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
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

    /**
     * @return the empleadofacade
     */
    public EmpleadoFacade getEmpleadoFacade() {
        return empleadoFacade;
    }

    /**
     * @param empleadofacade the empleadofacade to set
     */
    public void setEmpleadoFacade(EmpleadoFacade empleadofacade) {
        this.empleadoFacade = empleadofacade;
    }
}
