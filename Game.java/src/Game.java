public class Game {
    public static void main(String[] args) {

        // membuat objek player
        Player schyte = new Player();

        // mengisi atribut player
        schyte.name = "Rofi Romawi" + "\n";
        schyte.speed = 70;
        schyte.healthPoin = 100;
        schyte.Damage = 500;
        schyte.attackSpeed = 125;

        // menjalankan method
        schyte.run();

        if (schyte.isDead()) {
            System.out.println("Game Over");
        }
    }
}
