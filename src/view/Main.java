package view;

import java.util.Random;

import ThreadsMat.ThreadsCal;

public class Main {

	public static void main(String[] args) {
		Random random = new Random(); 
		int [][] mat = new int [3][5];
		
		for(int x = 0; x < 3; x++) {
			for(int y = 0; y < 5; y++) {
				mat[x][y] = random.nextInt(100);
				System.out.print(mat[x][y]+"|");
			}
			System.out.println();
		}
		for(int x = 0; x < 3; x++) {
			Thread thread = new ThreadsCal(mat[x]);
			thread.start();
		}
	}

}
