import java.lang.reflect.Array;
import java.util.Arrays;

public class ShiftCipher extends MonoAlphabeticCipher {
    private int other;

    public static void main(String[] args) {
        ShiftCipher s = new ShiftCipher(4);

    }
    
   
    public ShiftCipher(int i) {
        super();
        this.other = i;
        secretEvaling();
    }
    public int getOther() {
        return other;
    }
    public void setOther(int other) {
        this.other = other;
    }
    
    
  
    private void secretEvaling() {
        String newBra="";
        char[] inlay = new char[30];
        char temp = 'A';
        for(int i =0;i<26;i++){
        	inlay[i] = temp;
            temp += 1;
        }
        inlay[27]='Ä';
        inlay[28]='Ö';
        inlay[29]='Ü';
       
        System.out.println(Arrays.toString(inlay));

        for (int i = 0; i < inlay.length; i++) {
            char c = inlay[i];
            c = inlay[(i+this.other)%30];
            newBra +=c;
        }
        super.setAbcSecret(newBra);
    }

   
    
}
