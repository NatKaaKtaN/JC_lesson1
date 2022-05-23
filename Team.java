package lesson1;

public class Team {
    String teamName;
    Competitor[] member = new Competitor[4];
    Animal[] team = {new Cat("Томас"), new Wolf("Серый"), new Turtle("Соня"), new Dog("Шарик")};

    public Team (String teamName, Competitor com1, Competitor com2, Competitor com3, Competitor com4) {
        this.teamName = teamName;
        member[0] = com1;
        member[1] = com2;
        member[2] = com3;
        member[3] = com4;
        for(int i = 0; i < 4; i++){
        }
    }


    public Competitor[] getTeammates() {
        return member;
    }
    public void passedTheDistance() {
        for (Competitor com :member) {
            if (com.isOnDistance()) {
                com.info();
            }
        }
    }

    public void showResults() {
        for (Competitor com : member) {
            com.info();
        }
    }

}
