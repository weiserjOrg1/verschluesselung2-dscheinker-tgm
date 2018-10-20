public class MonoAlphabeticCipher implements Cipher {
	
    private String abcSecret;
    private String abc;
    
    
    public MonoAlphabeticCipher() {
        setAbc("ABCDEFGHIJKLMNOPQRSTUVWXYZÄÖÜß");
    }
    
    protected void setAbcSecret(String text){
        if (text.length() == 30){
            for (int i = 0;i<text.length();i++) {
                for (int j = 0; j<text.length();j++) {
                    if(i != j) {
                        if(text.charAt(j) == text.charAt(i)) {
                            text = "QAYWSXEDCRFVTGBZHNUJMIKOLPÖÜÄ";
                            System.out.println("Ein Buchstabe kommt mehr als 1 mal vor");

                        }
                    }

                }
            }
            for(int i = 0;i<abc.length();i++) {
                if(text.indexOf(abc.charAt(i))== -1) {
                    text = "QAYWSXEDCRFVTGBZHNUJMIKOLPÖÜÄ";
                    System.out.println("Ein Buchstabe ist nicht erlaubt");

                }
            }
        } else {
            text = "QAYWSXEDCRFVTGBZHNUJMIKOLPÖÜÄ";
            System.out.println("Buchstaben fehlen");
        }
        this.abcSecret = text;
    }
    
    
    
    
    

   
    
    
    
    
    
    public String getAbcSecret() {
        return abcSecret;
    }
    public String getAbc() {
        return abc;
    }
    private void setAbc(String input) {
        this.abc = input;
    }
   
    
    
    
    
    
    
   
    public String encrypt(String text) {
        StringBuilder x = new StringBuilder();
        for(int i = 0;i<text.length();i++) {
            x.append(abcSecret.charAt(abc.indexOf(text.toUpperCase().charAt(i))));
        }
        return x.toString();
    }
    
   
    public String decrypt(String text) {
        StringBuilder x = new StringBuilder();
        for(int i = 0;i<text.length();i++) {
            x.append(abc.charAt(abcSecret.indexOf(text.toUpperCase().charAt(i))));
        }
        return x.toString();
    }
    
}