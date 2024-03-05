class WalkingZombie extends Zombie {
    public WalkingZombie(int health) {
        super(health);
    }

    public void destroyed() {
        System.out.println("Walking zombie terkena serangan!");
        setHealth((int)(getHealth() * 0.96));
        System.out.println("Health saat ini: " + getHealth());
    }

    public void getZombieInfo() {
        System.out.println("Walking zombie health: " + getHealth());
    }
}