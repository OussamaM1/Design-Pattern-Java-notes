public abstract class HiringManager {

    // Factory method
    abstract Interviewer makeInterviewer();

    public void takeInterview() {
        Interviewer interviewer = makeInterviewer();
        interviewer.askQuestions();
    }
}
