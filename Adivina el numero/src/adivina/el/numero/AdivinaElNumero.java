package adivina.el.numero;

import java.util.Scanner;

public class AdivinaElNumero {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num,secretnum,intentos=5;
        
        secretnum = (int) Math.floor(Math.random()*100);
        
        System.out.println("Ingresa el numero");
        
        while(intentos>0){
            num=leer.nextInt();
            if (num==secretnum) {
                System.out.println("Felicidades acertaste el numero "+secretnum);
                intentos=0;
            }else{
                intentos--;
                System.out.println("Quedan "+ intentos +" Intentos");
            }
        
        }
                
    }

}
