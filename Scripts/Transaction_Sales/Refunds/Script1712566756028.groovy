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

Mobile.tap(findTestObject('Transactions/Refunds/android.widget.Button'), 0)

Mobile.setText(findTestObject('Transactions/Refunds/android.widget.EditText - Username (Email Address)'),
	'demo@littlefishapp.com', 0)

Mobile.setText(findTestObject('Transactions/Refunds/android.widget.EditText - Password'), 'Password123!',
	0)

Mobile.tap(findTestObject('Transactions/Refunds/android.widget.Button (1)'), 0)

Mobile.delay(5)

'Tap On sales page'
Mobile.tap(findTestObject('Transactions/Refunds/android.view.View'), 0)

'Tap on Refund list Item'
Mobile.tap(findTestObject('Transactions/Refunds/android.view.View (1)'), 0)

'Tap on refund Item'
Mobile.tap(findTestObject('Transactions/Refunds/android.view.View (2)'), 0)

'Tap On First Item (Not working)'
Mobile.tap(findTestObject('Transactions/Refunds/android.view.View (3)'), 0)

'Tap On Refund sale'
Mobile.tap(findTestObject('Transactions/Refunds/android.widget.Button (2)'), 0)

'Tap on first product (Not working)'
Mobile.tap(findTestObject('Transactions/Refunds/android.view.View (4)'), 0)

'Tap on working Product'
Mobile.tap(findTestObject('Transactions/Refunds/android.view.View (5)'), 0)

'Continuing with the refund process'
Mobile.tap(findTestObject('Transactions/Refunds/android.widget.Button (3)'), 0)

'Back button '
Mobile.tap(findTestObject('Transactions/Refunds/android.widget.Button (4)'), 0)

'Back button '
Mobile.tap(findTestObject('Transactions/Refunds/android.widget.Button (4)'), 0)

'View Refunds '
Mobile.tap(findTestObject('Transactions/Refunds/android.widget.Button (5)'), 0)

'View Items'
Mobile.tap(findTestObject('Transactions/Refunds/android.view.View (6)'), 0)

'back button '
Mobile.tap(findTestObject('Transactions/Refunds/android.widget.Button (6)'), 0)

'Back Button '
Mobile.tap(findTestObject('Transactions/Refunds/android.widget.Button (6)'), 0)

'Tap On vew Receipt '
Mobile.tap(findTestObject(null), 0)

'Back button '
Mobile.tap(findTestObject('Transactions/Refunds/android.widget.Button (4)'), 0)

