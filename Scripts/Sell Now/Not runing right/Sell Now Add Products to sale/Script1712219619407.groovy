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

Mobile.startApplication('/Users/vb/Desktop/WorkFolder/QA Testing/Project Testing/Mobile/android/APKs/dev-release 1.1.0/littlefish-dev-1.1.0.apk', 
    true)

Mobile.tap(findTestObject('Sell Now/Add Products to sale/android.widget.Button'), 0)

Mobile.setText(findTestObject('Sell Now/Add Products to sale/android.widget.EditText - Username (Email Address)'), 
    'demo@littlefishapp.com', 0)

Mobile.setText(findTestObject('Sell Now/Add Products to sale/android.widget.EditText - Password'), 'Password123!', 
    0)

Mobile.tap(findTestObject('Sell Now/Add Products to sale/android.widget.Button (1)'), 0)

Mobile.delay(6)

Mobile.tap(findTestObject('Sell Now/Add Products to sale/product icon/android.view.View(reelicon)'), 0)

Mobile.tap(findTestObject('Sell Now/Add Products to sale/product icon/android.view.View(product1)'), 0)

'tap on payment'
Mobile.tap(findTestObject('Sell Now/Add Products to sale/android.widget.Button (2)'), 0)

'tap on cash'
Mobile.tap(findTestObject('Sell Now/Add Products to sale/android.view.View (1)'), 0)

'tap on confirm'
Mobile.tap(findTestObject('Sell Now/Add Products to sale/android.widget.Button (3)'), 0)

Mobile.tap(findTestObject('Sell Now/Add Products to sale/android.view.View (2)'), 0)

Mobile.tap(findTestObject('Sell Now/Add Products to sale/android.view.View (3)'), 0)

Mobile.tap(findTestObject('Sell Now/Add Products to sale/android.view.View (4)'), 0)

Mobile.tap(findTestObject('Sell Now/Add Products to sale/android.view.View (4)'), 0)

Mobile.tap(findTestObject('Sell Now/Add Products to sale/android.view.View (4)'), 0)

Mobile.tap(findTestObject('Sell Now/Add Products to sale/android.widget.Button (2)'), 0)

Mobile.checkElement(findTestObject(null), 0)

Mobile.closeApplication()

