package exo3;

public class CaractereInterditException extends Exception {
    /**
     * Constructeur de la classe CaractereInterditException.
     * @param message
     */
	public CaractereInterditException(String message) {
        super(message);
       
    }
	
	
	 /**
     * Affecte une valeur dans la grille
     * @param x       position x dans la grille
     * @param y       position y dans la grille
     * @param value   valeur a mettre dans la case
     * @throw CaractereInterditException si value n'est pas un caractere autorise ('1',...,'9')
     */
	@Override
	public void char setValue(int x, int y, char value) throws CaractereInterditException {
       System.out.println(value);
		
	}
	
}

