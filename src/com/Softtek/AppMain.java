package com.Softtek;

import com.Softtek.models.Alumno;
import com.Softtek.models.Direccion;

public class AppMain {

	public static void main(String[] args) {
	 System.out.println("Bienvenidos");

	 Alumno alumno = new Alumno(1, "Pepe", 6.5, new Direccion("Mayor",5 , "Madrid"));
	 System.out.println(alumno);
	 
	 Alumno alumno2 = new Alumno(2, "Maria", 6.5, new Direccion("Real", 11 , "Toledo"));
	 System.out.println(alumno2);
	}

}
