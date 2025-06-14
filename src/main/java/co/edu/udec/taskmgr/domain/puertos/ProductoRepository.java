package co.edu.udec.taskmgr.domain.puertos;

import co.edu.udec.taskmgr.domain.entidades.Producto;
import java.util.List;

public interface ProductoRepository {
    void crear(Producto producto);
    Producto consultarPorId(int id);
    List<Producto> consultarTodos();
    void actualizar(Producto producto);
    void eliminar(int id);
}
