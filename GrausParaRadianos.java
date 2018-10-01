package grauspararadianos;

import java.util.Scanner;
public class GrausParaRadianos {
   
    public static void main(String[] args) {
    int  opcao=0;
    double  graus=0, radiano=0;
    Scanner imput = new Scanner(System.in);
        System.out.println("Voce quer comverter \nRadianos para graus digite 1   \nGraus para radianos Digite 2");
        do{
         opcao = imput.nextInt();  
        }while((opcao!=2)&&(opcao!=1));
        if (opcao == 1){
            System.out.println("Digite o numero em radianos"); 
            radiano = imput.nextDouble();
            System.out.print("πrad");
            graus = radiano*180;
            System.out.print("o numero em graus é: "+graus);
        }
         else{
          System.out.println("Digite o numero em radianos"); 
            graus = imput.nextDouble();
            System.out.print("°");
            radiano = (graus / 180);
            System.out.print("πrad");  
            System.out.println("o numero em radiano é: "+radiano);
         }
    }
}
