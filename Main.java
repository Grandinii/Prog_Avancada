/******************************************************************************

Gui Grandini - 02/03/2023

*******************************************************************************/
public class Main
{
	public static void main(String[] args){
	  mensagem();
	  mensagem("Guilherme ", "Grandini");
    }
    public static void mensagem(){
        System.out.print("Meu nome é ");
    }
    public static void mensagem(String m){
        System.out.print(m);
    }
    public static void mensagem(String m, String n){
        System.out.print(m + n);
    }
} 
