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
@Table(name = "tiposdepago")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tiposdepago.findAll", query = "SELECT t FROM Tiposdepago t"),
    @NamedQuery(name = "Tiposdepago.findByIdtipoPago", query = "SELECT t FROM Tiposdepago t WHERE t.idtipoPago = :idtipoPago"),
    @NamedQuery(name = "Tiposdepago.findByTipoDePago", query = "SELECT t FROM Tiposdepago t WHERE t.tipoDePago = :tipoDePago")})
public class Tiposdepago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipoPago")
    private Integer idtipoPago;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "tipo_de_pago")
    private String tipoDePago;
    @OneToMany(mappedBy = "idtipoPago", fetch = FetchType.LAZY)
    private List<Ventas> ventasList;

    public Tiposdepago() {
    }

    public Tiposdepago(Integer idtipoPago) {
        this.idtipoPago = idtipoPago;
    }

    public Tiposdepago(Integer idtipoPago, String tipoDePago) {
        this.idtipoPago = idtipoPago;
        this.tipoDePago = tipoDePago;
    }

    public Integer getIdtipoPago() {
        return idtipoPago;
    }

    public void setIdtipoPago(Integer idtipoPago) {
        this.idtipoPago = idtipoPago;
    }

    public String getTipoDePago() {
        return tipoDePago;
    }

    public void setTipoDePago(String tipoDePago) {
        this.tipoDePago = tipoDePago;
    }

    @XmlTransient
    public List<Ventas> getVentasList() {
        return ventasList;
    }

    public void setVentasList(List<Ventas> ventasList) {
        this.ventasList = ventasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoPago != null ? idtipoPago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiposdepago)) {
            return false;
        }
        Tiposdepago other = (Tiposdepago) object;
        if ((this.idtipoPago == null && other.idtipoPago != null) || (this.idtipoPago != null && !this.idtipoPago.equals(other.idtipoPago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Tiposdepago[ idtipoPago=" + idtipoPago + " ]";
    }
    
}
