package org.testing.Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsCapture {
	public static void Takelog(String classname,String msg) {
		DOMConfigurator.configure("../YTFramework/layout.xml");
		Logger log=Logger.getLogger(classname);
		log.info(msg);
	}
}
