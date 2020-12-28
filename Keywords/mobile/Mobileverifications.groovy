package mobile

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil

public class Mobileverifications {

	/**
	 *
	 */
	@Keyword
	def verifyElementPresent(TestObject element, String failureDescription){

		if(!(Mobile.verifyElementExist(element, 0, FailureHandling.OPTIONAL))) {
			Mobile.takeScreenshot()
			KeywordUtil.markFailedAndStop(failureDescription)
		}
	}

	@Keyword
	def verifyElementNotPresent(TestObject element, String failureDescription, int waitTime = 5){

		if((Mobile.verifyElementExist(element, waitTime, FailureHandling.OPTIONAL))) {
			Mobile.takeScreenshot()
			KeywordUtil.markFailedAndStop(failureDescription)
		}
	}

	@Keyword
	def verifyElementText(TestObject element, String expectedText, String failureDescription){

		if(!(Mobile.verifyElementText(element, expectedText, FailureHandling.OPTIONAL))) {
			Mobile.takeScreenshot()
			KeywordUtil.markFailedAndStop(failureDescription)
		}
	}
}
