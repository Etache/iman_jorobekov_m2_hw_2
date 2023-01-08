public class RizottoTeam extends Passione {
    private String pathosMember;

    public RizottoTeam(String teamsName, Integer membersNumber, String pathosMember) {
        super(teamsName, membersNumber);
        this.pathosMember = pathosMember;
    }

    public String getPathosMember() {
        return pathosMember;
    }

    public void setPathosMember(String pathosMember) {
        this.pathosMember = pathosMember;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("------");
        System.out.println("Имя группировки: " + getTeamsName() + ". Кол-во участников: " + getMembersNumber() + ". Самый умный чел группы - " + getPathosMember());
    }
}
