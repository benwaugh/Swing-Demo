package appfortesting;

import static org.junit.Assert.*;

import java.awt.Frame;

import org.assertj.swing.core.GenericTypeMatcher;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.junit.testcase.AssertJSwingJUnitTestCase;
import org.junit.Test;

import static org.assertj.swing.launcher.ApplicationLauncher.application;
import static org.assertj.swing.finder.WindowFinder.findFrame;

public class FirstTest extends AssertJSwingJUnitTestCase {

	private FrameFixture fixtureControlFrame;

	@Test
	public void test() throws InterruptedException {
		fixtureControlFrame.label().requireText("A Label");
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
