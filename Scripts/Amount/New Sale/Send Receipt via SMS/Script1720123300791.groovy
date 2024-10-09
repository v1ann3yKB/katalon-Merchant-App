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

Mobile.delay(3)

'Tap On SMS'
Mobile.tap(findTestObject('Amount/QuickSale/android.widget.Button(SMSsales)'), 0)

'10s Delay'
Mobile.delay(2)

'Setting phone number'
Mobile.setText(findTestObject('Amount/QuickSale/android.widget.EditText - Mobile Number'), '0726104742', 0)

Mobile.delay(3)

'Tap On Send'
Mobile.tap(findTestObject('Amount/QuickSale/android.widget.Button(SendSMS)'), 0)

Mobile.delay(3)

'Tap On SMS Sent'
Mobile.tap(findTestObject('Amount/QuickSale/android.view.View(SMS sent BTN)'), 0)

Mobile.delay(3)

'Tap On Close'
Mobile.tap(findTestObject('Amount/QuickSale/android.widget.Button(CloseBTN)'), 0)

Mobile.delay(3)