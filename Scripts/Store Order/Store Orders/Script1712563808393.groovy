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

Mobile.delay(2)

Mobile.tap(findTestObject('Orders/android.widget.Button'), 0)

Mobile.delay(2)

Mobile.setText(findTestObject('Orders/android.widget.EditText - Username (Email Address)'), 'demo@littlefishapp.com', 
    0)

Mobile.delay(2)

Mobile.setText(findTestObject('Orders/android.widget.EditText - Password'), 'Password123!', 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Orders/android.widget.Button (1)'), 0)

Mobile.delay(2)

'Open Orders'
Mobile.tap(findTestObject('Orders/android.view.View (6)'), 0)

Mobile.delay(2)

'Complete Orders'
Mobile.tap(findTestObject('Orders/android.view.View (7)'), 0)

Mobile.delay(2)

'Back arrow Button tap'
Mobile.tap(findTestObject('Orders/android.widget.Button (2)'), 0)

Mobile.delay(2)

'Cancelled Orders'
Mobile.tap(findTestObject('Orders/android.view.View (8)'), 0)

Mobile.delay(2)

'Back Arrow Button Tap'
Mobile.tap(findTestObject('Orders/android.widget.Button (2)'), 0)

Mobile.delay(2)

'Confirmed Orders'
Mobile.tap(findTestObject('Orders/android.view.View (9)'), 0)

Mobile.delay(2)

'Back Arrow Button Tap'
Mobile.tap(findTestObject('Orders/android.widget.Button (2)'), 0)

Mobile.delay(2)

'Out For Delivery Orders'
Mobile.tap(findTestObject('Orders/android.view.View (10)'), 0)

Mobile.delay(2)

'Back Arrow Button'
Mobile.tap(findTestObject('Orders/android.widget.Button (2)'), 0)

Mobile.delay(2)

'Pending Orders'
Mobile.tap(findTestObject('Orders/android.view.View (11)'), 0)

Mobile.delay(2)

'Back Arrow Button'
Mobile.tap(findTestObject('Orders/android.widget.Button (2)'), 0)

Mobile.delay(2)

'Preparing Orders'
Mobile.tap(findTestObject('Orders/android.view.View (12)'), 0)

Mobile.delay(2)

'Back Arrow Button'
Mobile.tap(findTestObject('Orders/android.widget.Button (2)'), 0)

Mobile.delay(2)

'Ready for Collection (Not Displaying)'
Mobile.tap(findTestObject('Orders/android.view.View (13)'), 0)

Mobile.delay(2)

'Back Arrow Button'
Mobile.tap(findTestObject('Orders/android.widget.Button (2)'), 0)

Mobile.delay(2)

Mobile.closeApplication()

