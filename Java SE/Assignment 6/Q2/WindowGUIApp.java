public interface MouseHandler {
	void mouseClicked();
	void mousePressed();
	void mouseReleased();
}

public interface WindowHandler {
	void windowClosing();
	void windowClosed();
}

public class WindowGUIApp implements MouseHandler, WindowHandler {

	@Override
	public void windowClosing() {
		// TODO Auto-generated method stub
		System.out.println("window is now closing");
	}

	@Override
	public void windowClosed() {
		// TODO Auto-generated method stub
		System.out.println("window is now closed");
	}

	@Override
	public void mouseClicked() {
		// TODO Auto-generated method stub
		System.out.println("mouse is clicked");
	}

	@Override
	public void mousePressed() {
		// TODO Auto-generated method stub
		System.out.println("mouse is pressed");
	}

	@Override
	public void mouseReleased() {
		// TODO Auto-generated method stub
		System.out.println("mouse is released");
	}
}
