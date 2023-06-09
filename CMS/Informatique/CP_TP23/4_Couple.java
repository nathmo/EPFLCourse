package cms_tp23;

public class Couple<T,U> {
	private T premier;
	private U second;

	//Constructeur sans argument
	public Couple() { }

	//Constructeur avec 2 arguments
	public Couple(T premier, U second) {
		setPremier(premier);
		setSecond(second);
	}

	//Constructeur par recopie superficielle
	public Couple(Couple<T,U> source) {
		setPremier(source.premier);
		setSecond(source.second);
	}

	public T getPremier() {
		return premier;
	}
	public void setPremier(T premier) {
		this.premier = premier;
	}
	public U getSecond() {
		return second;
	}
	public void setSecond(U second) {
		this.second = second;
	}
}
