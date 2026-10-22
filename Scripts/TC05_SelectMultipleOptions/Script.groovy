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

def multi = new Select(WebUiCommonHelper.findWebElement(findTestObject('Page_AutomationCamp/select_multiple'), 10))
multi.deselectAll()
multi.selectByVisibleText('Option 1')
multi.selectByVisibleText('Option 2')
multi.selectByVisibleText('Option 3')
def selected = multi.getAllSelectedOptions().collect { it.getText() }
WebUI.verifyEqual(selected, ['Option 1', 'Option 2', 'Option 3'])

WebUI.closeBrowser()
