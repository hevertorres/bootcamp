
 public class Ejercicio9{

    // main
    public static void main(String[] args){
        System.out.println("Ejericio 9");

        Cliente cliente = new Cliente();

            cliente.nombre="Juan Perez";
            cliente.edad=25;
            cliente.teléfono="6485539";
            cliente.credito=2;
        System.out.println("\n------Nuevo Cliente----- \n"+"Nombre: " +cliente.nombre +
                         "\n Edad: "+cliente.edad +"\n Telefono: "+cliente.teléfono+"\n creditos: "+cliente.credito);


         Trabajador trabajador = new Trabajador();

        trabajador.nombre="Juan Perez";
        trabajador.edad=25;
        trabajador.teléfono="6485539";
        trabajador.setSalario(2000);

        System.out.println("\n\n------Nuevo Trabajador----- \n"+"Nombre: " +trabajador.nombre +
                                      "\n Edad: "+trabajador.edad +"\n Telefono: "+trabajador.teléfono+"\n Salario: "+
                                      trabajador.getSalario());
               
        
        
        
    }

    /*Ejercicio tema 9
 * Crea una clase Persona con las siguientes variables:
La edad
El nombre
El teléfono
Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito 
solo para  esa clase.
Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito,
 tienes que darles valor y mostrarlas por pantalla.
Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo 
tenga la clase Trabajador.
 * 
 */

 public static class Persona {
    int edad;
    String nombre;
    String teléfono;

    public void Persona(){
        System.out.println("Contruyendo la clase Persona");
    }

 }

 public static class Cliente extends Persona{
    int credito;
    public void Cliente(){
        System.out.println("Contruyendo la clase Cliente");
        // this.nombre = nombre;
        // this.teléfono = teléfono;
        // this.edad = edad;
        // this.credito = credito;
    }
}

public static class Trabajador extends Persona{
   private int salario;

   public void setSalario(int salario){
    this.salario=salario;
   }
   public int getSalario(){
     return this.salario;
   }
 }

 }  // fin clase principal