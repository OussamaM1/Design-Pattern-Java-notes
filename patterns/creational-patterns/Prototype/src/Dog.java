public class Dog implements Prototype {

    public Dog() {

        System.out.println("Dog is made");
    }

    @Override
    public Prototype makeCopy() {

        System.out.println("Dog is being made");
        Dog dogObject = null;

        try {

            dogObject = (Dog) super.clone();

        } catch (CloneNotSupportedException e) {

            e.printStackTrace();

        }

        return dogObject;
    }

    public String toString() {
        return "I am a dog";
    }
}
