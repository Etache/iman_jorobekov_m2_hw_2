public class Main {
    public static void main(String[] args) {
        Passione dTeam = createObject("Diaboro");
        dTeam.print();

        Passione bTeam = createObject("Bucciarati");
        bTeam.print();

        Passione rTeam = createObject("Rizotto");
        rTeam.print();

//        Passione bTeam = new Passione("Банда Бучеллати", 3);
//        classname.print();
    }

    public static Passione createObject(String className) {
        switch (className) {
            case "Bucciarati":
                return new BucciaratiTeam("Банда Бучеллатти", 6, "Gold Experience");
            case "Rizotto":
                return new RizottoTeam("Банда Ризотто", 9, "Ризотто Нерро");
            case "Diaboro":
                return new DiaboroTeam("Отряд Дьяволо", 6, "Чокколата");
            default:
                return null;
        }
    }
}



















