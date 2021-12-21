package co.com.sofka.Herramienta;

import co.com.sofka.Entrenamiento.Values.EntrenamientoID;
import co.com.sofka.Generic.ElementoID;
import co.com.sofka.Generic.EntrenadorID;
import co.com.sofka.Generic.MaquinaID;
import co.com.sofka.Generic.NutricionistaID;
import co.com.sofka.Herramienta.Events.*;
import co.com.sofka.Herramienta.Values.Descripcion;
import co.com.sofka.Herramienta.Values.Estado;
import co.com.sofka.Herramienta.Values.HerramientaID;
import co.com.sofka.Personal.*;
import co.com.sofka.Personal.Events.EntrenadorAgregado;
import co.com.sofka.Personal.Events.NutricionistaAgregado;
import co.com.sofka.Personal.Events.PersonalCreado;
import co.com.sofka.Personal.Events.TelefonodeUnGerenteActualizado;
import co.com.sofka.Personal.Values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Herramienta extends AggregateEvent<HerramientaID> {
    protected EntrenamientoID entrenamientoID;
    protected List<Maquina> maquinaList;
    protected List<Elemento> elementoList;

    public Herramienta(HerramientaID herramientaIDId, EntrenamientoID entrenamientoID) {
        super(herramientaIDId);
        appendChange(new HerramientaCreada(entrenamientoID)).apply();
    }

    private Herramienta(HerramientaID herramientaID){
        super(herramientaID);
        subscribe(new HerramientaChange(this));
    }
    //recrear eventos y obtener agregados que ya existen
    public static Herramienta from(HerramientaID herramientaID, List<DomainEvent> events){
        var herramienta=new Herramienta(herramientaID);
        events.forEach(herramienta::applyEvent);
        return herramienta;
    }

    public void agregarMaquina(MaquinaID maquinaID, Estado estado, Descripcion descripcion){
        Objects.requireNonNull(maquinaID);
        Objects.requireNonNull(estado);
        Objects.requireNonNull(descripcion);
        appendChange(new MaquinaAgregada(maquinaID,estado,descripcion)).apply();
    }
    public void agregarElemento(ElementoID elementoID, Estado estado, Descripcion descripcion){
        Objects.requireNonNull(elementoID);
        Objects.requireNonNull(estado);
        Objects.requireNonNull(descripcion);
        appendChange(new ElementoAgregado(elementoID,estado,descripcion)).apply();
    }
    public void actualizarEstadodeMaquina(MaquinaID maquinaID, Estado estado){
        Objects.requireNonNull(maquinaID);
        Objects.requireNonNull(estado);
        appendChange(new EstadodeMaquinaActualizada(maquinaID,estado)).apply();
    }
    public void actualizarEstadodeElemento(ElementoID elementoID, Estado estado){
        Objects.requireNonNull(elementoID);
        Objects.requireNonNull(estado);
        appendChange(new EstadodeElementoActualizado(elementoID,estado)).apply();
    }
    public void actualizarDescripciondeMaquina(MaquinaID maquinaID, Descripcion descripcion){
        Objects.requireNonNull(maquinaID);
        Objects.requireNonNull(descripcion);
        appendChange(new DescripciondeMaquinaActualizada(maquinaID,descripcion)).apply();
    }
    public void actualizarDescripciondeElemento(ElementoID elementoID, Descripcion descripcion){
        Objects.requireNonNull(elementoID);
        Objects.requireNonNull(descripcion);
        appendChange(new DescripciondeElementoActualizada(elementoID,descripcion)).apply();
    }

    public Optional<Maquina> getMaquinaPorId(MaquinaID maquinaID){
        return maquinaList.stream().filter(maqui->maqui.identity().equals(maquinaID)).findFirst();
    }

    public Optional<Elemento> getElementoPorId(ElementoID elementoID){
        return elementoList.stream().filter(ele->ele.identity().equals(elementoID)).findFirst();
    }
}
