package co.com.sofka.Entrenamiento.Commands;

import co.com.sofka.Entrenamiento.Values.EntrenamientoID;
import co.com.sofka.Entrenamiento.Values.UsuarioID;
import co.com.sofka.domain.generic.Command;

public class CrearEntrenamiento extends Command {
    private final EntrenamientoID entrenamientoID;
    private final UsuarioID usuarioID;

    public CrearEntrenamiento(EntrenamientoID entrenamientoID, UsuarioID usuarioID) {
        this.entrenamientoID = entrenamientoID;
        this.usuarioID = usuarioID;
    }

    public EntrenamientoID getEntrenamientoID() {
        return entrenamientoID;
    }

    public UsuarioID getUsuarioID() {
        return usuarioID;
    }
}
