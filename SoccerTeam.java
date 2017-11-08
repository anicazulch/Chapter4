
public class SoccerTeam
{
    
    public static void main(String args[])
    {
        Team acalanes = new Team (4, "Acalanes Soccer");
        Athlete josie = new Athlete("Josie", 16);
        acalanes.addAthlete(josie,0);
        Athlete lauren = new Athlete("Lauren", 17);
        acalanes.addAthlete(lauren,1);
        Athlete shannon = new Athlete("Shannon", 16);
        acalanes.addAthlete(shannon,2);
        System.out.println(acalanes);
        
    }

}
