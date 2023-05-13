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
@Table(name = "estado_pqrs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoPqrs.findAll", query = "SELECT e FROM EstadoPqrs e"),
    @NamedQuery(name = "EstadoPqrs.findByIdestadoPqrs", query = "SELECT e FROM EstadoPqrs e WHERE e.idestadoPqrs = :idestadoPqrs"),
    @NamedQuery(name = "EstadoPqrs.findByNombreestadoPqrs", query = "SELECT e FROM EstadoPqrs e WHERE e.nombreestadoPqrs = :nombreestadoPqrs")})
public class EstadoPqrs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_estadoPqrs")
    private Integer idestadoPqrs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre_estadoPqrs")
    private String nombreestadoPqrs;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idestadoPqrs", fetch = FetchType.LAZY)
    private List<Pqrs> pqrsList;

    public EstadoPqrs() {
    }

    public EstadoPqrs(Integer idestadoPqrs) {
        this.idestadoPqrs = idestadoPqrs;
    }

    public EstadoPqrs(Integer idestadoPqrs, String nombreestadoPqrs) {
        this.idestadoPqrs = idestadoPqrs;
        this.nombreestadoPqrs = nombreestadoPqrs;
    }

    public Integer getIdestadoPqrs() {
        return idestadoPqrs;
    }

    public void setIdestadoPqrs(Integer idestadoPqrs) {
        this.idestadoPqrs = idestadoPqrs;
    }

    public String getNombreestadoPqrs() {
        return nombreestadoPqrs;
    }

    public void setNombreestadoPqrs(String nombreestadoPqrs) {
        this.nombreestadoPqrs = nombreestadoPqrs;
    }

    @XmlTransient
    public List<Pqrs> getPqrsList() {
        return pqrsList;
    }

    public void setPqrsList(List<Pqrs> pqrsList) {
        this.pqrsList = pqrsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idestadoPqrs != null ? idestadoPqrs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoPqrs)) {
            return false;
        }
        EstadoPqrs other = (EstadoPqrs) object;
        if ((this.idestadoPqrs == null && other.idestadoPqrs != null) || (this.idestadoPqrs != null && !this.idestadoPqrs.equals(other.idestadoPqrs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.EstadoPqrs[ idestadoPqrs=" + idestadoPqrs + " ]";
    }
    
}
