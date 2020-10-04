package seedu.address.model.person;

import static java.util.Objects.requireNonNull;

import java.util.Objects;

/**
 * Represents a Person's remark in the address book.
 * Guarantees: immutable; is always valid
 */
public class Remark {

    public final String value;

    /**
     * Constructs a {@code Remark}.
     *
     * @param remark A remark.
     */
    public Remark(String remark) {
        requireNonNull(remark);
        this.value = remark;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Remark)) {
            return false;
        }
        Remark remark = (Remark) other;
        return getValue().equals(remark.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }
}
