public class Ejercicio8 {
    
    public static void main(String[] args){
        Persona trabajador = new Persona();
    
        trabajador.setsEdad(40);
        trabajador.setsNombre("Carlos");
        trabajador.setsTelefono("6485532");
    
        System.out.println("----Datos del Trabajador--------");
        System.out.println("Nombre "+trabajador.getsNombre()+" edad : "+trabajador.getsEdad()+
        " Telefono :"+ trabajador.getsTelefono());
        System.out.println("----  -----------  --------");
    }

    


}
