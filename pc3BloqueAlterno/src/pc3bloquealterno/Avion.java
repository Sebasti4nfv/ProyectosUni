/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc3bloquealterno;

/**
 *
 * @author Jesus
 */
public class Avion 
{
    // atributos
    protected int ID; // correlativo
    protected int capacidadMaxima;
    protected int pasajerosActuales; // cada paajero pesa aprox 70kg
    protected int porcentajeOcupabilidad; // divisionm de pasajerosAactuales / capacidadMaxima
    protected String estado; // "desabhilitado" o "habilitado"
    // si estado = desahbilitado no debe permitir ingresar pasajerosActuales ni calcular % de ocupabilidad
    protected int pesoMaximo; // el limite es 6500kg  se obtiene de cantidadPasjeros / 70
    
    
    // constructor
    public Avion() 
    {
        
    }
    
    // para un estado = deshabilitado

    public Avion(int ID, int capacidadMaxima, int pesoMaximo, String estado) {
        this.ID = ID;
        this.capacidadMaxima = capacidadMaxima;
        this.pasajerosActuales = 0;
        this.porcentajeOcupabilidad = 0;
        this.estado = estado; // deshabilitado
        this.pesoMaximo = pesoMaximo;
    }
    
    public Avion(int ID, int capacidadMaxima, int pasajerosActuales, int pesoMaximo, String estado) {
        this.ID = ID;
        this.capacidadMaxima = capacidadMaxima;
        this.pasajerosActuales = pasajerosActuales;
        this.porcentajeOcupabilidad = ( (pasajerosActuales * 100) / capacidadMaxima) ;
        this.estado = estado; // habilitado
        this.pesoMaximo = pesoMaximo;
    }
    
    // gets y sets

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getPasajerosActuales() {
        return pasajerosActuales;
    }

    public void setPasajerosActuales(int pasajerosActuales) {
        this.pasajerosActuales = pasajerosActuales;
    }

    public int getPorcentajeOcupabilidad() {
        return porcentajeOcupabilidad;
    }

    public void setPorcentajeOcupabilidad(int porcentajeOcupabilidad) {
        this.porcentajeOcupabilidad = porcentajeOcupabilidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }
    
}
