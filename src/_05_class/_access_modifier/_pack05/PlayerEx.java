package _05_class._access_modifier._pack05;

public class PlayerEx {
    public static void main(String[] args) {
        Player p1 = new Player("back-ho");
        Player p2 = new Player("Dea-man");

        p1.setTeam("SHOHOKU");
        p1.setBackNum(10);
        p2.setTeam("SHOHOKU");
        p2.setBackNum(14);

        System.out.printf("%s 의 정보 : %d %s %n", p1.getName(), p1.getBackNum(), p1.getTeam());
        System.out.printf("%s 의 정보 : %d %s %n", p2.getName(), p2.getBackNum(), p2.getTeam());
    }
}
