class Plant {
    public void attack(Destroyable d) {
//        System.out.println("Plant menyerang zombie");
        System.out.println("========= Plant Menyerang ArmoredZombie =========");
        System.out.println("========= Zombie Info =========");
        d.destroyed();
    }
}