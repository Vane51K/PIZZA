package Hijo;

import Padre.Pizza;

import java.util.List;

public class PizzaItaliana extends Pizza {
    // Propiedades adicionales de PizzaItaliana
    private String salsa;
    private int tiempoEnHorno;

    // Constructor de PizzaItaliana
    public PizzaItaliana(String nombre, double precio, List<String> ingredientes, String salsa, int tiempoEnHorno) {
        // Llamar al constructor de la clase base (Pizza) con super()
        super(nombre, precio, ingredientes);
        this.salsa = salsa;
        this.tiempoEnHorno = tiempoEnHorno;
    }

    // Sobrescribir el método preparar para PizzaItaliana
    @Override
    public void preparar() {
        super.preparar();  // Llamar al método preparar de la clase base (Pizza)
        System.out.println("Añadiendo salsa " + salsa + " y horneando durante " + tiempoEnHorno + " minutos.");
    }

    // Sobrescribir el método toString para incluir detalles de PizzaItaliana
    @Override
    public String toString() {
        return super.toString() + ", salsa: " + salsa + ", tiempo en horno: " + tiempoEnHorno;
    }
}