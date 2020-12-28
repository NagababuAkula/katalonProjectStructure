package api

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

public class Common {
	
	@Keyword
	def String getAuthToken() {

		def responseLogin = WS.sendRequest(findTestObject("loginObject"))
		def loginJSON = jsonSlurper.parseText(responseLogin.getResponseText())

		println "accessToken: " + loginJSON

		return loginJSON.accessToken
	}
}
