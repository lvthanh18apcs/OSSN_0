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

WebUI.click(findTestObject('Object Repository/Page_Welcome  OSSN/a_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login  OSSN/div_Login'), 'Login')

WebUI.setText(findTestObject('Object Repository/Page_Login  OSSN/input_Username_username'), 'admin1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  OSSN/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Login  OSSN/input_Password_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/Page_News Feed  OSSN/i_Groups_fa fa-th-list'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_News Feed  OSSN/a_admin 1'), 'admin 1')

WebUI.click(findTestObject('Object Repository/Page_News Feed  OSSN/li_Groups'))

WebUI.click(findTestObject('Object Repository/Page_News Feed  OSSN/li_Groups_1'))

WebUI.click(findTestObject('Object Repository/Page_Search results for  OSSN/div_People'))

WebUI.click(findTestObject('Object Repository/Page_Search results for  OSSN/a_user 1'))

WebUI.click(findTestObject('Object Repository/Page_user 1  OSSN/a_Message_btn-action'))

WebUI.click(findTestObject('Object Repository/Page_user 1  OSSN/a_Poke'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_user 1  OSSN/div_You have poked user 1'), 'You have poked user 1!')

WebUI.click(findTestObject('Object Repository/Page_user 1  OSSN/i_OSSN_fa fa-sort-down'))

WebUI.click(findTestObject('Object Repository/Page_user 1  OSSN/i_Groups_fa fa-th-list'))

WebUI.click(findTestObject('Object Repository/Page_user 1  OSSN/a_admin 1'))

WebUI.click(findTestObject('Object Repository/Page_admin 1  OSSN/a_Friends'))

WebUI.click(findTestObject('Object Repository/Page_admin 1  OSSN/a_user 1'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_user 1  OSSN/div_user 1'), 'user 1')

WebUI.click(findTestObject('Object Repository/Page_user 1  OSSN/a_Message_btn-action'))

WebUI.click(findTestObject('Object Repository/Page_user 1  OSSN/a_Poke_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_user 1  OSSN/div_You have poked user 1'), 'You have poked user 1!')

WebUI.click(findTestObject('Object Repository/Page_user 1  OSSN/a'))

WebUI.click(findTestObject('Object Repository/Page_user 1  OSSN/a_Log out'))

WebUI.closeBrowser()

