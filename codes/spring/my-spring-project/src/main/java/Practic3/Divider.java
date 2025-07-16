package Practic3;

public class Divider {
    public int divide(int a, int b) throws CustomDivide{
        if (b == 0) {
            throw new CustomDivide("0-a bolme mumkun deyil!");
        }
        return a / b;
    }
}
