
public class Tile {
	private char alphabet;
	private int value;
	
	int[] alphabetScore = {};
	
	public Tile(char alphabet)
	{
		this.alphabet = Character.toUpperCase(alphabet);
		this.value = alphabetScore[alphabet - 65];
	}
	

	public char getAlphabet() {
		return alphabet;
	}

	public void setAlphabet(char alphabet) {
		this.alphabet = alphabet;
	}

	public int getValue() {
		return value;
	}

}
