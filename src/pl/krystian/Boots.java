package pl.krystian;

public class Boots {
    private String size;
    private boolean isNaturalSkin;

    public Boots (String size, boolean isNaturalSkin) {
        this.size = size;
        this.isNaturalSkin = isNaturalSkin;
    }

    public String  getSize() {
        return size;
    }
    public boolean getisNaturalSkin() {
        return isNaturalSkin;
    }
}
