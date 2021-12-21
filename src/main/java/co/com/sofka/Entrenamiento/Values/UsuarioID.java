package co.com.sofka.Entrenamiento.Values;

import co.com.sofka.domain.generic.Identity;

public class UsuarioID extends Identity {
    public UsuarioID() {

    }

    private UsuarioID(String id) {
        super(id);
    }

    public static UsuarioID of(String id) {
        return new UsuarioID(id);

    }
}
