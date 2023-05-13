package Model;

import Model.Cliente;
import Model.Producto;
import Model.Recibo;
import Model.Tiposdepago;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-04-03T17:34:16")
@StaticMetamodel(Ventas.class)
public class Ventas_ { 

    public static volatile SingularAttribute<Ventas, Date> fecha;
    public static volatile SingularAttribute<Ventas, Cliente> idCliente;
    public static volatile ListAttribute<Ventas, Recibo> reciboList;
    public static volatile SingularAttribute<Ventas, Integer> unidades;
    public static volatile SingularAttribute<Ventas, Tiposdepago> idtipoPago;
    public static volatile SingularAttribute<Ventas, Producto> idProducto;
    public static volatile SingularAttribute<Ventas, Integer> precioTotal;
    public static volatile SingularAttribute<Ventas, Integer> idVenta;
    public static volatile SingularAttribute<Ventas, Integer> puntosCompra;

}