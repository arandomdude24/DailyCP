package integerDecoder;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class intDecoderTest {

    @Test
    void decode(){
        HashMap<Integer, String> d = intDecoder.makeDict();
        String test = "111";
        String another = "2211";

        assertEquals(intDecoder.decode(test, d, ""), 3);
        assertEquals(intDecoder.decode(another, d, ""), 5);
    }

}