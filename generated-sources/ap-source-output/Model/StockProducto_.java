package Model;

import Model.Producto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-04-03T17:34:16")
@StaticMetamodel(StockProducto.class)
public class StockProducto_ { 

    public static volatile SingularAttribute<StockProducto, String> unidadesVendidas;
    public static volatile SingularAttribute<StockProducto, Integer> idStockProducto;
    public static volatile SingularAttribute<StockProducto, Date> fechaSalida;
    public static volatile SingularAttribute<StockProducto, Date> fechaEntrada;
    public static volatile SingularAttribute<StockProducto, Integer> cantidad;
    public static volatile SingularAttribute<StockProducto, Producto> idProducto;

}