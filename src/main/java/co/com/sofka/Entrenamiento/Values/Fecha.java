package co.com.sofka.Entrenamiento.Values;

import co.com.sofka.domain.generic.ValueObject;

import java.sql.Time;
import java.util.Date;
import java.util.Objects;

public class Fecha implements ValueObject<Date> {
    private final Date value;

    public Fecha(Date value) {
        this.value = Objects.requireNonNull(value);
    }
    public Date value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fecha that = (Fecha) o;
        return Objects.equals(value, that.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
