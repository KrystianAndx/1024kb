package pl.krystian;

public class Boots {
    private int size;
    private boolean isNaturalSkin;

    public Boots (int size, boolean isNaturalSkin) {
        this.size = size;
        this.isNaturalSkin = isNaturalSkin;
    }

    public int getSize() {
        return size;
    }
    public boolean getisNaturalSkin() {
        return isNaturalSkin;
    }
}
