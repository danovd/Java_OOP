package _08_Inheritance_Exersise_03_PlayersAndMonsters;

public class Hero {
    private String username;
    private int level;

    public Hero(String username, int level) {
        this.username = username;
        this.level = level;
    }

    public String getUsername() {
        return username;
    }

    public int getLevel() {
        return level;
    }
    @Override
    public String toString() {
        return String.format("Type: %s Username: %s Level: %s",
                this.getClass().getName().trim(),
                this.getUsername().trim(),
                this.getLevel()).trim();
    }

}
