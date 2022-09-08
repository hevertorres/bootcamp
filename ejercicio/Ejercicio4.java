public class Ejercicio4 {
    public static void numeroEntero(int num){
        if (num < 0) System.out.println("Numero "+num+" es NEGATIVO ");
        else if (num > 0) System.out.println("Numero "+num+" es POSITIVO");
        else System.out.println("Numero "+num+" es 0");
    }

    

    public static void main(String[] args){
        
        int numeroIf= -10,numeroWhile=0;
        numeroEntero(numeroIf);

        System.out.println(" Bucle WHILE");
        while(numeroWhile < 3){
            System.out.println("Valor de la Variable numeroWhile :"+numeroWhile);
            numeroWhile+=1;
        }
       
        System.out.println(" Bucle DO WHILE");
        do{
            System.out.println("Valor de la Variable numeroWhile :"+numeroWhile);
        }while(numeroWhile < 3);
       
        System.out.println(" Bucle FOR");
        for(int numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println("Valor de la variable numeroFor : "+numeroFor);
            


        }

    }
}
