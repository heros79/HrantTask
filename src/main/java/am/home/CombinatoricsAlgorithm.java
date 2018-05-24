package am.home;

import java.util.Arrays;

/**
 * Created by David on 5/23/2018.
 */

public class CombinatoricsAlgorithm {


    public int[] Algorithm(int n, int k) {

        if (n <= 0 || k == 0) {
            throw new IllegalArgumentException("Input the right argument");
        }

        int array[] = new int[k];

        for (int i = 0; i < k; i++) {
            array[i] = i + 1;
        }

        if (n == k || k == 1) {
            return array;
        }

        int x;
        System.out.println(Arrays.toString(array));
        do {

            if (array[k - 1] < n) {
                array[k - 1]++;
                System.out.println(Arrays.toString(array));
            }

            x = array[0];

            if (array[k - 1] == n) {
                for (int y = (k - 1); y > 0; y--) {
                    if (array[y - 1] == (n - k + y)) {
                        continue;
                    } else {
                        array[y - 1]++;
                        for (int i = y - 1; i < k - 1; i++) {
                            array[i + 1] = array[i] + 1;
                        }
                        System.out.println(Arrays.toString(array));
                        break;
                    }
                }
            }
        } while (x < (n - k + 1));

        return null;
    }
}
