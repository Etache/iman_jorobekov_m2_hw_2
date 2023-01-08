public class BucharatiTeam extends Passione{
    private String strongestStand;

    public BucharatiTeam(String teamsName, Integer membersNumber, String strongestStand) {
        super(teamsName, membersNumber);
        this.strongestStand = strongestStand;
    }

    public String getStrongestStand() {
        return strongestStand;
    }

    public void setStrongestStand(String strongestStand) {
        this.strongestStand = strongestStand;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Имя банды: " + getTeamsName() + "\nКоличество членов: " + getMembersNumber() + "\nСильнейший стенд - " + getStrongestStand());
    }
}
