package co.com.sofka.Entrenamiento.Values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Calentamiento implements ValueObject<String> {
    private final String value;

    public Calentamiento(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La caracteristica no puede ser vacia");
        }
    }
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calentamiento that = (Calentamiento) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
