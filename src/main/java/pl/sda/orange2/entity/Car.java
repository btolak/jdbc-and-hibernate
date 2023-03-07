package pl.sda.orange2.entity;

import java.util.Objects;

public final class Car {
    private final Long id;
    private final String colour;
    private final String brand;
    private final String model;

    public Car(
            Long id,
            String colour,
            String brand,
            String model
    ) {
        this.id = id;
        this.colour = colour;
        this.brand = brand;
        this.model = model;
    }

    public Long id() {
        return id;
    }

    public String colour() {
        return colour;
    }

    public String brand() {
        return brand;
    }

    public String model() {
        return model;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Car) obj;
        return Objects.equals(this.id, that.id) &&
                Objects.equals(this.colour, that.colour) &&
                Objects.equals(this.brand, that.brand) &&
                Objects.equals(this.model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, colour, brand, model);
    }

    @Override
    public String toString() {
        return "Car[" +
                "id=" + id + ", " +
                "colour=" + colour + ", " +
                "brand=" + brand + ", " +
                "model=" + model + ']';
    }

}
