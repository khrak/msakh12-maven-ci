/**
 * Created by khrak on 5/9/16.
 */
public class CalculateGCD {
    private int a;
    private int b;

    public CalculateGCD(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculateGCD() {
        return gcd(a,b);
    }

    private int gcd(int a, int b) {
        if(a == 0) return b;
        return gcd(b%a, a);
    }
}
