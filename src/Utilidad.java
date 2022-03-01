/**
 * 
 * @author Sara Gonzalo González
 * @since 1/3/22
 * @version 1.0
 *
 */


public class Utilidad {

	/**
	 * 
	 * @param a número de tipo entero
	 * @return int devuelve 0 si a vale 0, si a es distinto de 0 devuelve a y le suma su factorial
	 */
	public int ejercicioD(int a) {
		return (a==0) ? 0: a+factorial(a);
	}
	
	/**
	 * 
	 * @param n número de tipo entero
	 * @return entero calcula el factorial de un número mayor que 0
	 * @since {@link #ejercicioD(int a)}
	 */
	public int factorial(int n) {
		if (n==1) {
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
	
	/**
	 * 
	 * @param a número de tipo entero
	 * @param b número de tipo entero
	 * @return booleano devuelve verdadero si la suma de los números introducidos más 34 es primo, falso en caso contrario
	 * @deprecated este método está obsoleto
	 */
	public boolean refactorizacionD(int a, int b) {
		// Calculo único
		int c = a + b;
		// Calculo único
		int d = c + 34;
		
		//Calculo si d es primo
		boolean esPrimo = true;
		for (int i=2;i<d;i++) {
			if (d%i==0) {
				esPrimo = false;
			}
		}
		
		boolean resultado = !esPrimo;
		return (resultado);
	}
	
	/* Método utilizado para la refactorización
	public boolean refactorizacionDExamen(int a, int b) {
		// Calculo único
		//cambio de nombre de las variables para hacerlas más explicativas
		final int suma = a + b;//declarar como final tanto d como suma ya que no se modifican en el código
		// Calculo único
		final int d = suma + 34;
		
		//Calculo si d es primo
		boolean esPrimo = esPrimo(d);
		//esta varibale se puede suprimir no aporta nada ya que no se vuelve a utilzar la variable resultado con poner return(!resultado) es suficiente
		//boolean resultado = !esPrimo;
		return (!esPrimo);
	}
	
	//método para calcular si d es primo
	public boolean esPrimo(int d) {
		boolean esPrimo = true;
		for (int i=2;i<d;i++) {
			if (d%i==0) {
				esPrimo = false;
			}
		}
		return(esPrimo);
		
	}*/
	
}
