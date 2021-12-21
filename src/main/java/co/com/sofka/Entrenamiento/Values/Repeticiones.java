package co.com.sofka.Entrenamiento.Values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class Repeticiones implements ValueObject<Integer> {

    private final Integer value;

    public Repeticiones(Integer value) {
        this.value = Objects.requireNonNull(value);
    }
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Repeticiones that = (Repeticiones) o;
        return Objects.equals(value, that.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
