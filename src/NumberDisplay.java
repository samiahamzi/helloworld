public class NumberDisplay {
    //Attributes
    private int limit;
    private int value;


    //constructor
    public NumberDisplay(int rollOverLimit) {
        this.limit = rollOverLimit;
        this.value = 0;
    }

    //methods
    public int getValue() {
        return value;
    }

    public String getDisplayValue() {
        if (value < 10) {
            return ("0" + value);
        } else {
            return "";
        }
    }

    //setter methods

    public int setValue(int replacementValue) {
        if (replacementValue >= 0 && replacementValue < limit) {
            this.value = replacementValue;
            return value;
        } else {
            return value;
        }
    }

    public void Increment(){
        value = (value+1)%limit;
    }


}
