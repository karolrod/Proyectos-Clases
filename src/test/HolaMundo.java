package test;
/**
 * Este es la clase java
 * @author Ada Lovelace
 *
 */
public class HolaMundo {
	/**
	 * este es el metodo principal
	 * @param args
	 */
	public static void main(String[] args) {
		Persona per = new Persona();
		per.setAltur(160);
		per.setNacionalidad("Venezolana");
		per.setFuma(true);
		Persona madre = new Persona();
		madre.setNombre("Dani");
		madre.setAltur(180);
		per.setMadre(madre);

		Persona padre = new Persona();
		padre.setNombre("Alfredo");
		per.setPadre(padre);

		Persona per2 = new Persona();
		per2.setAltur(170);
		per2.setNacionalidad("Argentina");
		per2.setFuma(false);

		Persona madre2 = new Persona();
		per2.setNombre("Norma");
		per2.setMadre(madre2);

		System.out.println("per: " + per.getAltura() + " per2: " + +per2.getAltura());
		System.out.println("per: " + per.getNacionalidad());
		System.out.println("per:fuma " + per.isFuma());
		System.out.println("per padre:" + per.getPadre().getNombre());

	}
}
