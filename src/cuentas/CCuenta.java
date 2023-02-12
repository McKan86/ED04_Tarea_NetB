/**
 *
 * Clase que representa una cuenta bancaria
 *
 * @author Omar De Miguel
 */
package cuentas;

public class CCuenta {

    /**
     * Nombre del titular de la cuenta
     */
    private String nombre;
    /**
     * Número de cuenta
     */
    private String cuenta;
    /**
     * Saldo actual de la cuenta
     */
    private double saldo;
    /**
     * Tipo de interés asociado a la cuenta
     */
    private double tipoInterés;

    /**
     * Crea una nueva instancia de la clase CCuenta con valores por defecto
     */
    public CCuenta() {
    }

    /**
     * Constructor que inicializa todos los atributos de la cuenta.
     *
     * @param nom Nombre del titular de la cuenta
     * @param cue Número de cuenta
     * @param sal Saldo actual de la cuenta
     * @param tipo Tipo de interés asociado a la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Método que devuelve el saldo actual de la cuenta.
     *
     * @return Saldo actual en la cuenta.
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Método que permite ingresar una cantidad en la cuenta.
     *
     * @param cantidad Cantidad a ingresar en la cuenta.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método que permite retirar una cantidad de la cuenta.
     *
     * @param cantidad Cantidad a retirar de la cuenta.
     * @throws Exception Si la cantidad es negativa o el saldo es insuficiente.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Devuelve el nombre del titular de la cuenta.
     *
     * @return Nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta
     *
     * @param nombre El nombre a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el número de cuenta
     *
     * @return El número de cuenta como una cadena de texto
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método que permite establecer el número de cuenta
     *
     * @param cuenta El nuevo número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método que devuelve el saldo actual de la cuenta
     *
     * @return El saldo actual de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método que permite establecer el saldo de la cuenta
     *
     * @param saldo El nuevo saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método que devuelve el tipo de interés actual de la cuenta
     *
     * @return El tipo de interés actual de la cuenta
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método que permite establecer el tipo de interés de la cuenta
     *
     * @param tipoInterés El nuevo tipo de interés de la cuenta
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
