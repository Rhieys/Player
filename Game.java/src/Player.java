public class Player {
    
        //definisi atribut
        String name;
        int speed;
        int healthPoin;
        int Damage;
        int attackSpeed;

        //definisi method run
        void run(){
            System.out.println(name + "Load stat...");
            System.out.println("HP : " + healthPoin);
            System.out.println("Speed : " + speed);
            System.out.println("Damage : " + Damage);
            System.out.println("His attack speed is : "+attackSpeed);
        }

        //definisi method isDead untuk mengecek nilai kesehatan (healthPoin)
        boolean isDead(){
            if(healthPoin <= 0) return true;
            return false;
        }
    }

