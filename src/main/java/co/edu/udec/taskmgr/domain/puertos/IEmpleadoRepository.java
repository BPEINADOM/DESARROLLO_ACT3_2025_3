package co.edu.udec.taskmgr.domain.puertos;

import java.util.List;

import co.edu.udec.taskmgr.domain.entidades.Empleado;

public interface IEmpleadoRepository {

    void crearEmpleado(Empleado empleado);
    Empleado consultarporID(int empleado_id);
    List<Empleado> consultarTodos();
    Empleado actualizarEmpleado(Empleado empleado);
    void eliminarEmpleado(int empleado_id);

}
