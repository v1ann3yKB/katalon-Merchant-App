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

'Log In'
Mobile.tap(findTestObject('Sell Now/Add Quick Item/android.widget.Button'), 0)

'Email'
Mobile.setText(findTestObject('Sell Now/Add Quick Item/android.widget.EditText - Username (Email Address)'), 
    'demo@littlefishapp.com', 0)

'Password'
Mobile.setText(findTestObject('Sell Now/Add Quick Item/android.widget.EditText - Password'), 'Password123!', 
    0)

'Login'
Mobile.tap(findTestObject('Sell Now/Add Quick Item/android.widget.Button (1)'), 0)

'10s Delay'
Mobile.delay(10)

'Add Quick Item Button Tap'
Mobile.tap(findTestObject('Sell Now/Add Quick Item/android.widget.ImageView(QuickItem)'), 0)

'Tap On Button 2'
Mobile.tap(findTestObject('Sell Now/Add Quick Item/android.view.View(button2)'), 0)

'Tap On Button 6'
Mobile.tap(findTestObject('Sell Now/Add Quick Item/android.view.View(button6)'), 0)

'Tap On Button 0'
Mobile.tap(findTestObject('Sell Now/Add Quick Item/android.view.View(button0)'), 0)

'Tap On Button 0'
Mobile.tap(findTestObject('Sell Now/Add Quick Item/android.view.View(button0)'), 0)

'Setting description '
Mobile.setText(findTestObject('Sell Now/Add Quick Item/android.widget.EditText - Description'), 'Food', 
    0)

'back to close the keyboard'
Mobile.pressBack()

'Tap On Add'
Mobile.tap(findTestObject('Sell Now/Add Quick Item/android.widget.Button(add)'), 0)

Mobile.closeApplication()

