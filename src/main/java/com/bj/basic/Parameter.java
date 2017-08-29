package com.bj.basic;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

/**
 * Immutable parameter entry, the key and value cannot be null
 *
 * @author Liu Dong
 */
public class Parameter<T> implements Map.Entry<String, T>, Serializable {
    private static final long serialVersionUID = -6525353427059094141L;

    private final String name;
    private final T value;

    public Parameter(String key, T value) {
        this.name = Objects.requireNonNull(key);
        this.value = Objects.requireNonNull(value);
    }

    public static <V> Parameter<V> of(String key, V value) {
        return new Parameter<>(key, value);
    }

    public String getKey() {
        return name;
    }

    /**
     * Create a new pair with new key
     */
    public Parameter<T> withKey(String newKey) {
        return new Parameter<>(newKey, value);
    }

    public String getName() {
        return name;
    }

    /**
     * Create a new pair with new key
     */
    public Parameter<T> withName(String newKey) {
        return new Parameter<>(newKey, value);
    }

    public T getValue() {
        return value;
    }

    @Override
    public T setValue(T value) {
        throw new UnsupportedOperationException("Pair is read only");
    }

    /**
     * Create a new pair with new value
     */
    public Parameter<T> withValue(T newValue) {
        return new Parameter<>(name, newValue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parameter<?> parameter = (Parameter<?>) o;

        if (!name.equals(parameter.name)) return false;
        return value.equals(parameter.value);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + value.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "(" + name + " = " + value + ")";
    }
}
