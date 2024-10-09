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

//Mobile.startApplication('/Users/vb/Desktop/WorkFolder/QA Testing/Project Testing/Mobile/android/APKs/Dev-sbsa-1.5.0/app-sbsabposdev-debug-1.5.3b16.apk', 
//    true)
//
//Mobile.delay(3)
//
//Mobile.tap(findTestObject('Home Actions and tab/LoginToOverviewFix/android.widget.Button(Sign in)'), 2)
//
//Mobile.delay(3)
//
//Mobile.setText(findTestObject('Home Actions and tab/LoginToOverviewFix/android.widget.EditText(Email)'), 'sealegeneral@gmail.com', 
//    2)
//
//'Email'
//Mobile.setText(findTestObject('Home Actions and tab/LoginToOverviewFix/android.widget.EditText(Email)'),
//	'sealegeneral@gmail.com', 0)
//Mobile.delay(8)
//
//Mobile.setText(findTestObject('Home Actions and tab/LoginToOverviewFix/android.widget.EditText(Password)'), 'Password123!!', 
//    2)
//
//Mobile.delay(8)
//
//'Show Password'
//Mobile.tap(findTestObject('Home Actions and tab/android.widget.Button (1)'), 0)
//Mobile.startApplication('/Users/vb/Desktop/WorkFolder/QA Testing/Project Testing/Mobile/android/APKs/dev-release 1.1.0/app-dev-release.apk',
//	true)
//
//Mobile.tap(findTestObject('Sell Now/quick sale/android.widget.Button'), 0)
//
//Mobile.delay(5)
//
//Mobile.setText(findTestObject('Sell Now/quick sale/android.widget.EditText - Username (Email Address)'),
//	'demo@littlefishapp.com', 0)
//
//Mobile.delay(5)
//
//Mobile.setText(findTestObject('Sell Now/quick sale/android.widget.EditText - Password'), 'Password123!',
//	0)
//
//Mobile.delay(5)
//
//Mobile.tap(findTestObject('Sell Now/quick sale/android.widget.Button (1)'), 0)
Mobile.startApplication('/Users/vb/Desktop/WorkFolder/QA Testing/Project Testing/Mobile/android/APKs/dev-release 1.1.0/littlefish-dev-1.1.0.apk', 
    true)

'Log In'
Mobile.tap(findTestObject('Sell Now/Add Quick Item/android.widget.Button'), 0)

'Email'
Mobile.setText(findTestObject('Sell Now/Add Quick Item/android.widget.EditText - Username (Email Address)'), 
    'demo@littlefishapp.com', 0)

Mobile.delay(5)

'Password'
Mobile.setText(findTestObject('Home Actions and tab/PasswordFixOBJ/android.widget.EditText - Password'), 
    'Password123!', 0)

//'Password'
//Mobile.setText(findTestObject('Sell Now/Add Quick Item/android.widget.EditText - Password'), 'Password123!',
//	0)
Mobile.delay(15)

'Login'
Mobile.tap(findTestObject('Sell Now/Add Quick Item/android.widget.Button (1)'), 0)

//'10s Delay'
//Mobile.delay(5)
//
//'Sign In'
//Mobile.tap(findTestObject('Home Actions and tab/LoginToOverviewFix/android.widget.Button(Login)'), 0)
Mobile.delay(10)

'burger menu'
Mobile.tap(findTestObject('Home Actions and tab/android.widget.Button (2)'), 0)

Mobile.delay(5)

'Tap on overview'
Mobile.tap(findTestObject('Home Actions and tab/android.view.View'), 0)

Mobile.delay(5)

'Tap on Add Product'
Mobile.tap(findTestObject('Home Actions and tab/android.view.View (1)'), 0)

Mobile.delay(5)

'Back to Overview'
Mobile.pressBack()

'Tap on stock take'
Mobile.tap(findTestObject('Home Actions and tab/android.view.View (2)'), 0)

Mobile.delay(5)

'Back to overview'
Mobile.pressBack()

'Tap on Reports'
Mobile.tap(findTestObject('Home Actions and tab/android.view.View (3)'), 0)

Mobile.delay(5)

'Scroll to supplier count'
Mobile.scrollToText('Supplier Count')

'Back to overview'
Mobile.pressBack()

Mobile.delay(5)

'Scroll to Low stock products'
Mobile.scrollToText('LOW STOCK PRODUCTS')

Mobile.delay(5)

'close application'
Mobile.closeApplication()

