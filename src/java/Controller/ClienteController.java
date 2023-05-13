/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Controller;

import Model.Cliente;
import Model.Documento;
import Model.Usuario;
import Services.ClienteFacade;
import Services.DocumentoFacade;
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
@Named(value = "clienteController")
@SessionScoped
public class ClienteController implements Serializable {

    
//  primero que todo importamos los facade de las clases que usaremos y le agregamos una variable para llamarlas
    @EJB
    private UsuarioFacade usuarioFacade;
    @EJB
    private ClienteFacade clienteFacade;
    @EJB
    private DocumentoFacade documentoFacade;
    ///////////////////////////////////////// 
    
    //    creamos un nuevo objeto de cliente
    private Cliente cliente = new Cliente();
    private Usuario usuario;
    private Documento documento;
    ///////////////////////////////////
   
 
    // creamos un constructor vacio
    public ClienteController() {
         usuario = new Usuario();
        documento = new Documento();   
    }

    
    //   metodo listar ventas
//    creamos un public List y adentro le ponemos la clase que va a listar 
//    despues le agragamos el metodo de getALL y la clase ventas para que nos liste todo lo que alla en ventas
//    agregamos un return y el facade de ventas con el metodo findall
    public List<Cliente>getAllClientes() {
        return clienteFacade.findAll();
    }
    ///////////////////////////////////
    
    
    
//    metodo guardar 
    
    public void guardarCliente(){
        cliente.setIdUsuario(usuarioFacade.find(usuario.getIdUsuario()));
        cliente.setIdtipoDocumento(documentoFacade.find(documento.getIdtipoDocumento()));
        clienteFacade.create(cliente);
        
    }
   
/////////////////////
    
    
    
    public void eliminarCliente(Cliente cliente){
        clienteFacade.remove(cliente);
    }
    
    
    
    
    
     public void mostrarDatosCliente(Cliente cliente){
        this.cliente.setIdCliente(cliente.getIdCliente());
        this.cliente.setNombreCliente(cliente.getNombreCliente());
        this.cliente.setApellidoCliente(cliente.getApellidoCliente());
        this.cliente.setCorreoElectronico(cliente.getCorreoElectronico());
        this.documento.setIdtipoDocumento(cliente.getIdtipoDocumento().getIdtipoDocumento());
        this.usuario.setIdUsuario(cliente.getIdUsuario().getIdUsuario());
        this.cliente.setNumeroDocumento(cliente.getNumeroDocumento());
        this.cliente.setTelefonoCelular(cliente.getTelefonoCelular());
    }
     
     
       public void editarCliente(){
        cliente.setIdUsuario(usuarioFacade.find(usuario.getIdUsuario()));
        cliente.setIdtipoDocumento(documentoFacade.find(documento.getIdtipoDocumento()));
        clienteFacade.edit(cliente);
    }
    
//    invocamos los geters and seters

    
    
    
    /**
     * @return the usuarioFacade
     */
    public UsuarioFacade getUsuarioFacade() {
        return usuarioFacade;
    }

    /**
     * @param usuarioFacade the usuarioFacade to set
     */
    public void setUsuarioFacade(UsuarioFacade usuarioFacade) {
        this.usuarioFacade = usuarioFacade;
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
     * @return the documentoFacade
     */
    public DocumentoFacade getDocumentoFacade() {
        return documentoFacade;
    }

    /**
     * @param documentoFacade the documentoFacade to set
     */
    public void setDocumentoFacade(DocumentoFacade documentoFacade) {
        this.documentoFacade = documentoFacade;
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
    
    
    
    
    
}
