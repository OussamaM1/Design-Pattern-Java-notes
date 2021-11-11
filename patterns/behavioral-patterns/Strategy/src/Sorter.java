public class Sorter {

    protected StrategySort strategySort;

    public Sorter(StrategySort strategySort) {
        this.strategySort = strategySort;
    }

    public int[] sort(int[] array) {
        return this.strategySort.sort(array);
    }

}
