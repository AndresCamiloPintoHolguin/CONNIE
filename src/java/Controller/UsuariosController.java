/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Controller;

import Model.Rolusuario;
import Model.Usuario;
import Services.RolusuarioFacade;
import Services.UsuarioFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author camil
 */
@Named(value = "usuariosController")
@SessionScoped
public class UsuariosController implements Serializable {

    @EJB
    private RolusuarioFacade rolFacade;
    @EJB
    private UsuarioFacade usuarioFacade;

    private String message;
    private Usuario user = new Usuario();
    private Rolusuario rol;

    public UsuariosController() {
         rol= new Rolusuario();
    }

        public List<Usuario>getALLUsuario(){
        return usuarioFacade.findAll();
    }
    
    
    public void createusuario(){
     
        this.user.setIdrolUsuario(rolFacade.find(rol.getIdrolUsuario()));
        usuarioFacade.create(user);
        
    }
    
    public void update(){
        this.user.setIdrolUsuario(rolFacade.find(rol.getIdrolUsuario()));
        usuarioFacade.edit(user);
        message="se actualizo correctamente";
        
    }
    
    public void delete(Usuario usuario){     
        usuarioFacade.remove(usuario);        
    }
       
    public void CargarDatosUsuarios(Usuario usser){
        this.rol.setIdrolUsuario(rol.getIdrolUsuario());
        this.user = usser;
    } 
   
    /**
     * @return the rolFacade
     */
    public RolusuarioFacade getRolFacade() {
        return rolFacade;
    }

    /**
     * @param rolFacade the rolFacade to set
     */
    public void setRolFacade(RolusuarioFacade rolFacade) {
        this.rolFacade = rolFacade;
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
     * @return the user
     */
    public Usuario getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(Usuario user) {
        this.user = user;
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
    
    public String validar(){
        String ruta = "";
        Usuario valor;
        try {
            valor = this.usuarioFacade.acceder(this.user);                
            if(valor != null){
                ruta = redireccionarUsuario(valor.getIdrolUsuario().getIdrolUsuario());   
            }
            else{
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Usuario no registrado","Admin"));
            }
        } catch (Exception e) {
            throw e;
        }
        return ruta;
    }
    
    public String redireccionarUsuario(int rol){
        switch(rol){
            case 1:
                return "indexP";
            case 2:
                return "index";
            case 3:
                return "login";
            default:
                return "login";
        }
    }

}
