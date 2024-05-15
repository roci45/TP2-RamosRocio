package ar.edu.unju.fi.ejercicio3.main;

import ar.edu.unju.fi.ejercicio3.model.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Provincia[] provincias = Provincia.values();
		
			for (Provincia provincia : provincias) {
				System.out.println("Provincia: " + provincia);
	            System.out.println("Población: " + provincia.getCantidadPoblacion());
	            System.out.println("Superficie: " + provincia.getSuperficie());
	            System.out.println("Densidad Poblacional: " + provincia.calcularDensidadPoblacional());
	            System.out.println();
			}
	}

}