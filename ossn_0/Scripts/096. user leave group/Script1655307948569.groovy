import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Welcome  OSSN/a_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login  OSSN/div_Login'), 'Login')

WebUI.setText(findTestObject('Object Repository/Page_Login  OSSN/input_Username_username'), 'user1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  OSSN/input_Password_password'), 'qeJ0sjJnwEs=')

WebUI.click(findTestObject('Object Repository/Page_Login  OSSN/input_Password_btn btn-primary'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_News Feed  OSSN/a_user 1'), 'user 1')

WebUI.click(findTestObject('Object Repository/Page_News Feed  OSSN/li_Groups'))

WebUI.click(findTestObject('Object Repository/Page_News Feed  OSSN/li_Public Admin Group'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Public Admin Group  OSSN/a_Public Admin Group'), 'Public Admin Group')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Public Admin Group  OSSN/a_Leave Group'))

WebUI.click(findTestObject('Object Repository/Page_Public Admin Group  OSSN/a_Groups'))

WebUI.click(findTestObject('Object Repository/Page_Public Admin Group  OSSN/li_Closed Admin Group'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Closed Admin Group  OSSN/a_Closed Admin Group'), 'Closed Admin Group')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Closed Admin Group  OSSN/a_Leave Group'))

WebUI.click(findTestObject('Object Repository/Page_Closed Admin Group  OSSN/i_OSSN_fa fa-sort-down'))

WebUI.click(findTestObject('Object Repository/Page_Closed Admin Group  OSSN/a_Log out'))

WebUI.closeBrowser()

