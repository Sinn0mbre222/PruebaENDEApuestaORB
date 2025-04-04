package Apuesta;
/**
 * Clase apuesta donde se definen los atributos y los métodos 
 * 
 * @author Oscar
 * @version 3.0
 */
public class Apuesta {
	
	/**
	 * @param dinero_disp atributo de Dinero disponible 
	 * @param goles_locales Atributo para contar los goles locales
	 * @param goles_visitantes Atributo para contar los goles del equipo visitante
	 * @param apostado Atributo apostado para guardar el diinero apostado
	 * @param dinero Atributo para guardar el dinero
	 * @param racha Atributo para ver la racha de apuestas ganadas
	 */
    private int dinero_disp;
    private int goles_local;
    private int goles_visitante;
    private int apostado;
    private double dinero;
    private int racha;

    /*Contructor por defecto*/
    
    /**
     * Generación de constructor por defecto
     */
    public Apuesta() {
    }

    /*Contructor por parámetros*/
    /**
     * Constructor con parametros
     * @param dinero_disp
     * @param goles_local
     * @param goles_visitante
     */
    public Apuesta(int dinero_disp, int goles_local, int goles_visitante) {
        this.setDinero_disp(dinero_disp);
        this.setGoles_local(goles_local);
        this.setGoles_visitante(goles_visitante);
        this.setApostado(0);
    }
    
    /**
     * Método para obtener el valor del atributo dinero_disp
     * @return te devuelve el dinero disponible
     */
    public int getDinero_disp() {
        return dinero_disp;
    }
    /*Método para modificar el valor del atributo dinero_disp*/
    /**
     * 
     * @param dinero_disp setter paara poner el dinero que tienes 
     */
    public void setDinero_disp(int dinero_disp) {
        this.dinero_disp = dinero_disp;
    }


    /**
     * Método para apostar.
     * Permite elegir la cantidad a apostar, no pudiendo ser inferior a 1 ni superior a tu saldo disponible
     * Este método será probado con JUnit
     * @param dinero
     * @throws Exception te devuelve que no puedes apostar mas de lo que tienes
     */
    public void apostar(int dinero) throws Exception {
        if (dinero <= 0) {
            throw new Exception("No se puede apostar menos de 1€");
        }

        if (dinero > getDinero_disp()) {
            throw new Exception("No se puede apostar mas de lo que tienes");
        }
        {
            setDinero_disp(dinero - getDinero_disp());
            setApostado(dinero);
        }
    }

/**
 * Método que comprueba si se ha acertado el resultado del partido
 * En caso de que lo haya acertado devuelve true. Chequea que no se metan menos de 0 goles
 * @param local
 * @param visitante
 * @return te devuelve si se ha acertado
 * @throws Exception
 */
    public boolean comprobar_resultado(int local, int visitante) throws Exception {
        boolean acertado = false;
        if ((local < 0) || (visitante) < 0) {
            throw new Exception("Un equipo no puede meter menos de 0 goles, por malo que sea");
        }

        if (getGoles_local() == local && getGoles_visitante() == visitante) {
            acertado = true;
        }
        return acertado;
    }

/**
 * Método para cobrar la apuesta.
 * Comprueba que se acertó el resultado y, en ese caso, añade el valor apostado multiplicado por 10
 * al saldo disponible
 * Este método se va a probar con Junit
 * @param cantidad_goles_local
 * @param cantidad_goles_visit
 * @throws Exception
 */
    void cobrar_apuesta(int cantidad_goles_local, int cantidad_goles_visit) throws Exception {

        if (comprobar_resultado(cantidad_goles_local, cantidad_goles_visit) == false) {
            throw new Exception("No se puede cobrar una apuesta no acertada");
        }
        setDinero_disp(getDinero_disp() * 10);

    }
    /**
     * 
     * @return te devuelve lo que hayas apostado
     */
	private int getApostado() {
		return apostado;
	}
	/**
	 * 
	 * @param apostado introducir apuesta
	 */
	private void setApostado(int apostado) {
		this.apostado = apostado;
	}
/**
 * 
 * @return te devuelve los goles del equipo visitante
 */
	private int getGoles_visitante() {
		return goles_visitante;
	}
/**
 * 
 * @param goles_visitante introducir los goles del equipo 
 */
	private void setGoles_visitante(int goles_visitante) {
		this.goles_visitante = goles_visitante;
	}
/**
 * 
 * @return te devuelve los goles del equipo local
 */
	private int getGoles_local() {
		return goles_local;
	}
/**
 * 
 * @param goles_local introducir goles del equipo local
 */
	private void setGoles_local(int goles_local) {
		this.goles_local = goles_local;
	}
	/**
	 * 
	 * @return te devuelve la racha de las apuestas
	 */
	private int getRacha() {
		return racha;
	}
/**
 * 
 * @param racha introducir racha
 */
	private void setRacha(int racha) {
		this.racha = racha;
	}
/**
 * 
 * @return te devuelve el dinero
 */
	private double getDinero() {
		return dinero;
	}
/**
 * 
 * @param dinero introducir el dinero
 */
	private void setDinero(double dinero) {
		this.dinero = dinero;
	}
}
