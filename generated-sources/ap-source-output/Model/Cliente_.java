package Model;

import Model.Calificacion;
import Model.Documento;
import Model.Pqrs;
import Model.Usuario;
import Model.Ventas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-04-03T17:34:16")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> telefonoCelular;
    public static volatile SingularAttribute<Cliente, Integer> idCliente;
    public static volatile SingularAttribute<Cliente, String> nombreCliente;
    public static volatile ListAttribute<Cliente, Pqrs> pqrsList;
    public static volatile SingularAttribute<Cliente, String> apellidoCliente;
    public static volatile SingularAttribute<Cliente, Documento> idtipoDocumento;
    public static volatile SingularAttribute<Cliente, Usuario> idUsuario;
    public static volatile ListAttribute<Cliente, Ventas> ventasList;
    public static volatile SingularAttribute<Cliente, String> numeroDocumento;
    public static volatile ListAttribute<Cliente, Calificacion> calificacionList;
    public static volatile SingularAttribute<Cliente, String> correoElectronico;

}