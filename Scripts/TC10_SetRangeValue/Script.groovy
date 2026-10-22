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

WebUI.executeJavaScript("var slider = document.getElementById('a'); slider.value = '85'; slider.dispatchEvent(new Event('input', { bubbles: true })); slider.dispatchEvent(new Event('change', { bubbles: true }));", null)
WebUI.verifyElementAttributeValue(findTestObject('Page_AutomationCamp/input_range'), 'value', '85', 10)
WebUI.verifyElementText(findTestObject('Page_AutomationCamp/output_range'), '85')

WebUI.closeBrowser()
