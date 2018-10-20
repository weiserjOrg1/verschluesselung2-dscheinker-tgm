
public class Model {
    
    //Initalisierung der einzelnen Variablen
	
    private String zyx;
    private String input;
    private MonoAlphabeticCipher abc;
    private int other;

    // Der Konstruktor der Klasse Model
    public Model(){
        this.abc = new SubstitutionCipher("QWERTZßÜAUIOPSKLÖDFGBNMHJÄYXCV");
    }

   
    // Simple get-set Methoden
    
    public void setAbc(MonoAlphabeticCipher abc) {
        this.abc = abc;
    }
    public MonoAlphabeticCipher getAbc() {
        return abc;
    }
    
    
    
    
    
    
    
    public void setZyx(String zyx) {
        this.zyx = zyx;
    }
    public String getZyx() {
        return zyx;
    }

    
    
    
    
   
    public void setOther(int other) {
        this.other = other;
    }
    public int getOther() {
        return other;
    }
    
    
  
    
    
    
    
    
    public void setInput(String input) {
        this.input = input;
    }
    public String getInput() {
        return input;
    }
}