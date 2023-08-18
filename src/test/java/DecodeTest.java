import org.junit.Test;
import static org.junit.Assert.*;

public class DecodeTest {
    @Test
    public  void  decode_notNull_Exception(){
        Decode decode = new Decode();
        assertNotNull(decode);
    }

    @Test
    public  void  decode_onlyString_Exception(){
        Decode decode = new Decode();
        decode.getDecodeMessage();
        assertTrue(decode.getDecodeMessage() instanceof String );
    }

    @Test
    public void  decode_boundaryLength_exception(){
        try {
            Decode decode = new Decode();
            String actual = decode.decoding("YOU WILL NEVER WALK ALONE WHEN YOU HGOT",27);

        }catch (Exception ex){
            assertEquals("The key must be between 1 and 25",ex.getMessage());
        }

    }

}
