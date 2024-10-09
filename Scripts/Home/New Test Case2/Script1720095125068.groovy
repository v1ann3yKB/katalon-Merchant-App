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

//Mobile.startApplication('/Users/vb/Desktop/WorkFolder/QA Testing/Project Testing/Mobile/android/APKs/dev-release 1.3.0/app-dev-release 1.3.0.apk',
//	true)

Mobile.delay(5)

Mobile.tap(findTestObject('Home Actions and tab/test2/android.widget.Button'), 0)

Mobile.delay(5)

'enter email'
Mobile.setText(findTestObject('Home Actions and tab/test2/android.widget.EditText - Username (Email Address)'), 
    'demo@littlefishapp.com', 0)

Mobile.delay(5)

'enter password'
Mobile.setText(findTestObject('Home Actions and tab/test2/android.widget.EditText - Password'), 'Password123!', 
    0)

Mobile.delay(8)

//Mobile.tap(findTestObject('Home Actions and tab/test2/android.widget.Button (1)'), 0)
'tap on login'
Mobile.tap(findTestObject('Transactions/Refunds/android.widget.Button (1)'), 0)

Mobile.delay(15)

Mobile.tap(findTestObject('Home Actions and tab/test2/android.widget.ImageView'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Home Actions and tab/test2/android.widget.Button (2)'), 0)

Mobile.delay(5)

Mobile.closeApplication()

