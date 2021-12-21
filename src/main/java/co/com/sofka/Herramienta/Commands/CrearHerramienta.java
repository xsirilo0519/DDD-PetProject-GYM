package co.com.sofka.Herramienta.Commands;

import co.com.sofka.Entrenamiento.Values.EntrenamientoID;
import co.com.sofka.Herramienta.Herramienta;
import co.com.sofka.Herramienta.Values.HerramientaID;
import co.com.sofka.domain.generic.Command;

public class CrearHerramienta extends Command {
    private final HerramientaID herramientaID;
    private final EntrenamientoID entrenamientoID;

    public CrearHerramienta(HerramientaID herramientaID, EntrenamientoID entrenamientoID) {
        this.herramientaID = herramientaID;
        this.entrenamientoID = entrenamientoID;
    }

    public HerramientaID getHerramientaID() {
        return herramientaID;
    }

    public EntrenamientoID getEntrenamientoID() {
        return entrenamientoID;
    }
}
