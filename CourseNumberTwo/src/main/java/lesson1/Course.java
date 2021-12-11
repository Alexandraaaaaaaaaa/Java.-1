package lesson1;

public class Course {
    private Team team;
    private int distanceLength;

    public Course(Team team, int distanceLength) {
        this.team = team;
        this.distanceLength = distanceLength;
    }

    public void doIt() {
        for(int i = 0; i < this.team.players.length; ++i) {
            String var10001 = this.team.players[i].name;
            System.out.println(var10001 + " пробежал за " + this.distanceLength / this.team.players[i].speed + " секунд");
        }

    }
}
