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

WebUI.click(findTestObject('Object Repository/Page_Dashboard  OSSN/button_Log out_navbar-toggler'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  OSSN/a_Themes'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  OSSN/a_Themes_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Themes  OSSN/div_Themes'), 'THEMES')

WebUI.click(findTestObject('Object Repository/Page_Themes  OSSN/i_GoBlue 6.0_fa fa-sort-down'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Themes  OSSN/i_6.0_component-title-icon component-title-_997e9a'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Themes  OSSN/i_Log out_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Page_Themes  OSSN/a_Themes'))

WebUI.click(findTestObject('Object Repository/Page_Themes  OSSN/a_Installer'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Theme Installer  OSSN/div_Theme Installer'), 'THEME INSTALLER')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Theme Installer  OSSN/input_Theme Installer_theme_file'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Theme Installer  OSSN/input_Theme Installer_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/Page_Theme Installer  OSSN/i_Log out_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Page_Theme Installer  OSSN/a_Themes'))

WebUI.click(findTestObject('Object Repository/Page_Theme Installer  OSSN/a_GoBlue'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_GoBlue  OSSN/div_GoBlue'), 'GOBLUE')

WebUI.verifyElementText(findTestObject('Object Repository/Page_GoBlue  OSSN/input_Site Logo (450x90 - 500 KB PNG)_logo_site'), 
    '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_GoBlue  OSSN/input_Admin Logo (180x45 - 500 KB JPG)_logo_admin'), 
    '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_GoBlue  OSSN/input_Admin Logo (180x45 - 500 KB JPG)_btn _85f838'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_GoBlue  OSSN/i_Log out_fa fa-bars fa-3'))

WebUI.click(findTestObject('Object Repository/Page_GoBlue  OSSN/a_Log out'))

WebUI.closeBrowser()

