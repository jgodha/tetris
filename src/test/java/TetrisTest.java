import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TetrisTest {

    private Tetris underTest;

    @Before
    public void init() {
        underTest = new Tetris();

        underTest.start();
    }

    @Test
    public void createsA10By24BoardWhenTheGameStarts() {
        assertThat(underTest.getBoard().length, is(10));
        assertThat(underTest.getBoard()[0].length, is(24));
    }

    @Test
    public void aTickCausesANewShapeToAppearOnTheBoard() {
        underTest.tick();

        assertThat(underTest.getBoard()[0][4], is(true));
        assertThat(underTest.getBoard()[1][4], is(true));
        assertThat(underTest.getBoard()[2][4], is(true));
        assertThat(underTest.getBoard()[3][4], is(true));
    }

}
