package Model;

import Model.Colores;
import Model.Compras;
import Model.StockProducto;
import Model.Ventas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-04-03T17:34:16")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, Integer> precio;
    public static volatile ListAttribute<Producto, StockProducto> stockProductoList;
    public static volatile SingularAttribute<Producto, String> talla;
    public static volatile ListAttribute<Producto, Compras> comprasList;
    public static volatile SingularAttribute<Producto, String> imagen;
    public static volatile ListAttribute<Producto, Ventas> ventasList;
    public static volatile SingularAttribute<Producto, Integer> idProducto;
    public static volatile SingularAttribute<Producto, String> nombreProducto;
    public static volatile SingularAttribute<Producto, Colores> idColor;

}