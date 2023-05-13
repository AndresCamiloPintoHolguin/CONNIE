package Model;

import Model.Cliente;
import Model.Empleado;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-04-03T17:34:16")
@StaticMetamodel(Documento.class)
public class Documento_ { 

    public static volatile ListAttribute<Documento, Cliente> clienteList;
    public static volatile SingularAttribute<Documento, String> nombreDocumento;
    public static volatile SingularAttribute<Documento, Integer> idtipoDocumento;
    public static volatile ListAttribute<Documento, Empleado> empleadoList;

}