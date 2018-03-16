package counter;

import java.util.Observable;

/**
 * Print the counter value on the console whenever it changes.
 */
//TODO Delare that this implements java.util.Observer
public class ConsoleView  {
	private Counter counter;

	/**
	 * A ConsoleView with reference to a counter (the subject).
	 * 
	 * @param counter the counter to display.
	 */
	public ConsoleView(Counter counter) {
		this.counter = counter;
	}

	//TODO Write the observer method
}
