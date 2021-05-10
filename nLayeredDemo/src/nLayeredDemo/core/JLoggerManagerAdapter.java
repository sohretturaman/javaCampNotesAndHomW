package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {

	@Override
	public void logToSystem(String message) {
		
		JLoggerManager manager = new JLoggerManager();
		manager.log(message);
	}

}



// kendi interface ni oluştur ve bir adaptör oluştur bu adaptörün içinde dış paketin menagerini 
// ya da class ını new le böylece onu kullanabilecekt-sin . main de ise dış pakate bağlı olmayıp
//kendi classını newlemen yeterli olacaktır 