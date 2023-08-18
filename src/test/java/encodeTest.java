import org.junit.Test;
import static org.junit.Assert.*;
public class encodeTest {
    @Test
    public void encode_onlyString_exception(){
        //order
        Encode encode=new Encode();

        //act
        String actual = encode.encoding("1",1);

        //assert
        assertTrue(actual instanceof String);

    }
}