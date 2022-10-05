package modelo;

public final class Fruta extends Producto{
    
    private String unidad;

    public Fruta() {
    }

    public Fruta(String nombre, int precio, String unidad) {
        super.nombre = nombre;
        super.precio = precio;
        this.unidad = unidad;
    }

    public String getUnidad() {
        return this.unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " /// Precio: $" + getPrecio() + " /// Unidad de venta: " + getUnidad();
    }


}
