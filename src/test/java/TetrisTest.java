import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;

public class TetrisTest {

    private Tetris underTest;

    @Before
    public void init() {
        underTest = new Tetris();
        underTest.start();
    }

    @Test
    public void onStartCreatesA10By24BoardWhenTheGameStarts() {
        assertThat(underTest.getBoard().length, is(10));
        assertThat(underTest.getBoard()[0].length, is(24));
    }

    @Test
    public void onStartCausesANewShapeToAppearOnTheBoard() {
        assertThat(underTest.getBoard()[0][4], is(true));
        assertThat(underTest.getBoard()[1][4], is(true));
        assertThat(underTest.getBoard()[2][4], is(true));
        assertThat(underTest.getBoard()[3][4], is(true));
    }

    @Test
    public void onTickShapeMovesDownOneBlock() {
        underTest.tick();

        assertThat(underTest.getBoard()[0][4], is(false));
        assertThat(underTest.getBoard()[1][4], is(true));
        assertThat(underTest.getBoard()[2][4], is(true));
        assertThat(underTest.getBoard()[3][4], is(true));
        assertThat(underTest.getBoard()[4][4], is(true));
    }

    @Test
    public void whenTouchedBottomAShapeBecomesInactive() {
        for(int i = 0; i < 20; i++) {
            underTest.tick();
        }

        assertThat(underTest.getActiveShape(), is(nullValue()));
    }
}
