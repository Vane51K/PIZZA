package Hijo;

import Padre.Pizza;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Pizza
        Pizza pizza = new Pizza("Hawaiana", 75, List.of("queso", "tomate", "piña", "jamón"));

        // Llamar al método preparar() de la instancia de Pizza
        pizza.preparar();

        // Imprimir la representación en cadena de la instancia de Pizza utilizando toString()
        System.out.println(pizza.toString());

        // Crear instancias de Topping
        Topping queso = new Topping("queso");
        Topping champinones = new Topping("champiñones");

        // Agregar toppings a la instancia de Pizza
        queso.agregar(pizza);
        champinones.agregar(pizza);

        // Llamar al método preparar() nuevamente después de agregar toppings
        pizza.preparar();

        // Imprimir la representación en cadena de la instancia de Pizza nuevamente
        System.out.println(pizza.toString());
    }
}
