package netology.ru;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.sum("10010", "100101"));
        System.out.println(bins.mult("10010", "100101"));
    }
}