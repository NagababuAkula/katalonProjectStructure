package web

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class Verifications {

	/**
	 * Reusable Methods
	 */
	@Keyword
	def verifyElementPresent(TestObject element, String failureDescription, int maxWaitTime = GlobalVariable.defaultWaitTime) {
		if(!WebUI.verifyElementPresent(element, maxWaitTime, FailureHandling.OPTIONAL)) {
			WebUI.takeScreenshot()
			KeywordUtil.markFailedAndStop(failureDescription)
		}
	}

	@Keyword
	def verifyElementPresentAndContinueOnFailure(TestObject element, String failureDescription, int maxWaitTime = GlobalVariable.defaultWaitTime) {
		if(!WebUI.verifyElementPresent(element, maxWaitTime, FailureHandling.OPTIONAL)) {
			WebUI.takeScreenshot()
			KeywordUtil.markFailed(failureDescription)
		}
	}

	@Keyword
	def verifyElementNotPresent(TestObject element, String failureDescription, int maxWaitTime = GlobalVariable.defaultWaitTime) {
		if(!(WebUI.verifyElementNotPresent(element, maxWaitTime, FailureHandling.OPTIONAL))) {
			WebUI.takeScreenshot()
			KeywordUtil.markFailedAndStop(failureDescription)
		}
	}

	@Keyword
	def verifyElementNotPresentAndContinuewOnFailure(TestObject element, String failureDescription, int maxWaitTime = GlobalVariable.defaultWaitTime) {
		if(!WebUI.verifyElementNotPresent(element, maxWaitTime, FailureHandling.OPTIONAL)) {
			WebUI.takeScreenshot()
			KeywordUtil.markFailed(failureDescription)
		}
	}

	@Keyword
	def verifyTextMatch(String actual, String expected, String failureDescription){
		if(!(WebUI.verifyMatch(actual, expected, false))){
			WebUI.takeScreenshot()
			KeywordUtil.markFailedAndStop(failureDescription)
		}
	}

	@Keyword
	def verifyElementVisible(TestObject element, String failureDescription){
		if(!(WebUI.verifyElementVisible(element))){
			WebUI.takeScreenshot()
			KeywordUtil.markFailedAndStop(failureDescription)
		}
	}

	@Keyword
	def verifyElementNotVisible(TestObject element, String failureDescription){
		if(!(WebUI.verifyElementNotVisible(element))){
			WebUI.takeScreenshot()
			KeywordUtil.markFailedAndStop(failureDescription)
		}
	}

	@Keyword
	def verifyElementClickable(TestObject element, String failureDescription){
		if(!(WebUI.verifyElementClickable(element))){
			WebUI.takeScreenshot()
			KeywordUtil.markFailedAndStop(failureDescription)
		}
	}

	@Keyword
	def verifyElementNotClickable(TestObject element, String failureDescription){
		if(!(WebUI.verifyElementNotClickable(element))){
			WebUI.takeScreenshot()
			KeywordUtil.markFailedAndStop(failureDescription)
		}
	}

	@Keyword
	def verifyTextboxEditable(TestObject element){
	}

	@Keyword
	def verifyObjectsMatch(def actual, def expected, String failureDescription){

		if(!actual.equals(expected)) {
			WebUI.takeScreenshot()
			KeywordUtil.markFailedAndStop(failureDescription)
		}
	}
	
	@Keyword
	def getUrlAndVerify(String name, String failuredescription ) {
		if(!(WebUI.getUrl().endsWith(name))) {
			WebUI.takeScreenshot()
			KeywordUtil.markFailed(failuredescription)
		}
	}
}
