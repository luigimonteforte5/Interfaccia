
//classe che estende la classe astratta Forma
public class Triangolo extends Forma {

	//attributi della classe
	private int base;
	private int altezza;

	//metodo costruttore
	public Triangolo( int base, int altezza ) {
		this.base = base;
		this.altezza = altezza;
	}

	//getters e setters
	public int getBase() {
		return base;
	}

	public void setBase( int base ) {
		this.base = base;
	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza( int altezza ) {
		this.altezza = altezza;
	}


	//override della funzione astratta calcolaArea estesa dalla classe forma
	@Override
	public int calcolaArea() {
		return (base*altezza)/2;
	}
}
