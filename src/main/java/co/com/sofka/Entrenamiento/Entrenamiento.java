package co.com.sofka.Entrenamiento;

import co.com.sofka.Entrenamiento.Values.EntrenamientoID;
import co.com.sofka.domain.generic.AggregateEvent;

public class Entrenamiento extends AggregateEvent<EntrenamientoID> {

    public Entrenamiento(EntrenamientoID entityId) {
        super(entityId);
    }
}
