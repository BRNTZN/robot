package main;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class App {
	
	public static void main(String... args) throws AWTException, IOException {
//		BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		BufferedImage image = new Robot().createScreenCapture(new Rectangle(2000, 1080));
		ImageIO.write(image, "png", new File("C:\\Users\\BRNTZN\\Pictures\\screenshot.png"));
		
//		System.out.println("Hello world");
//		Robot bot = new Robot();
//		bot.mouseMove(-1000, 10);
//	    bot.mousePress(InputEvent.BUTTON2_MASK);
//	    bot.mouseRelease(InputEvent.BUTTON2_MASK);
//	    bot.mousePress(InputEvent.BUTTON2_MASK);
//	    bot.mouseRelease(InputEvent.BUTTON2_MASK);
	}

}
