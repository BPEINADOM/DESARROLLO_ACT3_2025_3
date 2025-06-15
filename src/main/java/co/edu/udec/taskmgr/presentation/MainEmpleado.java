package co.edu.udec.taskmgr.presentation;

import co.edu.udec.taskmgr.domain.entidades.Empleado;
import co.edu.udec.taskmgr.domain.puertos.IEmpleadoRepository;
import co.edu.udec.taskmgr.infrastructure.repository.EmpleadoRepositoryImp;


public class MainEmpleado {

    public static void main(String[] args) {
        
        IEmpleadoRepository repository = new EmpleadoRepositoryImp();

        Empleado empleado1 = new Empleado(1, "CC", "101001001", "Luis", "Garcia", "luis.garcia@mail.com", "3103101001");
        Empleado empleado2 = new Empleado(2, "CC", "101001002", "Mariana", "Torres", "mariana.torres@mail.com", "3103101002");

        repository.crearEmpleado(empleado1);
        repository.crearEmpleado(empleado2);

        System.out.println("---------- Lista de Empleados ----------");
        for (Empleado empleado : repository.listarTodos()) {
            System.out.println("----------------------------------------");
            System.out.println("- ID: " + empleado.getEmpleado_id());
            System.out.println("- Tipo de documento: " + empleado.getTipo_documento());
            System.out.println("- Numero de documento: " + empleado.getNumero_documento());
            System.out.println("- Nombres: " + empleado.getNombres());
            System.out.println("- Apellidos: " + empleado.getApellidos());
            System.out.println("- Correo: " + empleado.getCorreo());
            System.out.println("- Numero: " + empleado.getNumero_telefono());

        }

        Empleado consulta = repository.consultarporID(2);
        System.out.println("---------- Consulta ----------");
        System.out.println("- " + consulta.getCorreo());

        Empleado actualizado = new Empleado(2, "CC", "101001002", "Mariana", "Torres", "marianatorres@gmail.com", "3103101002");
        repository.actualizarEmpleado(actualizado);
        System.out.println("---------- Actualizar ---------");
        System.out.println("- " + actualizado.getCorreo());

        repository.eliminarEmpleado(1);
        System.out.println("---------- Lista de Empleados ----------");
        for (Empleado empleado : repository.listarTodos()) {
            System.out.println("----------------------------------------");
            System.out.println("- ID: " + empleado.getEmpleado_id());
            System.out.println("- Tipo de documento: " + empleado.getTipo_documento());
            System.out.println("- Numero de documento: " + empleado.getNumero_documento());
            System.out.println("- Nombres: " + empleado.getNombres());
            System.out.println("- Apellidos: " + empleado.getApellidos());
            System.out.println("- Correo: " + empleado.getCorreo());
            System.out.println("- Numero: " + empleado.getNumero_telefono());

        }
    }
}
