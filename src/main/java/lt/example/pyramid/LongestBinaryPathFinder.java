package lt.example.pyramid;

/**
 * Utility class to calculate longest path over binary tree by given rules:
 * <ol>
 *   <li>Starting from the top and move downwards to an adjacent number as in below.</li>
 *   <li>You are only allowed to walk downwards and diagonally.</li>
 *   <li>You should walk over the numbers as evens and odds subsequently. Suppose that you are on an even number the next
 * number you walk must be odd, or if you are stepping over an odd number the next number must be even. In other words,
 * the final path would be like Odd -> even -> odd -> even …</li>
 *   <li>You must reach to the bottom of the pyramid. Your goal is to find the maximum sum if you walk the path. Assume
 * that there is at least 1 valid path to the bottom. If there are multiple paths giving the same sum, you can choose
 * any of them.</li>
 * </ol>
 *
 * @author dstulgis
 */
public class LongestBinaryPathFinder {

    /**
     * Calculates path from binary tree top, summing up downwards or downwards and to the right number.
     * Walks over the numbers as evens and odds subsequently.
     *
     * @return longes path over binary tree.
     */
    public long calculateLongestPath() {
        return 0L;  // TODO implement
    }

}
