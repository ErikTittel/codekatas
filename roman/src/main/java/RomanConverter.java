import java.util.Map;
import java.util.TreeMap;

/**
 * Converts arabic numbers into roman numbers.
 *
 * Created by Erik Tittel on 05.10.2015.
 */
public class RomanConverter {

    private Map<Integer, String> romanSymbols = new TreeMap<>((Integer a, Integer b) -> b - a);

    public RomanConverter() {
        romanSymbols.put(1, "I");
        romanSymbols.put(4, "IV");
        romanSymbols.put(5, "V");
        romanSymbols.put(10, "X");
    }

    public String convert(int arabic) {
        for (Integer value : romanSymbols.keySet()) {
            if (arabic >= value) return romanSymbols.get(value) + convert(arabic - value);
        }
        return "";
    }
}
