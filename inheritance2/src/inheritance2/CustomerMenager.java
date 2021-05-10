package inheritance2;

public class CustomerMenager  {
    public void add (Logger logger) {
    	System.out.println(" müsteri eklendi ");
    	logger.log();
    	logger.log();
    }
}

// iş yapan bir sınıf asla başka bir iş yapan bir class ı new leyemez .