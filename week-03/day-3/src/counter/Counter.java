package counter;

public class Counter {

    int basic;
    int basicReset;
    //int number;

    public Counter(int basic) {
        this.basic = basic;
        this.basicReset = basic;
    }

    public Counter() {
        basic = 0;
        basicReset = 0;
    }

    public void add(int number) {
        basic += number;
    }

    public void add() {
        basic++;
    }

    public int get() {
        return basic;
    }

    public void reset() {
        basic = basicReset;
    }
}
