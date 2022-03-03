public class TimeSpan {
    // fields
    private int hours;
    private int minutes;

    public TimeSpan(int h, int m) {
	this.hours = h;
	this.minutes = m;
    }
    
    // adds additional hours and minutes to this time span
    public void add(int hours, int minutes) {
	this.hours = this.hours + hours;
	this.minutes = this.minutes + minutes;

	if (this.minutes >= 60) {
	    this.hours = this.hours + this.minutes / 60;
	    this.minutes = this.minutes  % 60;
	}
    }

    // return the hours in this TimeSpan
    public int getHours() {
	return this.hours;
    }

    // return the minutes in this TimeSpan
    public int getMinutes() {
	return this.minutes;
    }

    // return a String representation of the TimeSpan
    public String toString() {
        String result = this.hours + ":"; 
	if (this.minutes < 10)
	    result = result + "0";
        result = result + this.minutes;
	return result;
    }

    // add the other TimeSpan to this TimeSpan
    public void add(TimeSpan other) {
	this.add(other.hours, other.minutes);
    }
    
}
