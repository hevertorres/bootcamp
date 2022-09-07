// Curso de Introducción a la programación    Ejercicios tema 3

// Primera parte:
// Crear una función con tres parámetros que sean números que se suman entre sí.
// Llamar a la función en el main y darle valores.

// Segunda parte:
// Crear una clase coche.
// Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
// Una función que incremente el número de puertas que tiene el coche.
// Crear un objeto miCoche en el main y añadirle una puerta.
// Mostrar el número de puertas que tiene el objeto. 

public class Ejercicio3{

    public static void sumar (int num1,int num2,int num3){
            System.out.println("La suma de los numeros "+num1+", "+num2+", "+num3+" es :"+(num1+num2+num3));
    }

public static class Coche{
        int puertas =0;

        public  void incrementarPuerta(){
                this.puertas += 1; 
        }
        public  void mostrarPuertas(){
                System.out.println("El coche tiene "+this.puertas+" puertas");
        }
}

    public static void main(String[] args){
            sumar(1,20, 30);

            Coche miCoche = new Coche();

            miCoche.mostrarPuertas();
    }



}