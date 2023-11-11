/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2.u4.u5;

/**
 *
 * @author PC
 */
public class Practica2U4U5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double numero1 = 10, numero2 = 5, resultado;
        
        double sumaResultado = suma(numero1, numero2);

        double restaResultado = resta(numero1, numero2);

        double multiplicacionResultado = multiplicacion(numero1, numero2);

        double divisionResultado = division(numero1, numero2);

        System.out.println("Suma: " + sumaResultado);

        System.out.println("Resta: " + restaResultado);

        System.out.println("Multiplicación: " + multiplicacionResultado);

        System.out.println("División: " + divisionResultado);

    }

    public static double suma(double NUM1, double NUM2) {
        return NUM1 + NUM2;
    }

    public static double resta(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        double resultado = num1 / num2;
        
        if (num2 != 0) {
            return resultado;
        } else {
            System.out.println("Error: NO EXISTE DIVISION ETRE CERO.");
            return 0.0;
        }
    }
}
