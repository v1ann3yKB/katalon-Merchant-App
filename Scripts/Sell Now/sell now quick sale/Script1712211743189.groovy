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

Mobile.startApplication('/Users/vb/Desktop/WorkFolder/QA Testing/Project Testing/Mobile/android/APKs/dev-release 1.1.0/app-dev-release.apk', 
    true)

Mobile.tap(findTestObject('Sell Now/quick sale/android.widget.Button'), 0)

Mobile.setText(findTestObject('Sell Now/quick sale/android.widget.EditText - Username (Email Address)'), 
    'demo@littlefishapp.com', 0)

Mobile.setText(findTestObject('Sell Now/quick sale/android.widget.EditText - Password'), 'Password123!', 
    0)

Mobile.tap(findTestObject('Sell Now/quick sale/android.widget.Button (1)'), 0)

'3 dots menu'
Mobile.tap(findTestObject('Sell Now/quick sale/android.view.View(3dots)'), 0)

'capture amount'
Mobile.tap(findTestObject('Sell Now/quick sale/android.view.View(Amount)'), 0)

'tap on button 2'
Mobile.tap(findTestObject('Sell Now/quick sale/android.view.View(button2)'), 0)

'tap on button 5'
Mobile.tap(findTestObject('Sell Now/quick sale/android.view.View(button5)'), 0)

'tap on button 0'
Mobile.tap(findTestObject('Sell Now/quick sale/android.view.View(button0)'), 0)

'tap on button 0'
Mobile.tap(findTestObject('Sell Now/quick sale/android.view.View(button0)'), 0)

'tap on payment 1'
Mobile.tap(findTestObject('Sell Now/quick sale/android.widget.Button(payment1)'), 0)

'tap on cash'
Mobile.tap(findTestObject('Sell Now/quick sale/android.view.View(cash)'), 0)

'tap on button payment 2'
Mobile.tap(findTestObject('Sell Now/quick sale/android.widget.Button(payment1)'), 0)

'tap on button 2'
Mobile.tap(findTestObject('Sell Now/quick sale/android.view.View(3dots)'), 0)

'tap on button 5'
Mobile.tap(findTestObject('Sell Now/quick sale/android.view.View(tapButton5)'), 0)

'tap on button 0'
Mobile.tap(findTestObject('Sell Now/quick sale/android.view.View(tapButton0)'), 0)

'tap on button 0'
Mobile.tap(findTestObject('Sell Now/quick sale/android.view.View(tapButton0)'), 0)

'tap on button payment 3'
Mobile.tap(findTestObject('Sell Now/quick sale/android.widget.Button(payment1)'), 0)

'tap on button close '
Mobile.tap(findTestObject('Sell Now/quick sale/android.widget.Button(payment1)'), 0)

Mobile.closeApplication()

