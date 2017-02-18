import javafx.beans.binding.Bindings;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TetrisTest {

    private Tetris underTest;

    @Before
    public void init() {
        underTest = new Tetris();
    }

    @Test
    public void createsA10By24BoardWhenTheGameStarts() {
        underTest.start();

        assertThat(underTest.getBoard().length, is(10));
        assertThat(underTest.getBoard()[0].length, is(24));
    }
}
