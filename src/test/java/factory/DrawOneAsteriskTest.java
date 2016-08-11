package factory;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by yjlu@thoughtworks.com on 7/23/16.
 */
public class DrawOneAsteriskTest {

    private DrawOneAsterisk drawer;

    @Before
    public void setUp() {
        drawer = new DrawOneAsterisk();
    }

    @Test
    public void should_return_one_asterisk_when_n_is_1() {
        String[] s = drawer.generateData(1);
        assertThat(s.length, is(1));
        assertThat(s[0], is("*"));
    }

    @Test
    public void should_return_one_asterisk_when_n_is_100() {
        String[] s = drawer.generateData(100);
        assertThat(s.length, is(1));
        assertThat(s[0], is("*"));
    }

    @Test
    public void should_return_first_line() throws Exception {
        String s = drawer.formatDataToString(new String[]{"first line", "second line"});
        assertThat(s, is("first line"));
    }
}
