package Apuesta;
/**
 * Clase main para poder realizar las distintas pruebas
 * @author Oscar
 * @version 3.0
 */
public class Main {
	/**
	 * Clase main, para las pruebas
	 * @param args
	 */
    public static void main(String[] args) {
        Apuesta laApuestaORB;
        int mi_dinero;
        /**
         * @param Objeto de la clase apuesta
         */
        laApuestaORB = new Apuesta(1000, 4, 2);
        operativaApuesta(laApuestaORB, 0, 0);
        mi_dinero = laApuestaORB.getDinero_disp();
        System.out.println("El dinero que tengo tras las apuestas es " + mi_dinero);
    }

	/**
	 * @param laApuestaORB
	 * @param dinero TODO
	 * @param racha TODO
	 * Método para la prueba de apuesta
	 */
	public static void operativaApuesta(Apuesta laApuestaORB, double dinero, int racha) {
		try {
            System.out.println("Apostando...");
            laApuestaORB.apostar(25);
        } catch (Exception e) {
            System.out.println("Fallo al realizar la Apuesta");
        }

        try {
            System.out.println("Intento cobrar apuesta segun el resultado del partido");
            laApuestaORB.cobrar_apuesta(2, 3);
        } catch (Exception e) {
            System.out.println("Fallo al cobrar la apuesta");
        }
	}
}
