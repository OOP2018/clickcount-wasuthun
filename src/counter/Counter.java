package counter;

import java.util.Observable;

/**
 * A simple counter.
 */

public class Counter extends Observable{
	/**
	 * Attribute
	 */
	private int count;
	/**
	 * Constructor
	 */
	public Counter() {
		this.count = 0;
	}
	/**
	 * Add value attribute count
	 * @param howmuch
	 */
	public void add(int howmuch) {
		count += howmuch;
		// Its like if the Bank sends you an SMS whenever money
		// is deposited in your account. If the SMS just says 
		// "you received a deposit" then you need to login to check it.
		// If the SMS says "you received 5,000 Bt from xxx" then you
		// have everything you need.
		setChanged();
		notifyObservers();
	}
	/**
	 * Access a value of count
	 * @return value of count
	 */
	public int getCount() {
		return count;
	}
	
}
