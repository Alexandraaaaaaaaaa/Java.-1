package lesson1;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Team team = new Team("Lions");
        team.addPlayer(new Player("Вася", 10));
        team.addPlayer(new Player("Алевтина", 7));
        team.addPlayer(new Player("Евстафий", 11));
        team.addPlayer(new Player("Изольда", 5));
        Course course = new Course(team, 1000);
        course.doIt();
    }
}

