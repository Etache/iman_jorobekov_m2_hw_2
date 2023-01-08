public class DiaboroTeam extends Passione {
    private String smarterMember;

    public DiaboroTeam(String teamsName, Integer membersNumber, String smarterMember) {
        super(teamsName, membersNumber);
        this.smarterMember = smarterMember;
    }

    public String getSmarterMember() {
        return smarterMember;
    }

    public void setSmarterMember(String smarterMember) {
        this.smarterMember = smarterMember;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("------");
        System.out.println("Имя отряда: " + getTeamsName() + ". Кол-во членов: " + getMembersNumber() + ". Самый пафосный мужик отряда: " + getSmarterMember());
    }
}
