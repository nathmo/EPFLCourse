package cms_tp23;

public class Paire<T extends Number> {
	private T premier;
	private T second;

	//Constructeur sans argument
	public Paire() { }

	//Constructeur avec 2 arguments
	public Paire(T premier, T second) {
		setPremier(premier);
		setSecond(second);
	}

	//Constructeur par recopie superficielle
	public Paire(Paire<T> source) {
		setPremier(source.premier);
		setSecond(source.second);
	}

	public T getPremier() {
		return premier;
	}
	public void setPremier(T premier) {
		this.premier = premier;
	}
	public T getSecond() {
		return second;
	}
	public void setSecond(T second) {
		this.second = second;
	}
}
