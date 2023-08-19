package Hijo;

import Padre.Pizza;

public class Topping {
    // Propiedad
    private String nombre;

    // Constructor
    public Topping(String nombre) {
        this.nombre = nombre;
    }

    // Método para agregar el topping a una pizza
    public void agregar(Pizza pizza) {
        pizza.agregarTopping(this);  // Llama al método agregarTopping de la clase Pizza
    }

    // Método para representar el topping como cadena
    @Override
    public String toString() {
        return nombre;
    }
}
