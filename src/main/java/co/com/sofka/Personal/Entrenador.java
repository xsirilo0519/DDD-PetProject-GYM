package co.com.sofka.Personal;

import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.Generic.NutricionistaID;
import co.com.sofka.Personal.Values.Horario;
import co.com.sofka.Personal.Values.Nombre;
import co.com.sofka.Personal.Values.Telefono;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Entrenador extends Entity<EntrenadorID> {
    private Horario horario;
    private Nombre nombre;
    private Telefono telefono;


    public Entrenador(EntrenadorID entrenadorID, Horario horario, Nombre nombre, Telefono telefono) {
        super(entrenadorID);
        this.horario=horario;
        this.nombre=nombre;
        this.telefono=telefono;
    }

    public void actualizarNombre(Nombre nombre){
        this.nombre= Objects.requireNonNull(nombre);
    }
    public void actualizarHorario(Horario horario){
        this.horario= Objects.requireNonNull(horario);
    }
    public void actualizarTelefono(Telefono telefono){
        this.telefono= Objects.requireNonNull(telefono);
    }


    public Horario horario() {
        return horario;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Telefono telefono() {
        return telefono;
    }
}
