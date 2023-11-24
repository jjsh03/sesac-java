package _05_class._access_modifier._pack05;

public class Player {
    private int backNum;
    private String name;
    private String team;

    public Player(String name) {
        this.name = name;
    }

    public void setBackNum(int backNum) {
        this.backNum = backNum;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getBackNum() {
        return backNum;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }
}
