package servicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import modelo.Producto;

public class ProductoServicio {
    
    private List<Producto> productos;

    public ProductoServicio(){
        productos = new ArrayList<>();
    }

    public void cargarProductos(Producto... productos){
        this.productos.addAll(Arrays.asList(productos));
    }

    public void imprimirProductos(){
        productos.forEach(System.out::println);
        System.out.println("=============================");
        ordenarPorPrecio();
        System.out.println("Producto más caro: " + productos.get(0).getNombre());
        System.out.println("Producto más barato: " + productos.get(productos.size() - 1).getNombre());        
    }

    private void ordenarPorPrecio(){
        Collections.sort(this.productos);
    }
     
}
