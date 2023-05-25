/******************************************************************************


*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
        Pessoa a = new Pessoa();
        a.setNome("Ana Bia");
        a.setAltura(1.60);
        a.setPeso(58);
        
        a.imprime();
        
        
        System.out.println("-----------------------");
        Pessoa b = new Pessoa();
        b.setNome("Guilherme Grandini");
        b.setAltura(1.68);
        b.setPeso(63.5);
        
        b.imprime();
        
	}
}
