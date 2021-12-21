package co.com.sofka.Entrenamiento;

import co.com.sofka.Entrenamiento.Values.*;
import co.com.sofka.Generic.ElementoID;
import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.domain.generic.Entity;

import java.util.List;
import java.util.Objects;

public class Sesion extends Entity<SesionID> {
    private EntrenadorID entrenadorID;
    private Sala sala;
    private Fecha fecha;
    private Duracion duracion;
    private List<ElementoID> elementoIDList;

    public Sesion(SesionID sesionID,EntrenadorID entrenadorID,Sala sala,Fecha fecha,Duracion duracion) {
        super(sesionID);
        this.entrenadorID=entrenadorID;
        this.sala=sala;
        this.fecha=fecha;
        this.duracion=duracion;
    }

    public void actualizarEntrenadorID(EntrenadorID entrenadorID){
        this.entrenadorID= Objects.requireNonNull(entrenadorID);
    }
    public void actualizarSala(Sala sala){
        this.sala=Objects.requireNonNull(sala);
    }
    public void actualizarFecha(Fecha fecha){
        this.fecha=Objects.requireNonNull(fecha);
    }
    public void actualizarDuracion(Duracion duracion){
        this.duracion=Objects.requireNonNull(duracion);
    }
    public void agregarElementoID(List<ElementoID> elementoIDList){
        this.elementoIDList=Objects.requireNonNull(elementoIDList);
    }

    public EntrenadorID entrenadorID() {
        return entrenadorID;
    }

    public Sala sala() {
        return sala;
    }

    public Fecha fecha() {
        return fecha;
    }

    public Duracion duracion() {
        return duracion;
    }

    public List<ElementoID> elementoIDList() {
        return elementoIDList;
    }
}
