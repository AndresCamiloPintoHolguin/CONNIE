package Model;

import Model.Producto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-04-03T17:34:16")
@StaticMetamodel(Compras.class)
public class Compras_ { 

    public static volatile SingularAttribute<Compras, Date> fecha;
    public static volatile SingularAttribute<Compras, Integer> precio;
    public static volatile SingularAttribute<Compras, Integer> idCompra;
    public static volatile SingularAttribute<Compras, Integer> cantidad;
    public static volatile SingularAttribute<Compras, Producto> idProducto;

}