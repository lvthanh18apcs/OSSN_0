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

WebUI.click(findTestObject('Object Repository/Page_Login  OSSN/input_Password_btn btn-primary'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dashboard  OSSN/div_You are now logged in'), 'You are now logged in!')

WebUI.click(findTestObject('Object Repository/Page_Dashboard  OSSN/i_Log out_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  OSSN/a_Configure'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  OSSN/a_Site Pages'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Ossn Site Pages  OSSN/div_Ossn Site Pages'), 'OSSN SITE PAGES')

WebUI.click(findTestObject('Object Repository/Page_Ossn Site Pages  OSSN/a_Terms and Conditions'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Ossn Site Pages  OSSN/label_Terms and Conditions'), 'Terms and Conditions')

WebUI.click(findTestObject('Object Repository/Page_Ossn Site Pages  OSSN/p'))

WebUI.setText(findTestObject('Object Repository/Page_Ossn Site Pages  OSSN/body_We have terms and conditions here'), '<p style="">We have terms and conditions here</p><div id="katalon" style="top: 0px;"><div id="katalon-rec_elementInfoDiv" style="display: none;"></div></div>')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Ossn Site Pages  OSSN/input_Powered by Tiny_btn btn-success btn-sm'))

WebUI.click(findTestObject('Object Repository/Page_Ossn Site Pages  OSSN/a_About'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Ossn Site Pages  OSSN/label_About'), 'About')

WebUI.click(findTestObject('Object Repository/Page_Ossn Site Pages  OSSN/p'))

WebUI.setText(findTestObject('Object Repository/Page_Ossn Site Pages  OSSN/body_We have About Us here'), '<p style="">We have About Us here</p><div id="katalon" style="top: 0px;"><div id="katalon-rec_elementInfoDiv" style="display: none;"></div></div>')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Ossn Site Pages  OSSN/input_Powered by Tiny_btn btn-success btn-sm'))

WebUI.click(findTestObject('Object Repository/Page_Ossn Site Pages  OSSN/a_Privacy'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Ossn Site Pages  OSSN/label_Privacy'), 'Privacy')

WebUI.click(findTestObject('Object Repository/Page_Ossn Site Pages  OSSN/p'))

WebUI.setText(findTestObject('Object Repository/Page_Ossn Site Pages  OSSN/body_We have privacy terms here'), '<p style="">We have privacy terms here</p><div id="katalon" style="top: 0px;"><div id="katalon-rec_elementInfoDiv" style="display: none;"></div></div>')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Ossn Site Pages  OSSN/input_Powered by Tiny_btn btn-success btn-sm'))

WebUI.click(findTestObject('Object Repository/Page_Ossn Site Pages  OSSN/i_Log out_fa fa-bars fa-3'))

WebUI.click(findTestObject('Object Repository/Page_Ossn Site Pages  OSSN/a_Log out'))

WebUI.closeBrowser()

