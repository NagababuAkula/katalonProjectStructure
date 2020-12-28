package mobile

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.internal.PathUtil

import internal.GlobalVariable

public class setup {
	
	@Keyword
	def startApplication(){
	def appPath = PathUtil.relativeToAbsolutePath(GlobalVariable.ApplicationPath, RunConfiguration.getProjectDir())
		Mobile.startApplication(appPath, false)
	}
}
