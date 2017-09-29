/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

/**
 *
 * @author DAM
 */
public class Coche {

    private String matricula;
    private int cilindrada;
    private int potencia;
    private String motor;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public Coche() {
    }

    public Coche(String matricula, int cilindrada, int potencia, String motor) {
        this.matricula = matricula;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Coche{" + "matricula=" + matricula + ", cilindrada=" + cilindrada + ", potencia=" + potencia + ", motor=" + motor + '}';
    }


}
