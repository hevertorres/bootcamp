public class Ejercicio8 {
    
    public static void main(String[] args){
        Persona trabajador = new Persona();
    
        trabajador.setsEdad(40);
        trabajador.setsNombre("Carlos Andres ");
        trabajador.setsTelefono("6485532");
    
        System.out.println("----Datos del Trabajador--------");
        System.out.println("Nombre: "+trabajador.getsNombre()+",edad: "+trabajador.getsEdad()+
        " años "+",Telefono: "+ trabajador.getsTelefono());
        System.out.println("--                                      --");
    }

    /* Ejercicios tema 8
Para practicar la encapsulación:
Crear clase Persona.
Crear variables las privadas edad, nombre y telefono de la clase Persona.
Crear gets y sets de cada propiedad.
Crear un objeto persona en el main.
Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, 
por último muéstralas por consola.
 */
public static class Persona {
    private int edad;
    private String nombre;
    private String telefono;
  //   edad
    public void setsEdad(int edad){
      this.edad = edad;
    }
    public int getsEdad(){
          return this.edad;
    }
  //   nombre
    public void setsNombre(String nombre){
      this.nombre=nombre;
    }
    public String getsNombre(){
      return this.nombre;
    }
  //   telefono
  public void setsTelefono(String telefono){
      this.telefono=telefono;
  
  }
  public String getsTelefono(){
      return this.telefono;
  }
}  



}
