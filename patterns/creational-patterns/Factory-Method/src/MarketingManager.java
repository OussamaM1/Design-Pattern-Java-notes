public class MarketingManager extends HiringManager {

    @Override
    public Interviewer makeInterviewer() {
        return new CommunityExecutive();
    }

}
