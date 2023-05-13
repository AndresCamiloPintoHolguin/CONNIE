/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author camil
 */
@Entity
@Table(name = "stock_producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StockProducto.findAll", query = "SELECT s FROM StockProducto s"),
    @NamedQuery(name = "StockProducto.findByIdStockProducto", query = "SELECT s FROM StockProducto s WHERE s.idStockProducto = :idStockProducto"),
    @NamedQuery(name = "StockProducto.findByFechaEntrada", query = "SELECT s FROM StockProducto s WHERE s.fechaEntrada = :fechaEntrada"),
    @NamedQuery(name = "StockProducto.findByCantidad", query = "SELECT s FROM StockProducto s WHERE s.cantidad = :cantidad"),
    @NamedQuery(name = "StockProducto.findByFechaSalida", query = "SELECT s FROM StockProducto s WHERE s.fechaSalida = :fechaSalida"),
    @NamedQuery(name = "StockProducto.findByUnidadesVendidas", query = "SELECT s FROM StockProducto s WHERE s.unidadesVendidas = :unidadesVendidas")})
public class StockProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_stock_producto")
    private Integer idStockProducto;
    @Column(name = "fecha_entrada")
    @Temporal(TemporalType.DATE)
    private Date fechaEntrada;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Column(name = "fecha_salida")
    @Temporal(TemporalType.DATE)
    private Date fechaSalida;
    @Size(max = 45)
    @Column(name = "unidades_vendidas")
    private String unidadesVendidas;
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Producto idProducto;

    public StockProducto() {
    }

    public StockProducto(Integer idStockProducto) {
        this.idStockProducto = idStockProducto;
    }

    public StockProducto(Integer idStockProducto, int cantidad) {
        this.idStockProducto = idStockProducto;
        this.cantidad = cantidad;
    }

    public Integer getIdStockProducto() {
        return idStockProducto;
    }

    public void setIdStockProducto(Integer idStockProducto) {
        this.idStockProducto = idStockProducto;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public void setUnidadesVendidas(String unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idStockProducto != null ? idStockProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StockProducto)) {
            return false;
        }
        StockProducto other = (StockProducto) object;
        if ((this.idStockProducto == null && other.idStockProducto != null) || (this.idStockProducto != null && !this.idStockProducto.equals(other.idStockProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.StockProducto[ idStockProducto=" + idStockProducto + " ]";
    }
    
}
