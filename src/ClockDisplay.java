public class ClockDisplay {
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;

    public ClockDisplay(){
        NumberDisplay hours = new NumberDisplay(24);
        NumberDisplay minutes = new NumberDisplay(60);
        this.hours = hours;
        this.minutes = minutes;
        updateDisplay();
    }

    public void timeTick(){
        for (int i =0; i <= 60; i++){
            if(minutes.getValue() == 0){
                hours.Increment();
                minutes.setValue(0);
            }
            minutes.Increment();
        }
        updateDisplay();
    }
    public String getDisplayString(){
        return displayString;
    }
    private void updateDisplay(){
        displayString = (hours.getDisplayValue() + ":" + minutes.getDisplayValue());

    }
}
