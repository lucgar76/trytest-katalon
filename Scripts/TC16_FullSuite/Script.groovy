import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.support.ui.Select as Select

WebUI.callTestCase(findTestCase('TC01_VisitWebsite'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('TC02_EnterName'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('TC03_SelectGender'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('TC04_SelectOption'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('TC05_SelectMultipleOptions'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('TC06_TickCheckboxes'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('TC07_SelectDatalist'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('TC08_PickColor'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('TC09_SelectDate'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('TC10_SetRangeValue'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('TC11_UploadFile'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('TC12_SetQuantity'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('TC13_AssertDefaultMessage'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('TC14_DragDropPizza'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('TC15_SubmitButton'), [:], FailureHandling.STOP_ON_FAILURE)
