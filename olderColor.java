
public class ConjuntoNumerosN {
	private int[] numerosInt = new int[5];

	public ConjuntoNumerosN() {

	}

	public ConjuntoNumerosN(int num0, int num1, int num2, int num3, int num4) {
		this.numerosInt[0] = num0;
		this.numerosInt[1] = num1;
		this.numerosInt[2] = num2;
		this.numerosInt[3] = num3;
		this.numerosInt[4] = num4;
	}

	public void setNum(int posicion, int num) {
		this.numerosInt[posicion] = num;
	}

	public int getNum(int posicion) {
		return this.numerosInt[posicion];
	}

	public String toString() {
		return "ConjuntoNumerosN \n" + this.numerosInt[0] + " " + this.numerosInt[1] + " " + this.numerosInt[2] + " "
				+ this.numerosInt[3] + " " + this.numerosInt[4];

	}

	public void ordenarConjuntoNumerosN() {
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (numerosInt[i] > numerosInt[j]) {
					int numTemp = numerosInt[i];
					numerosInt[i] = numerosInt[j];
					numerosInt[j] = numTemp;
				}
			}

		}
	}

}
