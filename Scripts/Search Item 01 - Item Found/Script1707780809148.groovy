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

int randomNumber = CustomKeywords.'customKeywords.randomGenerator.generateRandomNumber'()

println(randomNumber)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://advantageonlineshopping.com/#/')

WebUI.click(findTestObject('Spy/Homepage/Page_Advantage Shopping/searchIcon'))

switch (randomNumber) {
    case 1:
        WebUI.setText(findTestObject('Object Repository/Record/Search Item/Page_Advantage Shopping/input_Sign out_autoComplete'), 
            'HP Pavilion 15z')

        WebUI.sendKeys(findTestObject('Object Repository/Record/Search Item/Page_Advantage Shopping/input_Sign out_autoComplete'), 
            Keys.chord(Keys.ENTER))

        WebUI.verifyTextPresent('HP Pavilion 15z Laptop', false)

        break
    case 2:
        WebUI.setText(findTestObject('Object Repository/Record/Search Item/Page_Advantage Shopping/input_Sign out_autoComplete'), 
            'Logitech G')

        WebUI.sendKeys(findTestObject('Object Repository/Record/Search Item/Page_Advantage Shopping/input_Sign out_autoComplete'), 
            Keys.chord(Keys.ENTER))

        WebUI.verifyTextPresent('Logitech G502 Proteus Core', false)

        break
    case 3:
        WebUI.setText(findTestObject('Object Repository/Record/Search Item/Page_Advantage Shopping/input_Sign out_autoComplete'), 
            'Beats')

        WebUI.sendKeys(findTestObject('Object Repository/Record/Search Item/Page_Advantage Shopping/input_Sign out_autoComplete'), 
            Keys.chord(Keys.ENTER))

        WebUI.verifyTextPresent('Beats Studio 2 Over-Ear Matte Black Headphones', false)

        break
}

WebUI.closeBrowser()

