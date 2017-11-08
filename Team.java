public class Team
{
    private String teamName;
    private Athlete[] players;
    
    
    public Team(int size, String name)
    {
        this.players = new Athlete[size];
        this.teamName = name;
    }
    public String toString(){
        String output = "The team members for " + this.teamName+ "\n";
        for (Athlete a : players){
            output += a + "\n";
        }
        return output;
    }
    public void addAthlete(Athlete a, int index){
        players[index] = a;
        
    }
}
