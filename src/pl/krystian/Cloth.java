package pl.krystian;

public class Cloth extends Product{
    private String size;
    private String material;

    public Cloth(String size, String material) {
        this.size = size;
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }
}
