package co.com.sofka.Entrenamiento;

import co.com.sofka.Entrenamiento.Values.EntrenamientoID;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.List;

public class Entrenamiento extends AggregateEvent<EntrenamientoID> {

    protected List<>

    public Entrenamiento(EntrenamientoID entrenamientoID) {
        super(entrenamientoID);
    }
}
