package endava.serijalizacija;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.Scanner;

public class TestBiblioteka {

	private static LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();

	public static void ucitajSaTastature() {

		Scanner sc = new Scanner(System.in);
		Knjiga k = new Knjiga();
		System.out.println("Unesi naziv knjige: ");
		k.setNaslov(sc.nextLine());
		System.out.println("Unesi ISBN: ");
		k.setISBN(sc.nextLine());
		System.out.println("Unesi ime autora: ");
		k.setAutor(sc.nextLine());
		if (knjige.contains(k.getISBN()))
			throw new RuntimeException("Knjiga sa tim ISBNom vec postoji. ");
		else
			knjige.add(k);

	}

	public static void serijalizacijaKnjiga() {

		try {
			ObjectOutputStream dos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\biblioteka.out")));

			for (int i = 0; i < knjige.size(); i++) {
				dos.writeObject(knjige.get(i));

				dos.close();
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Greska! serijalizacijaKnjiga " + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void deserijalizujPodatkeIzFilea() throws ClassNotFoundException {
		try {
			ObjectInputStream dis = new ObjectInputStream(new BufferedInputStream(new FileInputStream(
					"C:\\Users\\sanja.miladinovic\\OneDrive - ENDAVA\\Desktop\\Data fileovi\\biblioteka.out")));

			knjige.clear();
			try {
			while (true) {
				
				knjige.add((Knjiga) dis.readObject());
			}}catch(EOFException e) {
				
				dis.close();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block

			System.out.println("Greska! deserijalizujPodatkeIzFilea " + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void ispisiSveIzBiblioteke() {
		if(knjige.size()!=0)
		for (int i = 0; i < knjige.size(); i++) {
			
			System.out.println(knjige.get(i));
			
			
		}
		else
			System.out.println("Biblioteka je prazna.");
		
		
		
		
	}

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
	
		ucitajSaTastature();
		serijalizacijaKnjiga();
		deserijalizujPodatkeIzFilea();
		ispisiSveIzBiblioteke();
		
	}

}
