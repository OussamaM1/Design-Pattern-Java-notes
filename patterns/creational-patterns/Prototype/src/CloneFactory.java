public class CloneFactory {

    public Prototype getClone(Prototype prototypeSample) {
        return prototypeSample.makeCopy();
    }

}
