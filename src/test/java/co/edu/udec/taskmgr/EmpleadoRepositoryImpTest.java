package co.edu.udec.taskmgr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import co.edu.udec.taskmgr.domain.entidades.Empleado;
import co.edu.udec.taskmgr.domain.puertos.IEmpleadoRepository;
import co.edu.udec.taskmgr.infrastructure.repository.EmpleadoRepositoryImp;

public class EmpleadoRepositoryImpTest {

    private IEmpleadoRepository repository;

    @Before
    public void setUp() {
        repository = new EmpleadoRepositoryImp();
    }

    @Test
    public void testCrearEmpleado() {

        // Arrange 
        Empleado empleado = new Empleado(1, "CC", "101001001", "Luis", "Garcia", "luis.garcia@mail.com", "3103101001");

        // Act
        repository.crearEmpleado(empleado);
        repository.listarTodos();

        // Assert
        Empleado datos = repository.consultarporID(1);
        assertNotNull(datos);
        assertEquals("CC", datos.getTipo_documento());
        assertEquals("101001001", datos.getNumero_documento());
        assertEquals("Luis", datos.getNombres());
        assertEquals("Garcia", datos.getApellidos());
        assertEquals("luis.garcia@mail.com", datos.getCorreo());
        assertEquals("3103101001", datos.getNumero_telefono());

    }

    @Test
    public void testListarTodos() {

        // Arrange 
        repository.crearEmpleado(new Empleado(1, "CC", "101001001", "Luis", "Garcia", "luis.garcia@mail.com", "3103101001"));
        repository.crearEmpleado(new Empleado(2, "CC", "101001002", "Mariana", "Torres", "mariana.torres@mail.com", "3103101002"));

        // Act
        List<Empleado> empleados = repository.listarTodos();

        // Assert
        assertEquals(2, empleados.size());

    }

    @Test
    public void testActualizarEmpleado() {

        // Arrange
        Empleado empleado = new Empleado(1, "CC", "101001001", "Luis", "Garcia", "luis.garcia@mail.com", "3103101001");
        repository.crearEmpleado(empleado);
        Empleado mod = new Empleado(1, "CC", "101001001", "Luis", "Garcia", "luisgarcia@gmail.com", "3103101001");

        // Act
        repository.actualizarEmpleado(mod);

        // Assert
        Empleado datos = repository.consultarporID(1);
        assertEquals("luisgarcia@gmail.com", datos.getCorreo());

    }

    @Test
    public void testEliminarEmpleado() {

        // Arrange
        repository.crearEmpleado(new Empleado(1, "CC", "101001001", "Luis", "Garcia", "luis.garcia@mail.com", "3103101001"));

        // Act
        repository.eliminarEmpleado(1);

        // Assert
        Empleado datos = repository.consultarporID(1);
        assertNull(datos);

    }


}
