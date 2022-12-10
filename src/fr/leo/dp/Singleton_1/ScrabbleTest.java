package fr.leo.dp.Singleton_1;

import java.util.LinkedList;

public class ScrabbleTest {

	public static void main(String[] args) {
		Singleton newInstance = Singleton.getInstance();
		System.out.println(newInstance.getLetterList());

		System.out.println("");
		System.out.println("Instance 1 ID: " + System.identityHashCode(newInstance));
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		System.out.println("Player1: " + playerOneTiles);
		System.out.println(newInstance.getLetterList());

		System.out.println("");
		Singleton instanceTwo = Singleton.getInstance();
		System.out.println("Instance 2 ID: " + System.identityHashCode(instanceTwo));
		LinkedList<String> playerTwoTiles = instanceTwo.getTiles(7);
		System.out.println("Player2: " + playerTwoTiles);
		System.out.println(instanceTwo.getLetterList());
	}

}
