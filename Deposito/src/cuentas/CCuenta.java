package cuentas;
/**
 * Clase para gestionar una cuenta bancaria.
 * 
 * @author Bruno Cantero
 * @version 1.0
 * @since 1.0
 * */
 public class CCuenta {


	// Propiedades
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor por defecto.
     */
    public CCuenta()
    {
    }

    /**
     * Constructor.
     * 
     * @param nom  nombre del titular
     * @param cue  número de cuenta
     * @param sal  saldo inicial de la cuenta
     * @param tipo tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * 
     * @return saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Ingresa una cantidad en la cuenta. La cantidad debe ser positiva.
     * 
     * @param cantidad importe a ingresar
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira una cantidad en la cuenta. La cantidad debe ser positiva y no superior al saldo.
     * 
     * @param cantidad importe a retirar
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Obtiene el tipo de interés de la cuenta.
     * 
     * @return tipo de interés
     */
	public double getTipoInterés() {
		return tipoInterés;
	}

    /**
     * Asigna el tipo de interés de la cuenta.
     * 
     * @param tipoInterés nuevo tipo de interés
     */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

    /**
     * Obtiene el saldo actual de la cuenta.
     * 
     * @return saldo de la cuenta
     */
	public double getSaldo() {
		return saldo;
	}

    /**
     * Asigna el saldo de la cuenta.
     * 
     * @param saldo nuevo saldo
     */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

    /**
     * Obtiene el número de cuenta.
     * 
     * @return número de cuenta
     */
	public String getCuenta() {
		return cuenta;
	}

    /**
     * Asigna el número de cuenta.
     * 
     * @param cuenta nuevo número de cuenta
     */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

    /**
     * Obtiene el nombre del titular de la cuenta.
     * 
     * @return nombre del titular
     */
	public String getNombre() {
		return nombre;
	}

    /**
     * Asigna el nombre del titular de la cuenta.
     * 
     * @param nombre nuevo nombre del titular
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
