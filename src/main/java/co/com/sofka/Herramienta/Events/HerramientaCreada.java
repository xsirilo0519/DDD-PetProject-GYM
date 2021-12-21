package co.com.sofka.Herramienta.Events;

import co.com.sofka.Entrenamiento.Values.EntrenamientoID;
import co.com.sofka.domain.generic.DomainEvent;

public class HerramientaCreada extends DomainEvent {
    private final EntrenamientoID entrenamientoID;

    public HerramientaCreada(EntrenamientoID entrenamientoID) {
        super("sofka.herramienta.herramientaCreada");
        this.entrenamientoID = entrenamientoID;
    }

    public EntrenamientoID getEntrenamientoID() {
        return entrenamientoID;
    }
}
