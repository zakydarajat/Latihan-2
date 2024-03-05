

class Main{
    public static void main(String[] args) {
        Plant plant = new Plant();
        Zombie zombie1 = new WalkingZombie(100);
        Zombie zombie2 = new ArmoredZombie(100, 100);

//        plant.attack(zombie1);
        int x;
        for (x=0;x<=100;x++){
            plant.attack(zombie2);
        }
    }

}