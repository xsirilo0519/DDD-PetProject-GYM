package co.com.sofka.Herramienta.Values;

import co.com.sofka.Personal.Values.Telefono;
import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Estado implements ValueObject<Boolean> {
    private final Boolean value;

    public Estado(Boolean value) {
        this.value = Objects.requireNonNull(value);
    }
    public Boolean value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estado that = (Estado) o;
        return Objects.equals(value, that.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
