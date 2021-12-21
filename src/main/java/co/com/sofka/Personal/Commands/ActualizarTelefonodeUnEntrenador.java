package co.com.sofka.Personal.Commands;

import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.Personal.Values.Horario;
import co.com.sofka.Personal.Values.PersonalID;
import co.com.sofka.Personal.Values.Telefono;
import co.com.sofka.domain.generic.Command;

public class ActualizarTelefonodeUnEntrenador extends Command {
    private final PersonalID personalID;
    private final EntrenadorID entrenadorID;
    private final Telefono telefono;

    public ActualizarTelefonodeUnEntrenador(PersonalID personalID, EntrenadorID entrenadorID, Telefono telefono) {
        this.personalID = personalID;
        this.entrenadorID = entrenadorID;
        this.telefono = telefono;
    }

    public PersonalID getPersonalID() {
        return personalID;
    }

    public EntrenadorID getEntrenadorID() {
        return entrenadorID;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
