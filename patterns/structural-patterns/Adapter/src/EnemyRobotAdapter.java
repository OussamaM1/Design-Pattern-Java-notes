public class EnemyRobotAdapter implements EnemyAttacker {

    private EnemyRobot enemyRobot;

    public EnemyRobotAdapter(EnemyRobot enemyRobot) {
        this.enemyRobot = enemyRobot;
    }

    @Override
    public void fireWeapon() {
        this.enemyRobot.smashWithHands();
    }

    @Override
    public void driveForward() {
        this.enemyRobot.walkForward();
    }

    @Override
    public void assignDriver(String driver) {
        this.enemyRobot.reactToHuman(driver);
    }

}
