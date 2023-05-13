package Model;

import Model.Cargo;
import Model.Documento;
import Model.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-04-03T17:34:16")
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile SingularAttribute<Empleado, String> telefonoCelular;
    public static volatile SingularAttribute<Empleado, Cargo> idCargo;
    public static volatile SingularAttribute<Empleado, Integer> idEmpleado;
    public static volatile SingularAttribute<Empleado, String> apellidoEmpleado;
    public static volatile SingularAttribute<Empleado, Documento> idtipoDocumento;
    public static volatile SingularAttribute<Empleado, Usuario> idUsuario;
    public static volatile SingularAttribute<Empleado, String> numeroDocumento;
    public static volatile SingularAttribute<Empleado, String> nombreEmpleado;
    public static volatile SingularAttribute<Empleado, String> correoElectronico;

}