package netology.ru;

public class BinOps {

    public String sum(String a, String b) {
    int x = Integer.parseInt(a, 2);
    int y = Integer.parseInt(b, 2);
    int result = x + y;
    String bynResult = Integer.toBinaryString(result);
    return bynResult;
    }

    public String mult(String a, String b) {
        int x = Integer.parseInt(a, 2);
        int y = Integer.parseInt(b, 2);
        int result = x * y;
        String bynResult = Integer.toBinaryString(result);
        return bynResult;
    }
}
