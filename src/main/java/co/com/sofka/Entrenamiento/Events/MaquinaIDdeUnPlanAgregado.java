package co.com.sofka.Entrenamiento.Events;

import co.com.sofka.Entrenamiento.Values.PlanID;
import co.com.sofka.Generic.ElementoID;
import co.com.sofka.Generic.MaquinaID;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class MaquinaIDdeUnPlanAgregado extends DomainEvent {
    private final PlanID planID;
    private final List<MaquinaID> maquinaIDList;
    public MaquinaIDdeUnPlanAgregado(PlanID planID, List<MaquinaID> maquinaIDList) {
        super("sofka.entrenamiento.maquinaIDdeUnPlanAgregado");
        this.planID=planID;
        this.maquinaIDList=maquinaIDList;
    }

    public PlanID getPlanID() {
        return planID;
    }

    public List<MaquinaID> getMaquinaIDList() {
        return maquinaIDList;
    }
}
