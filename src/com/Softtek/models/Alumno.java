package com.Softtek.models;

public class Alumno {
	private int numAlumno;
	private String nombre;
	private double nota;
	private String apellido;
	private Direccion direccion;	
	
	public Alumno() {
		super();
	}

	public Alumno(int numAlumno, String nombre, double nota, Direccion direccion) {
		super();
		this.numAlumno = numAlumno;
		this.nombre = nombre;
		this.nota = nota;
		this.direccion = direccion;
	}

	public Alumno(int numAlumno, String nombre, double nota) {
		super();
		this.numAlumno = numAlumno;
		this.nombre = nombre;
		this.nota = nota;
	}
	
	
	public Alumno(int numAlumno, String nombre, double nota, String apellido, Direccion direccion) {
		super();
		this.numAlumno = numAlumno;
		this.nombre = nombre;
		this.nota = nota;
		this.apellido = apellido;
		this.direccion = direccion;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}
		
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
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
	
	@Override
	public String toString() {
		return "Alumno [numAlumno=" + numAlumno + ", nombre=" + nombre + ", nota=" + nota + ", apellido=" + apellido
				+ ", direccion=" + direccion + "]";
	}

}
