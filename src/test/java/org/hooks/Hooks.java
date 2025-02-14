package org.hooks;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.base.BaseClass;
import org.pojo.myntraPojo;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	
	myntraPojo m;
	
	@Before
    public void preCondition() {
        System.out.println("Running preCondition...");
        launchBrowser();  
    }
	
	@Before(value="@icici")
	private void StartTime() {
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("dd-MMM-yy HH:mm:ss");
        System.out.println(s.format(d));

	}
	
	@After(value="@icici")
	private void EndTime() {
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("dd-MMM-yy HH:mm:ss");
        System.out.println(s.format(d));

	}

   
    @After
    public void postCondition() {
//        closeEntireBrowser();  
    }
}
