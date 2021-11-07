public class Sheep implements Prototype {

    public Sheep() {

        System.out.println("Sheep is made");
    }

    @Override
    public Prototype makeCopy() {

        System.out.println("Sheep is being made");
        Sheep sheepObject = null;

        try {

            sheepObject = (Sheep) super.clone();

        } catch (CloneNotSupportedException e) {

            e.printStackTrace();

        }

        return sheepObject;
    }

    public String toString() {
        return "Dolly is my hero!";
    }
}
