package co.com.sofka.Personal.Commands;

import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.Personal.Values.Horario;
import co.com.sofka.Personal.Values.Nombre;
import co.com.sofka.Personal.Values.PersonalID;
import co.com.sofka.Personal.Values.Telefono;
import co.com.sofka.domain.generic.Command;

public class AgregarEntrenador extends Command {
    private final PersonalID personalID;
    private final EntrenadorID entrenadorID;
    private final Horario horario;
    private final Nombre nombre;
    private final Telefono telefono;

    public AgregarEntrenador(PersonalID personalID, EntrenadorID entrenadorID, Horario horario, Nombre nombre, Telefono telefono) {
        this.personalID = personalID;
        this.entrenadorID = entrenadorID;
        this.horario = horario;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public PersonalID getPersonalID() {
        return personalID;
    }

    public EntrenadorID getEntrenadorID() {
        return entrenadorID;
    }

    public Horario getHorario() {
        return horario;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
