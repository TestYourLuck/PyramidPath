package lt.example.pyramid;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
     * @return longest path over binary tree or -1 if there is no full path.
     * @throws PathFinderError on invalid input.
     */
    public long calculateLongestPath(URI inputPath) {
        Path path = Paths.get(inputPath);
        long lineNumber = 1;
        long expectedNumbersInLine = 1;
        try {
            BufferedReader reader = Files.newBufferedReader(path);

            reader.readLine();

            return -1L;  // TODO implement
        } catch (IOException e) {
            throw new PathFinderError("Failed reading file: " + inputPath.getPath(), e);
        }
    }

}
