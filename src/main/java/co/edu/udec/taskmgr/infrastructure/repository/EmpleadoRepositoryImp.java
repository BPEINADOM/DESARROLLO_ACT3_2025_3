package co.edu.udec.taskmgr.infrastructure.repository;

import java.util.ArrayList;
import java.util.List;

import co.edu.udec.taskmgr.domain.entidades.Empleado;
import co.edu.udec.taskmgr.domain.puertos.IEmpleadoRepository;

public class EmpleadoRepositoryImp implements IEmpleadoRepository{
    private List<Empleado> empleados = new ArrayList<>();

    @Override
    public void crearEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    @Override
    public Empleado consultarporID(int empleado_id) {
        for (Empleado empleado : empleados) {
            if (empleado.getEmpleado_id() == empleado_id) {
                return empleado;
            }
        }
        return null;
    }

    @Override
    public List<Empleado> listarTodos() {
        return new ArrayList<>(empleados);
    }

    @Override
    public Empleado actualizarEmpleado(Empleado empleado) {
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getEmpleado_id() == empleado.getEmpleado_id()) {
                empleados.set(i, empleado);
                
                return empleado;
            }
        }

        return null;
    }

    @Override
    public void eliminarEmpleado(int empleado_id) {
        empleados.removeIf(empleados -> empleados.getEmpleado_id() == empleado_id);
    }

    


}
