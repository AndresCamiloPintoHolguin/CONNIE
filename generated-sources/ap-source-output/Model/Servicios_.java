package Model;

import Model.Calificacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-04-03T17:34:16")
@StaticMetamodel(Servicios.class)
public class Servicios_ { 

    public static volatile SingularAttribute<Servicios, String> nombreServicio;
    public static volatile SingularAttribute<Servicios, Integer> idServicio;
    public static volatile ListAttribute<Servicios, Calificacion> calificacionList;

}