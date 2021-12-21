package co.com.sofka.Entrenamiento.Values;

import co.com.sofka.domain.generic.Identity;

public class EntrenamientoID extends Identity {

    public EntrenamientoID(){

    }

    private EntrenamientoID(String id){
        super(id);
    }

    public static EntrenamientoID of(String id){
        return new EntrenamientoID(id);
    }
}
