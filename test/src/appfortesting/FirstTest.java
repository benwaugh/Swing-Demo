package appfortesting;

import static org.junit.Assert.*;

import java.awt.Frame;

import javax.swing.JButton;

import org.assertj.swing.core.GenericTypeMatcher;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.junit.testcase.AssertJSwingJUnitTestCase;
import org.junit.Test;

import static org.assertj.swing.launcher.ApplicationLauncher.application;
import static org.assertj.swing.finder.WindowFinder.findFrame;

public class FirstTest extends AssertJSwingJUnitTestCase {

	private FrameFixture fixtureControlFrame;

	@Test
	public void controlFrameHasLabel() {
		fixtureControlFrame.label().requireText("A Label");
	}
	
	@Test
	public void canClickGoButton() {
		// Find correct button using its text rather than its name.
		GenericTypeMatcher<? extends JButton> matcher = new GenericTypeMatcher<JButton>(JButton.class) {
			@Override
			protected boolean isMatching(JButton button) {
				return "Go!".equals(button.getText());
			}};
		fixtureControlFrame.button(matcher).click();
	}

	@Test
	public void testMenu() {
		fixtureControlFrame.menuItemWithPath("Application","Exit").click();
	}
	
	@Override
	protected void onSetUp() throws Exception {
		application(Main.class).start();
		fixtureControlFrame = findFrame(new GenericTypeMatcher<Frame>(Frame.class) {
			protected boolean isMatching(Frame frame) {
				return "Control".equals(frame.getTitle()) && frame.isShowing();
			}
		}).using(robot());
	}

}
