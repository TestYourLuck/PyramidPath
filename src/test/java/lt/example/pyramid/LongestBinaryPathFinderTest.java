package lt.example.pyramid;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.net.URISyntaxException;

public class LongestBinaryPathFinderTest {

    private LongestBinaryPathFinder pathFinder;

    @Before
    public void onSetup() {
        pathFinder = new LongestBinaryPathFinder();
    }

    @Test
    public void shouldFindSimpleLongestPath() {
        File input = resourceAsFile("simpleInput.txt");

        long result = pathFinder.calculateLongestPath(input);

        assertThat(result, equalTo(16L));
    }

    @Test
    public void shouldFindLongestPath() {
        File input = resourceAsFile("questionTargetInput.txt");

        long result = pathFinder.calculateLongestPath(input);

        assertThat(result, equalTo(-1L)); // TODO update to real result
    }

    @Test(expected = PathFinderError.class)
    public void shouldFailParsingLetters() {
        File input = resourceAsFile("incorrectInput.txt");

        pathFinder.calculateLongestPath(input);
    }

    @Test(expected = PathFinderError.class)
    public void shouldFailOnMissingNumber() {
        File input = resourceAsFile("incompleteInput.txt");

        pathFinder.calculateLongestPath(input);
    }

    @Test(expected = PathFinderError.class)
    public void shouldFailOnExtraNumber() {
        File input = resourceAsFile("extraInput.txt");

        pathFinder.calculateLongestPath(input);
    }

    @Test
    public void shouldNotFindLongestPath() {
        File input = resourceAsFile("noPathInput.txt");

        long result = pathFinder.calculateLongestPath(input);

        assertThat(result, equalTo(-1L));
    }

    private File resourceAsFile(String relativeFilePath) {
        try {
            return new File(this.getClass().getClassLoader().getResource(relativeFilePath).toURI());
        } catch (URISyntaxException e) {
            fail("Failed reading input file: " + relativeFilePath);
            return null;
        }
    }

}
