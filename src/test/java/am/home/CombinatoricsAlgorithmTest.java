package am.home;

import org.junit.Test;

import static org.junit.Assert.fail;

/**
 * Created by David on 5/24/2018.
 */
public class CombinatoricsAlgorithmTest {

    @Test
    public void AlgorithmTest() {

        CombinatoricsAlgorithm combinatoricsAlgorithm = new CombinatoricsAlgorithm();

        try {
            combinatoricsAlgorithm.Algorithm(5, 0);
            fail("Can get IAE exception");
        } catch (IllegalArgumentException e) {
            try {
                combinatoricsAlgorithm.Algorithm(0, 5);
                fail("Can get IAE exception");
            } catch (IllegalArgumentException e1) {
            }
        }
    }
}
