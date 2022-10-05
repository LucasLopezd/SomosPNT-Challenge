import modelo.Fruta;
import modelo.Gaseosa;
import modelo.Producto;
import modelo.Shampoo;
import servicio.ProductoServicio;

public class SomosPNT {

    public static void main(String[] args) throws Exception {
        
        ProductoServicio servicio = new ProductoServicio();

        Producto cocaZero = new Gaseosa("Coca-Cola Zero", 20, 1.5);
        Producto coca = new Gaseosa("Coca-Cola", 18, 1.5);
        Producto shampoo = new Shampoo("Shampoo Sedal", 19, "500ml");
        Producto frutilla = new Fruta("Frutillas", 64, "kilo");

        servicio.cargarProductos(cocaZero, coca, shampoo, frutilla);

        servicio.imprimirProductos();
    }
}
