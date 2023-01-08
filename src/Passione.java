public class Passione implements Printable {
    private String teamsName;
    private Integer membersNumber;

    public Passione(String teamsName, Integer membersNumber) {
        this.teamsName = teamsName;
        this.membersNumber = membersNumber;
    }

    public String getTeamsName() {
        return teamsName;
    }

    public void setTeamsName(String teamsName) {
        this.teamsName = teamsName;
    }

    public Integer getMembersNumber() {
        return membersNumber;
    }

    public void setMembersNumber(Integer membersNumber) {
        this.membersNumber = membersNumber;
    }

    @Override
    public void print() {

    }
}
