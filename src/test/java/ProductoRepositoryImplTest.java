import co.edu.udec.taskmgr.domain.entidades.Producto;
import co.edu.udec.taskmgr.domain.puertos.ProductoRepository;
import co.edu.udec.taskmgr.infrastructure.repository.ProductoRepositoryImpl;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class ProductoRepositoryImplTest {

    private ProductoRepository repo;

    @Before
    public void setUp() {
        repo = new ProductoRepositoryImpl();
    }

    @Test
    public void testCrearProducto() {
        // Arrange
        Producto prod = new Producto(1, "P001", "Borrador");

        // Act
        repo.crear(prod);

        // Assert
        Producto resultado = repo.consultarPorId(1);
        assertNotNull(resultado);
        assertEquals("P001", resultado.getCodigo());
        assertEquals("Borrador", resultado.getDescripcion());
    }

    @Test
    public void testConsultarTodos() {
        // Arrange
        repo.crear(new Producto(1, "P001", "Borrador"));
        repo.crear(new Producto(2, "P002", "Lapicero"));

        // Act
        List<Producto> productos = repo.consultarTodos();

        // Assert
        assertEquals(2, productos.size());
        // Puedes validar más si lo necesitas:
        assertEquals("P001", productos.get(0).getCodigo());
        assertEquals("Lapicero", productos.get(1).getDescripcion());
    }

    @Test
    public void testActualizarProducto() {
        // Arrange
        Producto prod = new Producto(1, "P001", "Borrador");
        repo.crear(prod);
        Producto prodMod = new Producto(1, "P001", "Borrador Blanco");

        // Act
        repo.actualizar(prodMod);

        // Assert
        Producto resultado = repo.consultarPorId(1);
        assertEquals("Borrador Blanco", resultado.getDescripcion());
    }

    @Test
    public void testEliminarProducto() {
        // Arrange
        repo.crear(new Producto(1, "P001", "Borrador"));

        // Act
        repo.eliminar(1);

        // Assert
        Producto resultado = repo.consultarPorId(1);
        assertNull(resultado);
    }
}
