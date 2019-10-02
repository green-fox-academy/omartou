package sum;

import java.util.ArrayList;
import java.util.List;

public class Sum {

    public Integer sumFunction(ArrayList<Integer> sumNumbers) {
        Integer sum = 0;

        if (sumNumbers == null) {
            return null;
        }

        for (int i = 0; i < sumNumbers.size() ; i++) {
            sum += sumNumbers.get(i);
        }
        return sum;
    }
}
