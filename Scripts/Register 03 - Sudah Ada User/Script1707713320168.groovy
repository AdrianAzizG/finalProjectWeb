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

WebUI.navigateToUrl('https://advantageonlineshopping.com/#/')

WebUI.click(findTestObject('Object Repository/Record/Register/Page_Advantage Shopping/svg_CHECKOUT  (0.00)_menuUser'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Record/Register/Page_Advantage Shopping/a_CREATE NEW ACCOUNT'))

WebUI.setText(findTestObject('Object Repository/Record/Register/Page_Advantage Shopping/input__usernameRegisterPage'), username)

WebUI.setText(findTestObject('Object Repository/Record/Register/Page_Advantage Shopping/input__emailRegisterPage'), email)

WebUI.setEncryptedText(findTestObject('Object Repository/Record/Register/Page_Advantage Shopping/input__passwordRegisterPage'), 
    password)

WebUI.setEncryptedText(findTestObject('Object Repository/Record/Register/Page_Advantage Shopping/input__confirm_passwordRegisterPage'), 
    password)

WebUI.click(findTestObject('Spy/Register/Page_Advantage Shopping/tocCheckbox'))

WebUI.click(findTestObject('Spy/Register/Page_Advantage Shopping/registerButton'))

WebUI.delay(4)

WebUI.verifyTextPresent('User name already exists', false)

WebUI.closeBrowser()

