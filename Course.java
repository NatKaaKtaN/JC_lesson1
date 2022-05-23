package lesson1;

public class Course {

    Pool[] course = new Pool[3];

    public Course(Pool pool1, Pool pool2, Pool pool3) {
        course[0] = pool1;
        course[1] = pool2;
        course[2] = pool3;
    }

    public void doIt (Team t) {
        System.out.println("\nTeam \"" + t.teamName + "\":\n");
        for (Competitor com : t.getTeammates()) {
            for (Pool pool: course) {
                pool.doIt(com);
            }
        }
    }

}
