/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author camil
 */
@Entity
@Table(name = "rolusuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rolusuario.findAll", query = "SELECT r FROM Rolusuario r"),
    @NamedQuery(name = "Rolusuario.findByIdrolUsuario", query = "SELECT r FROM Rolusuario r WHERE r.idrolUsuario = :idrolUsuario"),
    @NamedQuery(name = "Rolusuario.findByNombreRol", query = "SELECT r FROM Rolusuario r WHERE r.nombreRol = :nombreRol")})
public class Rolusuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_rolUsuario")
    private Integer idrolUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre_rol")
    private String nombreRol;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idrolUsuario", fetch = FetchType.LAZY)
    private List<Usuario> usuarioList;

    public Rolusuario() {
    }

    public Rolusuario(Integer idrolUsuario) {
        this.idrolUsuario = idrolUsuario;
    }

    public Rolusuario(Integer idrolUsuario, String nombreRol) {
        this.idrolUsuario = idrolUsuario;
        this.nombreRol = nombreRol;
    }

    public Integer getIdrolUsuario() {
        return idrolUsuario;
    }

    public void setIdrolUsuario(Integer idrolUsuario) {
        this.idrolUsuario = idrolUsuario;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    @XmlTransient
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrolUsuario != null ? idrolUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rolusuario)) {
            return false;
        }
        Rolusuario other = (Rolusuario) object;
        if ((this.idrolUsuario == null && other.idrolUsuario != null) || (this.idrolUsuario != null && !this.idrolUsuario.equals(other.idrolUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Rolusuario[ idrolUsuario=" + idrolUsuario + " ]";
    }
    
}
