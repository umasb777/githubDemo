import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.slideshare.net/')

WebUI.click(findTestObject('Object Repository/Page_Share and Discover Knowledge o/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Log in to SlideShare/input_Login with your SlideSha'), 'test')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in to SlideShare/input_Login with your SlideSha_1'), 'th01Xh6r9ew=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in to SlideShare/input_Login with your SlideSha_2'), '4eziiI4+NjI=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in to SlideShare/input_Login with your SlideSha_3'), 'KYTS5tmdQyg=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in to SlideShare/input_Login with your SlideSha_4'), 'P9ET2sDE0SE=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in to SlideShare/input_Login with your SlideSha_5'), 'P9ET2sDE0SE=')

WebUI.click(findTestObject('Object Repository/Page_Log in to SlideShare/input_Login with your SlideSha_6'))

WebUI.click(findTestObject('Object Repository/Page_Log in to SlideShare/button_Login'))

WebUI.closeBrowser()

