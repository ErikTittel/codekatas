import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by Erik on 26.09.2015.
 */
public class ConverterTest {

    private String convert(int arabic) {
        if (arabic == 1) return "I";
        return "";
    }

    @Test
    public void testConvert() {
        assertThat(convert(0), is(""));
        assertThat(convert(1), is("I"));
    }
}
