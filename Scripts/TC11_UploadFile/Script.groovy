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

String filePath = RunConfiguration.getProjectDir() + '/Data Files/sample-upload.txt'
WebUI.uploadFile(findTestObject('Page_AutomationCamp/input_file'), filePath)
String uploaded = WebUI.getAttribute(findTestObject('Page_AutomationCamp/input_file'), 'value')
WebUI.verifyMatch(uploaded, '.*sample-upload\\.txt.*', true)

WebUI.closeBrowser()
