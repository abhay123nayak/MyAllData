package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import logger.LogReporter;
import org.apache.commons.lang3.RandomStringUtils;

public class CommonUtils {

	public static Properties readPropertyFile(String filePath) {
		try (FileInputStream input = new FileInputStream(filePath)) {
			Properties prop = new Properties();
			prop.load(input);
			return prop;
		} catch (IOException ex) {
			throw new RuntimeException("Exception occurred for filePath" + filePath + ":" + ex.getMessage());
		}
	}



	public static String getRandomNumber(int range) {
		String ran = RandomStringUtils.randomNumeric(range).toString();
		LogReporter.INFO("Random number is " + ran);
		return ran;
	}

	public static String getDate() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy hh:mm aa");
		String strDate = formatter.format(date);
		LogReporter.INFO(strDate.toUpperCase());
		return strDate.toUpperCase();
	}

	public static void sleep(int second) {
		try {
			Thread.sleep(second * 1000);
		} catch (Exception ex) {
			LogReporter.INFO(ex.getMessage());
		}
	}

}
