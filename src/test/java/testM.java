import org.junit.jupiter.api.Test;

import static no.kristiania.main.toRoman;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testM {

        @Test
       public void shouldConvert1ToI() {
            assertEquals("I", toRoman(1));
        }

        @Test
        public void shouldConvert2ToII () {
            assertEquals("II", toRoman(2));
        }

        @Test
        public void shouldConvert3ToIII () {
            assertEquals("III", toRoman(3));
        }

        @Test
        public void shouldConvert4ToIV () {
            assertEquals("IV", toRoman(4));
        }

    }

