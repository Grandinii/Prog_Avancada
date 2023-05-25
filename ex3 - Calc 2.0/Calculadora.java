/******************************************************************************

Gui Grandini - 09/03/2023   

*******************************************************************************/

public class Calculadora {
    // Atributos
   int x;
   int y;
   int resultado;
    
    //construtor
    public Calculadora (int a, int b) {
        x = a;
        y = b;
    }
    
    //Metodos
    public void potencia() {
        //resultado=Math.pow(x,y);
    }
    public void soma () {
        resultado=x+y;
    }
    public void produto () {
        resultado=x*y;
    }
    public void mostraResultado () {
	    System.out.println ("Resultado=" + resultado);
	} 
}
