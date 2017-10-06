/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import java.util.Objects;

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

    public Coche(String matricula) {
        this.matricula = matricula;
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

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Coche other = (Coche) obj;
        if (this.cilindrada != other.cilindrada) {
            return false;
        }
        if (this.potencia != other.potencia) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.motor, other.motor)) {
            return false;
        }
        return true;
    }


}
