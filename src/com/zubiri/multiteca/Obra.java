package com.zubiri.multiteca;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Obra {
	
	private String titulo;
	private Artista autor;
	private int a�oEdicion = 0;
	
	public Obra() {
		
	}
	
	public Obra(String titulo, Artista autor, int a�oEdicion) {
	
		this.titulo = titulo;
		this.autor = autor;
		this.a�oEdicion = a�oEdicion;
	}
	
	public Obra(Scanner sc) {
		
		System.out.println("Titulo de la obra:");
		this.setTitulo(sc.next());

		do {
			try {
		System.out.println("A�o de edicion de la obra:");
		this.setA�oEdicion(sc.nextInt());
			}catch(InputMismatchException exception){
				System.out.println("Eso no es numero");
				sc.nextLine();
			}
		} while (a�oEdicion == 0);
		System.out.println("Autor de la obra:");
		this.setAutor(Artistas.buscarArtista(sc.next()));
		
	}
	
	public Artista getAutor() {
		
		return autor;
	}

	public void setAutor(Artista autor) {
		
		this.autor = autor;
	}

	public int getA�oEdicion() {
		
		return a�oEdicion;
	}

	public void setA�oEdicion(int a�oEdicion) {
		
		this.a�oEdicion = a�oEdicion;
	}

	public String getTitulo() {
		
		return titulo;
	}
	
	public void setTitulo(String tit){
		this.titulo = tit;
	}
	
	public void mostrarObra () {
		System.out.println("\tTitulo:" + this.getTitulo());
		System.out.println("\tA�o de edicion:" + this.getA�oEdicion());
		System.out.println("\tArtista: " + this.getAutor().getNombre());
		System.out.println("\t");
	}

	public boolean equalsIgnoreCase(int index) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	public String formattedObra() {
		
		String ObraStr = 
				"TITULO:" + this.titulo + "\n" + 
				"AUTOR:" + this.autor  + "\n" +
				"A�O EDICION:" + this.a�oEdicion  + "\n" ;
				
				return ObraStr;
		
	}
}