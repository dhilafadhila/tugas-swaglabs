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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login_001 Success Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Swag Labs/Products_button_Add to cart'))

WebUI.click(findTestObject('Page_Swag Labs/Products_cart_icon'))

WebUI.verifyElementText(findTestObject('Page_Swag Labs/Your Cart_header'), 'Your Cart')

WebUI.click(findTestObject('Page_Swag Labs/YourCart_button_Checkout'))

WebUI.verifyElementText(findTestObject('Page_Swag Labs/Checkout_header_information'), 'Checkout: Your Information')

randomName = RandomStringUtils.randomAlphabetic(8)

postalCode = RandomStringUtils.randomNumeric(6)

WebUI.setText(findTestObject('Page_Swag Labs/Checkout_input_firstName'), randomName)

WebUI.setText(findTestObject('Page_Swag Labs/Checkout_input_lastName'), randomName)

WebUI.setText(findTestObject('Page_Swag Labs/Checkout_input_postalCode'), postalCode)

WebUI.scrollToElement(findTestObject('Page_Swag Labs/Checkout_button_continue'), 0)

WebUI.click(findTestObject('Page_Swag Labs/Checkout_button_continue'))

WebUI.verifyElementText(findTestObject('Page_Swag Labs/Checkout_header_Overview'), 'Checkout: Overview')

WebUI.scrollToElement(findTestObject('Page_Swag Labs/Checkout_button_Finish'), 0)

WebUI.click(findTestObject('Page_Swag Labs/Checkout_button_Finish'))

WebUI.verifyElementText(findTestObject('Page_Swag Labs/Complete_header Complete'), 'Checkout: Complete!')

WebUI.verifyElementText(findTestObject('Page_Swag Labs/Complete_Thank you for your order'), 'Thank you for your order!')

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/Complete_header Complete'), 0)

