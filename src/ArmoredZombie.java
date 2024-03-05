class ArmoredZombie extends Zombie {
    private Armor armor;

    public ArmoredZombie(int health, int armorStrength) {
        super(health);
        armor = new Armor(armorStrength);
    }

    public void destroyed() {
        if (armor.getStrength() > 0) {
//            System.out.println("Armored zombie terkena serangan!");
            armor.destroyed();
            System.out.println("Armor strength saat ini: " + armor.getStrength());
        } else {
//            System.out.println("Armored zombie terkena serangan!");
            setHealth((int)(getHealth() * 0.98));
            System.out.println("Health saat ini: " + getHealth());
        }
    }

    public void getZombieInfo() {
        System.out.println("Armored zombie health: " + getHealth() + ", armor strength: " + armor.getStrength());
    }
}