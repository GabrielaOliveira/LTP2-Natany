
public class Exercicio3 {

	
	/*
    Criar um programa que le um inteiro n menor que 20 e imprime o n-�simo n�mero
 na sequ�ncia de fibonacci.
 a.Fn =Fn-1 + Fn-2
 b. 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,233, 377, �.
    */
	public static void main(String[] args){
	int num = 1, fb = 0;
	
	
	 do{
	 num = num + fb;
	 fb = num - fb;
	 
	 System.out.println(fb);
	 
	 }while(num < 20);
	 
	
        
    
  }
}
