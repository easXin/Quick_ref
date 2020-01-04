package OOP.Encapsulation;

public class EnhancedPlayer {
    private String name;
    /* protect from unauthorized access field directly*/
    /* Restrict health to 100, if incoming health is invalid*/
    private int health = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health>0 && health<=100){
            this.health = health;
        }

        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player knocked out");
        }
    }

    public int getHealth() {
        return this.health;
    }
}
