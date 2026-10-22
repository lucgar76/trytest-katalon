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

WebUI.click(findTestObject('Page_AutomationCamp/button_Submit'))
WebUI.switchToWindowIndex(1)
WebUI.verifyMatch(WebUI.getUrl(), '.*google\\.com.*', true)
WebUI.verifyElementPresent(findTestObject('Page_Google/svg_logo'), 10)

WebUI.closeBrowser()
