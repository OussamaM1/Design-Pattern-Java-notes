public class DevelopmentManager extends HiringManager {

    @Override
    public Interviewer makeInterviewer() {
        return new Developer();
    }

}
