/**
 * Created by my on 22.04.2015.
 */
public class Calc {
    public int mult(int param1, int param2) {
        return param1 * param2;
    }

   public int div(int param1, int param2) {
        if (param2 == 0) {
            throw new DivByZeroException();
        } else {
            return param1 / param2;
        }
    }
}
