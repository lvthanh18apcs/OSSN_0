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

WebUI.navigateToUrl('http://localhost/administrator')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login  OSSN/div_Administration'), 'ADMINISTRATION')

WebUI.setText(findTestObject('Object Repository/Page_Login  OSSN/input_Username_username'), 'admin1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  OSSN/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.sendKeys(findTestObject('Object Repository/Page_Login  OSSN/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dashboard  OSSN/div_You are now logged in'), 'You are now logged in!')

WebUI.click(findTestObject('Object Repository/Page_Dashboard  OSSN/i_Log out_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  OSSN/a_User Manager'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  OSSN/a_Unvalidated Users'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Unvalidated Users  OSSN/div_Unvalidated Users'), 'UNVALIDATED USERS')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Unvalidated Users  OSSN/div_user unvalidated'), 'user unvalidated')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Unvalidated Users  OSSN/a_Validate'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Unvalidated Users  OSSN/a_Edit'))

WebUI.setText(findTestObject('Object Repository/Page_Unvalidated Users  OSSN/input_Unvalidated Users_search_users'), 'user')

WebUI.click(findTestObject('Object Repository/Page_Unvalidated Users  OSSN/input_Unvalidated Users_btn btn-primary'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Unvalidated Users  OSSN/div_user unvalidated'), 'user unvalidated')

WebUI.click(findTestObject('Object Repository/Page_Unvalidated Users  OSSN/i_Log out_fa fa-bars fa-3'))

WebUI.click(findTestObject('Object Repository/Page_Unvalidated Users  OSSN/a_Log out'))

WebUI.closeBrowser()

