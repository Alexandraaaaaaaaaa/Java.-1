package lesson1;

public class Course {
    private Team team;
    private int distanceLength;

    public Course(Team team,int distanceLength){
        this.team = team;
        this.distanceLength = distanceLength;
    }

    //{Имя игрока} пробежал за {формула} секунд
    public void doIt()
    {
        for(int i = 0; i < team.players.length; i++) {
            System.out.println(team.players[i].name +" пробежал за "+distanceLength/team.players[i].speed+ " секунд");

        }
    }
}


