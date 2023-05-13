/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Model.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * 
 * @author camil
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> {

    @PersistenceContext(unitName = "CONNIE_PROYECTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    } 
    
    public Usuario acceder(Usuario us){
        Usuario usuario = null;
        String consulta = "";
        try{
            consulta = "select u from Usuario u where u.nombreUsuario=?1 and u.contraseña=?2";
            Query query = em.createQuery(consulta);
            query.setParameter(1, us.getNombreUsuario());
            query.setParameter(2, us.getContraseña());
            List<Usuario> lista = query.getResultList();
            if(!lista.isEmpty()){
                usuario = lista.get(0);
            }
            
        }catch(Exception e){
            throw e;
        }
        return usuario;
    }
    
}
