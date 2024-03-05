class Zombie implements Destroyable {
    private int health;

    public Zombie(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void destroyed() {
        System.out.println("Zombie terkena serangan!");
        System.out.println("Health saat ini: " + getHealth());
    }

    public void getZombieInfo() {
        System.out.println("Zombie health: " + getHealth());
    }
}