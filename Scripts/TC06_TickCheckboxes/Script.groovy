import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.support.ui.Select as Select

WebUI.openBrowser('')
WebUI.navigateToUrl('https://play2.automationcamp.ir/')
WebUI.maximizeWindow()

WebUI.check(findTestObject('Page_AutomationCamp/checkbox_option1'))
WebUI.check(findTestObject('Page_AutomationCamp/checkbox_option3'))
WebUI.verifyElementChecked(findTestObject('Page_AutomationCamp/checkbox_option1'), 10)
WebUI.verifyElementChecked(findTestObject('Page_AutomationCamp/checkbox_option3'), 10)

WebUI.closeBrowser()
