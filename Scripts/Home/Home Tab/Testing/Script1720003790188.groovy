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
//Mobile.tap(findTestObject('Home Actions and tab/Test/android.widget.Button (1)'), 0)
//
//Mobile.delay(10)
//
//WebUI.setText(findTestObject('Home Actions and tab/Test/android.widget.EditText(Emails)'), 'sealegeneral@gmail.com')
//Mobile.setText(findTestObject('Home Actions and tab/Test/android.widget.EditText(Emails)'), 'sealegeneral@gmail.com', 
//    0)
//
//Mobile.delay(10)
//
//Mobile.setText(findTestObject('Home Actions and tab/LoginToOverviewFix/android.widget.EditText(Password)'), 'Password123!!',
//	2)
//
//Mobile.delay(10)
//
//'Show Password'
//Mobile.tap(findTestObject('Home Actions and tab/android.widget.Button (1)'), 0)
Mobile.startApplication('/Users/vb/Desktop/WorkFolder/QA Testing/Project Testing/Mobile/android/APKs/dev-release 1.1.0/littlefish-dev-1.1.0.apk', 
    true)

'Log In'
Mobile.tap(findTestObject('Sell Now/Add Quick Item/android.widget.Button'), 0)

Mobile.delay(5)

'Email'
Mobile.setText(findTestObject('Sell Now/Add Quick Item/android.widget.EditText - Username (Email Address)'), 
    'demo@littlefishapp.com', 0)

Mobile.delay(2)

//Mobile.setText(findTestObject('Sell Now/Add Quick Item/android.widget.EditText - Password'), 'Password123!', 
//    0)
//Mobile.setText(findTestObject('Home Actions and tab/HomeOBJ/android.widget.EditText - Password(Pass)'), 'Password123!', 
//    2)
'Password'
Mobile.setText(findTestObject('Home Actions and tab/PasswordFixOBJ/android.widget.EditText - Password'), 
    'Password123!', 0)

Mobile.delay(3)

'Login'
Mobile.tap(findTestObject('Sell Now/Add Quick Item/android.widget.Button (1)'), 0)

'10s Delay'
Mobile.delay(10)

'Tap on Home button'
Mobile.tap(findTestObject('Home Actions and tab/HomeOBJ/android.view.View(Home)'), 0)

Mobile.delay(5)

'Tap on Add Products'
Mobile.tap(findTestObject('Home Actions and tab/HomeOBJ/android.view.View(AddProduct)'), 0)

Mobile.delay(5)

//'scroll to Online Settings'
//Mobile.scrollToText('Online Settings')
//
//Mobile.delay(3)

//'scroll to Details'
//Mobile.scrollToText('Details')
//
//Mobile.delay(5)

'back to close the keyboard'
Mobile.pressBack()

Mobile.delay(5)

'Tap on Stock Take'
Mobile.tap(findTestObject('Home Actions and tab/HomeOBJ/android.view.View(StockTake)'), 0)

Mobile.delay(5)

//'scroll to Supplier Count'
//Mobile.scrollToText('Supplier Count')
//
//Mobile.delay(5)

'back to close the keyboard'
Mobile.pressBack()

Mobile.delay(5)

'Tap on Reports'
Mobile.tap(findTestObject('Home Actions and tab/HomeOBJ/android.view.View(Reports)'), 0)

Mobile.delay(5)

'Tap on Profit and Loss'
Mobile.tap(findTestObject('Home Actions and tab/HomeOBJ/android.view.View(ProfitAndLoss)'), 0)

Mobile.delay(5)

'Tap on 3M'
Mobile.tap(findTestObject('Home Actions and tab/HomeOBJ/android.view.View(3M)'), 0)

Mobile.delay(5)

Mobile.scrollToText('Scales By Payment Type')

Mobile.delay(5)

'Tap on Cash'
Mobile.tap(findTestObject('Home Actions and tab/HomeOBJ/android.view.View(CaashType)'), 0)

Mobile.delay(3)

'Tap on Cash'
Mobile.tap(findTestObject('Home Actions and tab/HomeOBJ/android.view.View(CaashType)'), 0)

'back to close the keyboard'
Mobile.pressBack()

'10s Delay'
Mobile.delay(10)

Mobile.closeApplication()

