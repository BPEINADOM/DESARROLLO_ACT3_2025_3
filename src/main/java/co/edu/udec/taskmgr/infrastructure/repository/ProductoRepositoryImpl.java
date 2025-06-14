package co.edu.udec.taskmgr.infrastructure.repository;

import co.edu.udec.taskmgr.domain.entidades.Producto;
import co.edu.udec.taskmgr.domain.puertos.ProductoRepository;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepositoryImpl implements ProductoRepository {
    private List<Producto> productos = new ArrayList<>();

    @Override
    public void crear(Producto producto) {
        productos.add(producto);
    }

    @Override
    public Producto consultarPorId(int id) {
        for (Producto p : productos) {
            if (p.getProducto_id() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Producto> consultarTodos() {
        return productos;
    }

    @Override
    public void actualizar(Producto producto) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getProducto_id() == producto.getProducto_id()) {
                productos.set(i, producto);
                break;
            }
        }
    }

    @Override
    public void eliminar(int id) {
        productos.removeIf(p -> p.getProducto_id() == id);
    }
}