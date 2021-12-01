package ejercicio2;

import java.util.ArrayList;
//Crea la clase DeckCards
public class DeckCards {

	public static void main(String[] args) {
		// Aquí se crean los arrays para después tener los palos de las cartas y sus números.
		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		
		ArrayList<Card> deck = new ArrayList<Card>();
		
		// Crea una baraja de cartas, consiguiendo las cartas una a una.
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < values.length; j++) {
				Card card = new Card(suits[i], values[j]);
				deck.add(card);
			}
		}
		// Mezcla toda la baraja de cartas.
		for (int i = 0; i < deck.size(); i++) {
			int j = (int) Math.floor(Math.random() * i);
			Card tmp = deck.get(i);
			deck.set(i, deck.get(j));
			deck.set(j, tmp);
		}
		// Te devuelve las 5 primeras y las imprime por pantalla.
		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i));
		}

	}

}
