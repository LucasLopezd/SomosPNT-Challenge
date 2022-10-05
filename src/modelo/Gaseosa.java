package modelo;

public final class Gaseosa extends Producto{

    private double litros;
    
    public Gaseosa(String nombre, int precio, double litros) {
        super.nombre = nombre;
        super.precio = precio;
        this.litros = litros;        
    }

    public String getNombre() {
        return super.nombre;
    }

    public int getPrecio() {
        return super.precio;
    }

    public double getLitros() {
        return this.litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " /// Litros: " + getLitros() + " /// Precio: $" + getPrecio();
    }


}
