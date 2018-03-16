package counter;

import java.util.Observable;
import java.util.Observer;

/**
 * Print the counter value on the console whenever it changes.
 */

public class ConsoleView implements Observer{
	private Counter counter;

	/**
	 * A ConsoleView with reference to a counter (the subject).
	 * 
	 * @param counter the counter to display.
	 */
	public ConsoleView(Counter counter) {
		this.counter = counter;
	}
	/**
	 * Updata data in console
	 */
	@Override
	public void update(Observable o, Object arg) {
		if(arg!=null)
			System.out.println(arg);
		System.out.printf("Count : %d \n",counter.getCount());
	}
	
	}
