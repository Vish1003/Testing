package Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

public class Assign__1 extends Assign_1 {
	@Test
	public void sample() throws AWTException
	{
		driver.manage().window().maximize();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_N);
		
		Point p = new Point(400,500);
		driver.manage().window().setPosition(p);
		
		Dimension d = new Dimension(300, 200);
		driver.manage().window().setSize(d);
	}

}
