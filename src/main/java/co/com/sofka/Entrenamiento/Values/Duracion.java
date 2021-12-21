package co.com.sofka.Entrenamiento.Values;

import co.com.sofka.domain.generic.ValueObject;

import java.sql.Time;
import java.util.Objects;

public class Duracion implements ValueObject<Time> {
    private final Time value;

    public Duracion(Time value) {
        this.value = Objects.requireNonNull(value);
    }
    public Time value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duracion that = (Duracion) o;
        return Objects.equals(value, that.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}
