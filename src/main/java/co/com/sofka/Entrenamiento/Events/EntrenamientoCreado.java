package co.com.sofka.Entrenamiento.Events;

import co.com.sofka.Entrenamiento.Values.UsuarioID;
import co.com.sofka.domain.generic.DomainEvent;

public class EntrenamientoCreado extends DomainEvent {

    private final UsuarioID usuarioID;

    public EntrenamientoCreado(UsuarioID usuarioID) {
        super("sofka.entrenamiento.entrenamientoCreado");
        this.usuarioID=usuarioID;
    }

    public UsuarioID getUsuarioID() {
        return usuarioID;
    }
}
