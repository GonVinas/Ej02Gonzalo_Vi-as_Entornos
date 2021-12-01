package ejercicio2;
//Crea la clase Card
public class Card {
	// Define los elementos que contiene la clase Card
	public String suit;
	public String value;
	
	public Card (String suit, String value) {
		this.suit = suit;
		this.value = value;
	}
	// Te devuelve un string con el valor de suit y value
	public String toString () {
		return (this.suit+"-"+this.value);
	}
}
