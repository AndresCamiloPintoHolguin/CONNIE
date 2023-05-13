package Model;

import Model.Cliente;
import Model.Servicios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-04-03T17:34:16")
@StaticMetamodel(Calificacion.class)
public class Calificacion_ { 

    public static volatile SingularAttribute<Calificacion, Date> fecha;
    public static volatile SingularAttribute<Calificacion, Integer> puntaje;
    public static volatile SingularAttribute<Calificacion, Cliente> idCliente;
    public static volatile SingularAttribute<Calificacion, Integer> idCalificacion;
    public static volatile SingularAttribute<Calificacion, Servicios> idServicio;
    public static volatile SingularAttribute<Calificacion, String> comentarios;

}