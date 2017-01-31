/**
 * 
 */
package com.shijin.learn;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This is the class to test Git
 * @author shijin
 *
 */
public class Hello {
	static int i = 0;
	static SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		for (int j = 0; j < 10; j++) {
			System.out.println("Hello World Again!" + i + j);
			list.add("" + (i+j));
		}
		System.out.println(list.size() + " Local Date is " + LocalDate.now());
		System.out.println("Today is " + df.format(new Date(System.currentTimeMillis())));
	}

}
