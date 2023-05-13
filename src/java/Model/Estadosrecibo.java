/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "estadosrecibo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estadosrecibo.findAll", query = "SELECT e FROM Estadosrecibo e"),
    @NamedQuery(name = "Estadosrecibo.findByIdestadoRecibo", query = "SELECT e FROM Estadosrecibo e WHERE e.idestadoRecibo = :idestadoRecibo"),
    @NamedQuery(name = "Estadosrecibo.findByNombreestadoRecibo", query = "SELECT e FROM Estadosrecibo e WHERE e.nombreestadoRecibo = :nombreestadoRecibo")})
public class Estadosrecibo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_estadoRecibo")
    private Integer idestadoRecibo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre_estadoRecibo")
    private String nombreestadoRecibo;
    @OneToMany(mappedBy = "idestadoRecibo", fetch = FetchType.LAZY)
    private List<Recibo> reciboList;

    public Estadosrecibo() {
    }

    public Estadosrecibo(Integer idestadoRecibo) {
        this.idestadoRecibo = idestadoRecibo;
    }

    public Estadosrecibo(Integer idestadoRecibo, String nombreestadoRecibo) {
        this.idestadoRecibo = idestadoRecibo;
        this.nombreestadoRecibo = nombreestadoRecibo;
    }

    public Integer getIdestadoRecibo() {
        return idestadoRecibo;
    }

    public void setIdestadoRecibo(Integer idestadoRecibo) {
        this.idestadoRecibo = idestadoRecibo;
    }

    public String getNombreestadoRecibo() {
        return nombreestadoRecibo;
    }

    public void setNombreestadoRecibo(String nombreestadoRecibo) {
        this.nombreestadoRecibo = nombreestadoRecibo;
    }

    @XmlTransient
    public List<Recibo> getReciboList() {
        return reciboList;
    }

    public void setReciboList(List<Recibo> reciboList) {
        this.reciboList = reciboList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idestadoRecibo != null ? idestadoRecibo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estadosrecibo)) {
            return false;
        }
        Estadosrecibo other = (Estadosrecibo) object;
        if ((this.idestadoRecibo == null && other.idestadoRecibo != null) || (this.idestadoRecibo != null && !this.idestadoRecibo.equals(other.idestadoRecibo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Estadosrecibo[ idestadoRecibo=" + idestadoRecibo + " ]";
    }
    
}
