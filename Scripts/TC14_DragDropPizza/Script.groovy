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

WebUI.executeJavaScript('''
var src = document.getElementById('drag1');
var tgt = document.getElementById('div1');
var dataTransfer = new DataTransfer();
function fire(el, type) {
  el.dispatchEvent(new DragEvent(type, { bubbles: true, cancelable: true, dataTransfer: dataTransfer }));
}
fire(src, 'dragstart');
fire(tgt, 'dragenter');
fire(tgt, 'dragover');
fire(tgt, 'drop');
fire(src, 'dragend');
''', null)
WebUI.verifyElementPresent(findTestObject('Page_AutomationCamp/img_pizzaInBox'), 10)

WebUI.closeBrowser()
