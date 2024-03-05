class Armor implements Destroyable {
    private int strength;

    public Armor(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void destroyed() {
        setStrength((int)(
                getStrength() * 0.95)
        );
    }

    public void getArmorInfo() {
        System.out.println("Armor strength: " + getStrength());
    }
}