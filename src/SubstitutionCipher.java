

public class SubstitutionCipher extends MonoAlphabeticCipher {
    public SubstitutionCipher(String abcSecret) {
        setSecretAlphabet(abcSecret);
    }
    public void setSecretAlphabet(String abcSecret){
        super.setAbcSecret(abcSecret);
    }

    public static void main(String[] args) {
        SubstitutionCipher s = new SubstitutionCipher("QAYWSXEDCRFVTGBZHNUJMIKOLP���");
        System.out.println("PalmenAusPlastik");
        System.out.println(s.encrypt("PalmenAusPlastik"));

    }
}