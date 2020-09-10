package topic_6;

public class ATM {
    private int bill20;
    private int bill50;
    private int bill100;

    public ATM(int bill20, int bill50, int bill100) {
        this.bill20 = bill20;
        this.bill50 = bill50;
        this.bill100 = bill100;
    }

    public int getBill20() {
        return bill20;
    }

    public int getBill50() {
        return bill50;
    }

    public int getBill100() {
        return bill100;
    }

    public void setBill20(int bill20) {
        this.bill20 = bill20;
    }

    public void setBill50(int bill50) {
        this.bill50 = bill50;
    }

    public void setBill100(int bill100) {
        this.bill100 = bill100;
    }

    @Override
    public String toString() {
        return "ATM has {" +
                "bill20=" + bill20 +
                ", bill50=" + bill50 +
                ", bill100=" + bill100 +
                '}';
    }

    public void addMoney(int bill20, int bill50, int bill100) {
        this.bill20 += bill20;
        this.bill50 += bill50;
        this.bill100 += bill100;
    }

    public boolean withdrawMoney(int bill20, int bill50, int bill100) {
        if (this.bill20 + this.bill50 + this.bill100 > bill20 + bill50 + bill100) {
            this.bill20 -= bill20;
            this.bill50 -= bill50;
            this.bill100 -= bill100;
            return true;
        } else {
            System.out.println("В банкомате не достаточно денег");
            return false;
        }
    }
}
