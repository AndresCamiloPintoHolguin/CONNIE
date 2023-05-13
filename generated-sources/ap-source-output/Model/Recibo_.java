package Model;

import Model.Estadosrecibo;
import Model.Ventas;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-04-03T17:34:16")
@StaticMetamodel(Recibo.class)
public class Recibo_ { 

    public static volatile SingularAttribute<Recibo, Date> fecha;
    public static volatile SingularAttribute<Recibo, Integer> idRecibo;
    public static volatile SingularAttribute<Recibo, Estadosrecibo> idestadoRecibo;
    public static volatile SingularAttribute<Recibo, String> direccion;
    public static volatile SingularAttribute<Recibo, Ventas> idVenta;

}