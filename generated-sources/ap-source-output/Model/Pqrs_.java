package Model;

import Model.Cliente;
import Model.EstadoPqrs;
import Model.Prioridad;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-04-03T17:34:16")
@StaticMetamodel(Pqrs.class)
public class Pqrs_ { 

    public static volatile SingularAttribute<Pqrs, String> descripcion;
    public static volatile SingularAttribute<Pqrs, Date> fecha;
    public static volatile SingularAttribute<Pqrs, Cliente> idCliente;
    public static volatile SingularAttribute<Pqrs, EstadoPqrs> idestadoPqrs;
    public static volatile SingularAttribute<Pqrs, Integer> idSolicitud;
    public static volatile SingularAttribute<Pqrs, Prioridad> idPrioridad;

}