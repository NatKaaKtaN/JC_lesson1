package lesson1;


public class Main {
        public static void main(String[] args) {

                Pool[] pools = {new Pool(4), new Pool(8), new Pool(10)};
                Competitor[] competitors = {new Cat("Томас"), new Wolf("Серый"), new Turtle("Соня"), new Dog("Шарик")};
                for (Competitor c : competitors) {
                        for (Pool pool : pools) {
                                pool.doIt(c);
                                if (!c.isOnDistance()) {
                                        break;
                                }
                        }
                }
                for (Competitor c : competitors) {
                        c.info();
                }
                Team team = new Team("Четыре лапы", new Cat("Томас"), new Wolf("Серый"), new Turtle("Соня"), new Dog("Шарик"));
                Course c = new Course(new Pool(4), new Pool(8), new Pool(10));

                c.doIt(team);

                System.out.println("\nWinners:");
                team.passedTheDistance();

                System.out.println("\nResult:");
                team.showResults();
        }

}



