package co.com.sofka.Entrenamiento.Values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Series implements ValueObject<Integer> {
    private final Integer value;

    public Series(Integer value) {
        this.value = Objects.requireNonNull(value);
    }
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Series that = (Series) o;
        return Objects.equals(value, that.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
