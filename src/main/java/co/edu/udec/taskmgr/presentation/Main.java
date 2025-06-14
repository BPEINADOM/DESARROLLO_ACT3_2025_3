package co.edu.udec.taskmgr.presentation;

import co.edu.udec.taskmgr.domain.entidades.Producto;
import co.edu.udec.taskmgr.domain.puertos.ProductoRepository;
import co.edu.udec.taskmgr.infrastructure.repository.ProductoRepositoryImpl;

public class Main {
    public static void main(String[] args) {
        ProductoRepository repo = new ProductoRepositoryImpl();

        Producto prod1 = new Producto(1, "P001", "Borrador");
        Producto prod2 = new Producto(2, "P002", "Lapicero");
        repo.crear(prod1);
        repo.crear(prod2);

        System.out.println ("Lista de productos:");
        for (Producto p : repo.consultarTodos()) {
            System.out.println(p.getProducto_id() + " - " + p.getDescripcion());
        }

        Producto buscado = repo.consultarPorId(1);
        System.out.println("Buscado: " + buscado.getDescripcion());

        Producto prod1mod = new Producto(1, "P001", "Borrador Blanco");
        repo.actualizar(prod1mod);
        System.out.println("Actualizado: " + repo.consultarPorId(1).getDescripcion());

        repo.eliminar(2);
        System.out.println ("Lista de productos:");
        for (Producto p : repo.consultarTodos()) {
            System.out.println(p.getProducto_id() + " - " + p.getDescripcion());
        }
    }
}