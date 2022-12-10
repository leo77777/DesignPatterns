package fr.leo.dp.Singleton_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {

	private static Singleton firstInstance = null;

	String[] scrabbleLetters = { "a", "a", "a", "a", "a", "a", "a", "a", "a", "b", "b", "c", "c", "d", "d", "d", "e",
			"e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h", "h", "i", "i", "i",
			"i", "i", "i", "i", "i", "i", "j", "k", "l", "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "o", "o",
			"o", "o", "o", "o", "o", "o", "p", "p", "p", "q", "r", "r", "r", "r", "r", "r", "s", "s", "s", "s", "t",
			"t", "t", "t", "t", "u", "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z" };

	private LinkedList<String> letterList = new LinkedList<>(Arrays.asList(scrabbleLetters));

	static boolean firstThread = true;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (firstInstance == null) {
			System.out.println("debut");
			if (firstThread) {
				firstThread = false;
				Thread.currentThread();
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			synchronized (Singleton.class) {
				if (firstInstance == null) {
					firstInstance = new Singleton();
					// Battre, remuer les cartes !
					Collections.shuffle(firstInstance.letterList);
					System.out.println("shufle et fini !");
				}
			}
		}
		return firstInstance;
	}

	public LinkedList<String> getLetterList() {
		return firstInstance.letterList;
	}

	public LinkedList<String> getTiles(int howManyTiles) {
		LinkedList<String> tilesToSend = new LinkedList<>();

		for (int i = 0; i < howManyTiles; i++)
			tilesToSend.add(firstInstance.letterList.remove(0));
		return tilesToSend;

	}
}
