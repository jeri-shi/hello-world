/**
 * 
 */
package com.shijin.learn;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author shijin
 *
 */
public class Hello {
	static int i = 50;
	static SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int j = 0; j < 10; j++) {
			System.out.println("Hello World Again!" + i + j);
		}
		System.out.println("Today is " + df.format(new Date(System.currentTimeMillis())));
	}

}
