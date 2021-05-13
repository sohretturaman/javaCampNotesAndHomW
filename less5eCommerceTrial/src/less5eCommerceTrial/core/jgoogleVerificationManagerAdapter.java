package less5eCommerceTrial.core;

import less5eCommerceTrial.jgoogleVerification.GoogleManager;

public class jgoogleVerificationManagerAdapter implements JgoogleVerificationService {

	@Override
	public void EmailControl() {
		
 		GoogleManager googleManager = new GoogleManager() ;
 		googleManager.checked("check edilidi ");
 		
	}



}
