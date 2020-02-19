import androidx.test.rule.ActivityTestRule;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import tools.fastlane.screengrab.Screengrab;


@RunWith(JUnit4.class)
public class AutomateScreenshotsTest {

  @Before
  fun setUp() {
    ActivityScenario.launch(MainActivity::class.java)
    Screengrab.setDefaultScreenshotStrategry(UiAutomatorScreenshotStrategy())
  }

  @Test
  fun captureScreen() {
    // Delay 500 millis for app launch to main screen
    Thread.sleep(500)
    Screengrab.screenshot("main_screen")
  }
}
