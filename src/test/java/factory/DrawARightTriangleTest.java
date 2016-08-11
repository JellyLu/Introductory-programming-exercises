package factory;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by yjlu@thoughtworks.com on 7/24/16.
 */
public class DrawARightTriangleTest {
    private DrawARightTriangle drawer;

    @Before
    public void setUp() {
        drawer = new DrawARightTriangle();
    }

    @Test
    public void should_return_one_line_each_with_one_asterisk_when_n_is_1() {
        String[] s = drawer.generateData(1);
        assertThat(s.length, is(1));
        assertThat(s[0], is("*"));
    }

    @Test
    public void should_return_three_line_each_with_different_asterisk_when_n_is_3() {
        String[] s = drawer.generateData(3);
        assertThat(s.length, is(3));
        assertThat(s[0], is("*"));
        assertThat(s[1], is("**"));
        assertThat(s[2], is("***"));
    }

    @Test
    public void should_combine_all_lines() throws Exception {
        String s = drawer.formatDataToString(new String[]{"first line", "second line"});
        assertThat(s, is("first line\nsecond line\n"));
    }
}
