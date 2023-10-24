package com.Softtek.models;

public class Alumno {
	private int numAlumno;
	private String nombre;
	private double nota;
	private Direccion direccion;
	
	
	@Override
	public String toString() {
		return "Alumno [numAlumno=" + numAlumno + ", nombre=" + nombre + ", nota=" + nota + ", direccion=" + direccion
				+ "]";
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public Alumno(Direccion direccion) {
		super();
		this.direccion = direccion;
	}
	public Alumno() {
		super();
	}
	public Alumno(int numAlumno, String nombre, double nota) {
		super();
		this.numAlumno = numAlumno;
		this.nombre = nombre;
		this.nota = nota;
	}
	public int getNumAlumno() {
		return numAlumno;
	}
	public void setNumAlumno(int numAlumno) {
		this.numAlumno = numAlumno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}

}
