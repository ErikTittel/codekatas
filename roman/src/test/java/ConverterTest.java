import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Test for converting arabic numbers in roman numbers.
 *
 * Created by Erik on 26.09.2015.
 */
public class ConverterTest {

    private Map<Integer, String> romanSymbols = new TreeMap<>((Integer a, Integer b) ->  b - a);
    {
        romanSymbols.put(1, "I");
        romanSymbols.put(4, "IV");
        romanSymbols.put(5, "V");
        romanSymbols.put(10, "X");
    }

    private String convert(int arabic) {
        for (Integer value : romanSymbols.keySet()) {
            if (arabic >= value)
                return romanSymbols.get(value) + convert(arabic - value);
        }
        return "";
    }

    @Test
    public void testConvert() {
        assertThat(convert(0), is(""));
        assertThat(convert(1), is("I"));
        assertThat(convert(2), is("II"));
        assertThat(convert(3), is("III"));
        assertThat(convert(4), is("IV"));
        assertThat(convert(5), is("V"));
        assertThat(convert(6), is("VI"));
        assertThat(convert(7), is("VII"));
        assertThat(convert(8), is("VIII"));
        assertThat(convert(10), is("X"));
    }
}
