package ceaser.cipher;

public class Encode {
    private static String encodeMessage="";
    private int key;

    public static String encoding(String plainText, int key) throws Exception{

        if(key < 1 || key > 25) throw new Exception("The key must be between 1 and 25");
        for(int i=0; i<plainText.length(); i++){
            char alphabet=plainText.charAt(i);
            //check if alphabet is a valid letter
            if(Character.isLetter(alphabet)){
                //For Uppercase letters
                if(Character.isUpperCase(alphabet)){
                    char newAlphabet=(char)(alphabet+key);
                    if(newAlphabet>'Z'){
                        encodeMessage += (char)(alphabet-(26-key));
                    }else{
                        encodeMessage += newAlphabet;

                    }
                }
                // For lowercase letters
                else if(Character.isLowerCase(alphabet)){
                    char newAlphabet=(char)(alphabet+key);
                    if(newAlphabet>'z'){
                        encodeMessage += (char)(alphabet -(26-key));
                    }else{
                        encodeMessage += newAlphabet;
                    }
                }
            }else{
                encodeMessage += alphabet;
            }
        }
        return encodeMessage;
    }
    public String getEncodeMessage() {
        return encodeMessage;
}
}
