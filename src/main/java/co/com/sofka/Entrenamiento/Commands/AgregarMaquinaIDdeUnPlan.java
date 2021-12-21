package co.com.sofka.Entrenamiento.Commands;

import co.com.sofka.Entrenamiento.Values.EntrenamientoID;
import co.com.sofka.Entrenamiento.Values.PlanID;
import co.com.sofka.Generic.MaquinaID;
import co.com.sofka.domain.generic.Command;

import java.util.List;

public class AgregarMaquinaIDdeUnPlan extends Command {
    private final EntrenamientoID entrenamientoID;
    private final PlanID planID;
    private final List<MaquinaID> maquinaIDList;

    public AgregarMaquinaIDdeUnPlan(EntrenamientoID entrenamientoID, PlanID planID, List<MaquinaID> maquinaIDList) {
        this.entrenamientoID = entrenamientoID;
        this.planID = planID;
        this.maquinaIDList = maquinaIDList;
    }

    public EntrenamientoID getEntrenamientoID() {
        return entrenamientoID;
    }

    public PlanID getPlanID() {
        return planID;
    }

    public List<MaquinaID> getMaquinaIDList() {
        return maquinaIDList;
    }
}
