package co.com.sofka.Herramienta;

import co.com.sofka.Herramienta.Events.*;
import co.com.sofka.Personal.Entrenador;
import co.com.sofka.Personal.Events.EntrenadorAgregado;
import co.com.sofka.Personal.Events.GerenteAgregado;
import co.com.sofka.Personal.Events.NombredeUnEntrenadorActualizado;
import co.com.sofka.Personal.Events.PersonalCreado;
import co.com.sofka.Personal.Gerente;
import co.com.sofka.domain.generic.EventChange;

import java.util.ArrayList;

public class HerramientaChange extends EventChange {

    public HerramientaChange(Herramienta herramienta) {

        apply((HerramientaCreada event)->{
            herramienta.entrenamientoID=event.getEntrenamientoID();
            herramienta.elementoList=new ArrayList<>();
            herramienta.maquinaList=new ArrayList<>();
        });


        apply((MaquinaAgregada event)->{
            herramienta.maquinaList.add(new Maquina(event.getMaquinaID(),
                    event.getEstado(),
                    event.getDescripcion()));
        });
        apply((ElementoAgregado event)->{
            herramienta.elementoList.add(new Elemento(event.getElementoID(),
                    event.getEstado(),
                    event.getDescripcion()));
        });
        apply((ElementoAgregado event)->{
            herramienta.elementoList.add(new Elemento(event.getElementoID(),
                    event.getEstado(),
                    event.getDescripcion()));
        });
        apply((EstadodeMaquinaActualizada event)->{
            var maquina=herramienta.getMaquinaPorId(event.getMaquinaID())
                    .orElseThrow(()->new IllegalArgumentException("No se encontro la maquina"));
            maquina.actualizarEstado(event.getEstado());
        });
        apply((EstadodeElementoActualizado event)->{
            var elemento=herramienta.getElementoPorId(event.getElementoID())
                    .orElseThrow(()->new IllegalArgumentException("No se encontro el elemento"));
            elemento.actualizarEstado(event.getEstado());
        });

        apply((DescripciondeMaquinaActualizada event)->{
            var maquina=herramienta.getMaquinaPorId(event.getMaquinaID())
                    .orElseThrow(()->new IllegalArgumentException("No se encontro la maquina"));
            maquina.actualizarDescripcion(event.getDescripcion());
        });
        apply((DescripciondeElementoActualizada event)->{
            var elemento=herramienta.getElementoPorId(event.getElementoID())
                    .orElseThrow(()->new IllegalArgumentException("No se encontro el elemento"));
            elemento.actualizarDescripcion(event.getDescripcion());
        });
    }
}
