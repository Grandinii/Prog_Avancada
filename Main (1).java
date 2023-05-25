/******************************************************************************

Gui Grandini - 02/03/2023

*******************************************************************************/
public class Main
{
	public static void main(String[] args){
        System.out.println("Soma: O resultado é " +soma(25,15));
        mensagem("Mensagem: Olá Mundo");
        potencia(25,2);
	}
	public static int soma(int a, int b){
	    return a+b;
	}
	public static void mensagem(String m){
	    System.out.println(m);
	}
	public static void potencia(int x, int y){
	    System.out.println(x + " elevado a " + y + " = " + Math.pow(x,y)); 
	}
} 
