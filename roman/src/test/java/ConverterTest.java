import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Test for converting arabic numbers in roman numbers.
 *
 * Created by Erik Tittel on 26.09.2015.
 */
public class ConverterTest {

    private RomanConverter c = new RomanConverter();

    @Test
    public void convert() {
        checkConversion(0, "");
        checkConversion(1, "I");
        checkConversion(2, "II");
        checkConversion(3, "III");
        checkConversion(4, "IV");
        checkConversion(5, "V");
        checkConversion(6, "VI");
        checkConversion(7, "VII");
        checkConversion(8, "VIII");
        checkConversion(10, "X");
    }

    private void checkConversion(int arabic, String roman) {
        assertThat(c.convert(arabic), is(roman));
    }
}
