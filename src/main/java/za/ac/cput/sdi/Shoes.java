package za.ac.cput.sdi;

import java.util.Objects;

public class Shoes {

    private String brand;
    private int size;

    public Shoes(String brand, int size) {
        this.setBrand(brand);
        this.setSize(size);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shoes shoe = (Shoes) o;
        return size == shoe.size && Objects.equals(brand, shoe.brand);
    }
}
