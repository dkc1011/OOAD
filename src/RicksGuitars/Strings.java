package RicksGuitars;

public enum Strings {
    SIX, TWELVE;

    public String toString(){
        switch(this){
            case SIX:  return "Six";
            case TWELVE: return "Twelve";
            default: return "Six";
        }
    }
}
