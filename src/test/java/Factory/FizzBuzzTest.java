package Factory;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by yjlu@thoughtworks.com on 7/24/16.
 */
public class FizzBuzzTest {
    private FizzBuzz drawer;

    @Before
    public void setUp() {
        drawer = new FizzBuzz();
    }

    @Test
    public void should_return_one_line_when_n_is_1() {
        String[] s = drawer.generateData(1);
        assertThat(s.length, is(1));
        assertThat(s[0], is("1"));
    }

    @Test
    public void should_return_three_line_each_with_different_asterisk_when_n_is_3() {
        String[] s = drawer.generateData(3);
        assertThat(s.length, is(3));
        assertThat(s[0], is("1"));
        assertThat(s[1], is("2"));
        assertThat(s[2], is("Fizz"));
    }

    @Test
    public void should_return_three_line_each_with_different_asterisk_when_n_is_5() {
        String[] s = drawer.generateData(5);
        assertThat(s.length, is(5));
        assertThat(s[0], is("1"));
        assertThat(s[1], is("2"));
        assertThat(s[2], is("Fizz"));
        assertThat(s[3], is("4"));
        assertThat(s[4], is("Buzz"));
    }

    @Test
    public void should_return_three_line_each_with_different_asterisk_when_n_is_15() {
        String[] s = drawer.generateData(15);
        assertThat(s.length, is(15));
        assertThat(s[0], is("1"));
        assertThat(s[1], is("2"));
        assertThat(s[2], is("Fizz"));
        assertThat(s[3], is("4"));
        assertThat(s[4], is("Buzz"));
        assertThat(s[5], is("Fizz"));
        assertThat(s[6], is("7"));
        assertThat(s[7], is("8"));
        assertThat(s[8], is("Fizz"));
        assertThat(s[9], is("Buzz"));
        assertThat(s[10], is("11"));
        assertThat(s[11], is("Fizz"));
        assertThat(s[12], is("13"));
        assertThat(s[13], is("14"));
        assertThat(s[14], is("FizzBuzz"));
    }

    @Test
    public void should_combine_all_lines() throws Exception {
        String s = drawer.formatDataToString(new String[]{"first line", "second line"});
        assertThat(s, is("first line\nsecond line\n"));
    }
}
