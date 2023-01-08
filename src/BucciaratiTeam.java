public class BucciaratiTeam extends Passione {
    private String strongestStand;

    public BucciaratiTeam(String teamsName, Integer membersNumber, String strongestStand) {
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
        System.out.println("------");
        System.out.println("Имя банды: " + getTeamsName() + ". Количество членов: " + getMembersNumber() + ". Сильнейший стенд - " + getStrongestStand());
    }
}
