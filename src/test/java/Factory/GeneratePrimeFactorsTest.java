package Factory;

import org.junit.Before;
import org.junit.Test;
import tools.ConsoleTool;
import tools.Generator;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by yjlu@thoughtworks.com on 7/24/16.
 */
public class GeneratePrimeFactorsTest {
    private GeneratePrimeFactors drawer;

    @Before
    public void setUp() {
        drawer = new GeneratePrimeFactors();
    }

    @Test
    public void should_return_empty_list_when_n_is_1() {
        String[] s = drawer.generateData(1);
        assertThat(s.length, is(0));
    }

    @Test
    public void should_return_one_line_when_n_is_6() {
        String[] s = drawer.generateData(6);
        assertThat(s.length, is(1));
        assertThat(s[0], is("2 3"));
    }

    @Test
    public void should_return_one_line_when_n_is_30() {
        String[] s = drawer.generateData(30);
        assertThat(s.length, is(1));
        assertThat(s[0], is("2 3 5"));
    }

    @Test
    public void should_combine_all_lines() throws Exception {
        String s = drawer.formatDataToString(new String[]{"first line", "second line"});
        assertThat(s, is("first line\nsecond line\n"));
    }
}
