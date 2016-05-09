/**
 * Created by khrak on 5/9/16.
 */
public class mainProgram {

    public static void main(String[] args) {
        CalculateGCD calculateGCD = new CalculateGCD(18,48);

        int gcd = calculateGCD.calculateGCD();

        System.out.println("Greatest common divisor is: " + gcd);
    }
}
