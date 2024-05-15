package ar.edu.unju.fi.ejercicio6.inerfaces.funcionales;


@FunctionalInterface
public interface convert <T, T1> {
	
	T1 converte (T t);
	
	static <T> boolean isNotNull (T t) {
		return t != null;
	}
	
	default void mostrarObjeto (T1 t1) {
		System.out.println("Objeto - " + t1.toString());
	}
}