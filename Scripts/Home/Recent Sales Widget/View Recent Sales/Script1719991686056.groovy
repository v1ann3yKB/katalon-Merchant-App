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

'5s delay'
Mobile.delay(5)

'Email'
Mobile.setText(findTestObject('Sell Now/Add Quick Item/android.widget.EditText - Username (Email Address)'), 
    'demo@littlefishapp.com', 0)

'5s delay'
Mobile.delay(2)

'Password'
Mobile.setText(findTestObject('Home Actions and tab/PasswordFixOBJ/android.widget.EditText - Password'), 
    'Password123!', 0)

'3s delay'
Mobile.delay(5)

'Login'
Mobile.tap(findTestObject('Sell Now/Add Quick Item/android.widget.Button (1)'), 0)

'10s Delay'
Mobile.delay(15)

'Tap on Home button'
Mobile.tap(findTestObject('Home Actions and tab/HomeOBJ/android.view.View(Home)'), 0)

'10s delay'
Mobile.delay(10)

Mobile.closeApplication()

