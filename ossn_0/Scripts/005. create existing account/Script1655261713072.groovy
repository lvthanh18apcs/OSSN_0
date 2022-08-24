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

WebUI.setText(findTestObject('Object Repository/Page_Welcome  OSSN/input_Create an account_firstname'), 'user')

WebUI.setText(findTestObject('Object Repository/Page_Welcome  OSSN/input_Create an account_lastname'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Welcome  OSSN/input_Create an account_email'), 'user1@test.com')

WebUI.setText(findTestObject('Object Repository/Page_Welcome  OSSN/input_Create an account_email_re'), 'user1@test.com')

WebUI.setText(findTestObject('Object Repository/Page_Welcome  OSSN/input_Create an account_username'), 'user1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Welcome  OSSN/input_Create an account_password'), 'qeJ0sjJnwEs=')

WebUI.click(findTestObject('Object Repository/Page_Welcome  OSSN/input_Create an account_birthdate'))

WebUI.click(findTestObject('Object Repository/Page_Welcome  OSSN/a_1'))

WebUI.click(findTestObject('Object Repository/Page_Welcome  OSSN/input_Create an account_gender'))

WebUI.click(findTestObject('Object Repository/Page_Welcome  OSSN/input_Terms and Conditions_ossn-submit-button'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Welcome  OSSN/div_The following username is taken. Please_b35022'), 
    'The following username is taken. Please select a different one.')

WebUI.closeBrowser()

