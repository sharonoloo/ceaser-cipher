
public class Decode {

    private String decodeMessage="";
    private int key;

    public String decoding(String encodeMessage, int key) throws Exception{

        if(key < 1 || key > 25) throw new Exception("The key must be between 1 and 25");
        for(int i=0; i<encodeMessage.length(); i++){
            char alphabet=encodeMessage.charAt(i);
            //check if alphabet is a valid letter
            if(Character.isLetter(alphabet)){
                //For Uppercase letters
                if(Character.isUpperCase(alphabet)){
                    char newAlphabet=(char)(alphabet-key);
                    if(newAlphabet>'Z'){
                        decodeMessage += (char)(alphabet-(26+key));
                    }else{
                        decodeMessage += newAlphabet;

                    }
                }
                // For lowercase letters
                else if(Character.isLowerCase(alphabet)){
                    char newAlphabet=(char)(alphabet-key);
                    if(newAlphabet>'z'){
                        decodeMessage += (char)(alphabet -(26+key));
                    }else{
                        decodeMessage += newAlphabet;
                    }
                }
            }else{
                decodeMessage += alphabet;
            }
        }
        return decodeMessage;
    }
    public String getDecodeMessage() {
        return decodeMessage;
    }

}
