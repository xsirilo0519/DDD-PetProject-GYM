package co.com.sofka.Personal.Commands;

import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.Personal.Values.Nombre;
import co.com.sofka.Personal.Values.PersonalID;
import co.com.sofka.domain.generic.Command;

public class ActualizarNombredeUnEntrenador extends Command {
    private final PersonalID personalID;
    private final EntrenadorID entrenadorID;
    private final Nombre nombre;

    public ActualizarNombredeUnEntrenador(PersonalID personalID, EntrenadorID entrenadorID, Nombre nombre) {
        this.personalID = personalID;
        this.entrenadorID = entrenadorID;
        this.nombre = nombre;
    }

    public PersonalID getPersonalID() {
        return personalID;
    }

    public EntrenadorID getEntrenadorID() {
        return entrenadorID;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
