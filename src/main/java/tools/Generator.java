package tools;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yjlu@thoughtworks.com on 7/23/16.
 */
public class Generator {

    private int mutipleElementsInArray(ArrayList<Integer> list) {
        int result = list.get(0);
        for (int i = 1, len = list.size(); i < len; i++) {
            result *= list.get(i);
        }
        return result;
    }

    public ArrayList<Integer> generatePrimeFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i < n/2; i++) {
            if (n%i == 0) {
                factors.add(i);
                if (mutipleElementsInArray(factors) == n) {
                    return factors;
                }
            }
        }
        return factors;
    }

}
