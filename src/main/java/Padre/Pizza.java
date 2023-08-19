package edu.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    // Propiedades
    private String nombre;
    private double precio;
    private List<String> ingredientes;
    private List<Topping> toppings;

    // Constructor
    public Pizza(String nombre, double precio, List<String> ingredientes) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
        this.toppings = new ArrayList<>();  // Inicializar la lista de toppings
    }

    // Método para preparar la pizza
    public void preparar() {
        System.out.println("La pizza " + nombre + " está lista para ser servida.");
    }

    // Método para agregar un topping a la pizza
    public void agregarTopping(Topping topping) {
        toppings.add(topping);  // Agregar el topping a la lista de toppings
        System.out.println("Topping " + topping.toString() + " agregado a la pizza.");
    }

    // Método para representar la pizza como cadena
    @Override
    public String toString() {
        return "Nombre de la pizza: " + nombre + ", y su precio es: " + precio;
    }
}
