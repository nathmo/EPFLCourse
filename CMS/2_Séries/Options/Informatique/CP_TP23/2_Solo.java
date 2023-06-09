package cms_tp23;

public class Solo<T extends Number> {
	private T seul;

	//Constructeur sans argument
	public Solo() { }

	//Constructeur avec 2 arguments
	public Solo(T seul) {
		setSeul(seul);
	}

	//Constructeur par recopie superficielle
	public Solo(Solo<T> source) {
		setSeul(source.seul);
	}

	public T getSeul() {
		return seul;
	}
	public void setSeul(T seul) {
		this.seul = seul;
	}
}
