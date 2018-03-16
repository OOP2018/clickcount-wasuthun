package counter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * Controller for the Counter buttons user interface.
 * @author jim
 *
 */
public class ClickController {
	@FXML
	private Button plusbutton;
	@FXML
	private Button minusbutton;
	/** The counter that records button clicks. */
	private Counter counter;

	
	public void plusButtonHandler(ActionEvent event) {
		//TODO add 1 to counter
		System.out.println("TODO: add 1 to counter and delete this pritnln");
	}
	
	
	public void minusButtonHandler(ActionEvent event) {
		System.out.println("TODO: add -1 to counter and delete this pritnln");
	}
}
