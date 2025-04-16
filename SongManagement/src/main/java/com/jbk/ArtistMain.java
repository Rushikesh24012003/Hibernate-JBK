package com.jbk;

import java.util.Scanner;

public class ArtistMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArtistDao artistdao = new ArtistDao();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Choice :");
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1: System.out.println("Enter artist id , age and name :");
				Artist artist = new Artist(sc.nextInt(),sc.nextInt(),sc.next());
			    artistdao.insertArtist(artist);
			    break;
		}
	}

}
