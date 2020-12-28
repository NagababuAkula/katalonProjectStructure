package mobile

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil

import internal.GlobalVariable

public class Mobileactions {
	
	
	def waitTime = GlobalVariable.defaultWaitTime

	@Keyword
	def tap(TestObject element) {

		Mobile.tap(element, waitTime)
	}

	@Keyword
	def getText(TestObject element) {

		Mobile.getText(element, waitTime)
	}

	@Keyword
	def sendKeys(TestObject element, String text) {

		Mobile.sendKeys(element, text)
	}

	@Keyword
	def getMobileElementsCount(String xpath) {
		def count = 0
		try{
			count = MobileDriverFactory.getDriver().findElementsByXPath(xpath).size()
			return count
		}catch(Exception e){
			return 0
		}
	}

	@Keyword
	def failInMobile(String failureDescription) {
		Mobile.takeScreenshot()
		KeywordUtil.markFailed(failureDescription)
	}
}
