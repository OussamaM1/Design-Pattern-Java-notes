public class President {

    private static President instance;

    private President() {
        // Hide constructor
    }

    public static President getInstance() {
        if (instance == null)
            instance = new President();
        return instance;
    }

    // Disable cloning
    @Override
    protected Object clone() {
        return instance;
    }

}