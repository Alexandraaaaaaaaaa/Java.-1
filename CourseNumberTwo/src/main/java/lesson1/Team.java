package lesson1;

public class Team {
    String teamName;
    Player[] players = new Player[4];
    private int totalPlayers = 0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addPlayer(Player player) {
        if (this.totalPlayers < 4) {
            this.players[this.totalPlayers] = player;
            ++this.totalPlayers;
        }

    }
}
