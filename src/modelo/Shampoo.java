package modelo;

public final class Shampoo extends Producto{

    private String contenido;

    public Shampoo() {
    }

    public Shampoo(String nombre, int precio, String contenido) {
        super.nombre = nombre;
        super.precio = precio;
        this.contenido = contenido;
    }

    public String getContenido() {
        return this.contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " /// Contenido: " + getContenido() + " /// Precio: $" + getPrecio();
    }

}
