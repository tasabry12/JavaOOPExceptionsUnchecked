
public class main {
	
	static int mediaInteraVett(int[] v, int diQuanti) {
		int somma=0;
		for(int i=0; i<diQuanti; i++)
			somma+=v[i];
		if (diQuanti!=0)	
		  return somma/diQuanti;
		else
			throw new ArithmeticException();
	}
	
	
	static int medotoIntermedio(int[] v, int diQuanti){
		
		//essendo uncheked neanche il metodo intermedio è obbligato a fare un check
		try 
		{
		     return mediaInteraVett(v, diQuanti);
		}
		catch (ArithmeticException errore) 
		{
			return -1;
		}
		
		catch (ArrayIndexOutOfBoundsException errore) 
		{
			return -2;
		}
		

	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vettore = { 3,8,-78,19,56,0,41,88,12,13,14,90};
		System.out.println("Media: " + medotoIntermedio(vettore, 15));
	
	}



}
