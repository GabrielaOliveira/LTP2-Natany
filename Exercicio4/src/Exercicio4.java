import java.util.Scanner;	

public class Exercicio4 {
/*

  Seja a seguinte s�rie:
1, 4, 9, 16, 25, 36, 49, 64�
Escreva um programa em java que :
1. Leia um valor N do usu�rio
2. Gere esta s�rie at� o N-�simo termo.
 */

		 		 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			 
		int num, x=0;  
        
        System.out.println("Digite um N�mero: ");  
        num = sc.nextInt();  
          
        for (int cont = 1; cont < num ; cont++){  
        	
               	x = cont * cont;
               	System.out.println(x);
            }
            		 
        
	}
}