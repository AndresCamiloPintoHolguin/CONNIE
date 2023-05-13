/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Controller;

import Model.Documento;
import Services.DocumentoFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author camil
 */
@Named(value = "documentoController")
@SessionScoped
public class DocumentoController implements Serializable {

    
    @EJB
    private DocumentoFacade documentofacade;
    
    private Documento documento = new Documento();
   
    public DocumentoController() {
    }
    
    public List<Documento> getALLDocumento(){
        return documentofacade.findAll();
    }

    /**
     * @return the documentofacade
     */
    public DocumentoFacade getDocumentofacade() {
        return documentofacade;
    }

    /**
     * @param documentofacade the documentofacade to set
     */
    public void setDocumentofacade(DocumentoFacade documentofacade) {
        this.documentofacade = documentofacade;
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
