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

Mobile.tap(findTestObject('Transactions/All Page Refund with Card/android.widget.Button'), 0)

Mobile.setText(findTestObject('Transactions/All Page Refund with Card/android.widget.EditText - Username (Email Address)'), 
    'demo@littlefishapp.com', 0)

Mobile.setText(findTestObject('Transactions/All Page Refund with Card/android.widget.EditText - Password'), 
    'Password123!', 0)

Mobile.tap(findTestObject('Transactions/All Page Refund with Card/android.widget.Button (1)'), 0)

'Open sales Page'
Mobile.tap(findTestObject('Transactions/All Page Refund with Card/android.view.View'), 0)

'delay'
Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

//'Open first product'
//Mobile.tap(findTestObject('Transactions/All Page Refund with Card/android.view.View (1)'), 0)
'open first product'
Mobile.tap(findTestObject('Transactions/New Folder/android.view.View(125)'), 0)

'Open refund sales'
Mobile.tap(findTestObject('Transactions/All Page Refund with Card/android.widget.Button (2)'), 0)

'delay'
Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Select product to refund'
Mobile.tap(findTestObject('Transactions/New Folder/android.view.View(selectedProduct)'), 0)

'delay'
Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Increase product amounts'
Mobile.tap(findTestObject('Transactions/All Page Refund with Card/android.widget.Button (3)'), 0)

'Decrease product amounts '
Mobile.tap(findTestObject('Transactions/All Page Refund with Card/android.widget.Button (4)'), 0)

'Cotinue to refund'
Mobile.tap(findTestObject('Transactions/All Page Refund with Card/android.widget.Button (5)'), 0)

'select card refund '
Mobile.tap(findTestObject('Transactions/All Page Refund with Card/android.view.View (3)'), 0)

'Confirm Refund '
Mobile.tap(findTestObject('Transactions/Refunds/Confirm button/android.widget.Button(ConfirmRefund)'), 0)

'Tap on Print Button'
Mobile.tap(findTestObject('Transactions/All Page Refund with Card/android.widget.Button (6)'), 0)

'Tap on sms button'
Mobile.tap(findTestObject('Transactions/All Page Refund with Card/android.widget.Button (7)'), 0)

'Tap on send'
Mobile.tap(findTestObject('Transactions/All Page Refund with Card/android.widget.Button (8)'), 0)

'Tap on Close Notification'
Mobile.tap(findTestObject('Transactions/All Page Refund with Card/android.view.View (4)'), 0)

'Tap on email'
Mobile.tap(findTestObject('Transactions/All Page Refund with Card/android.widget.Button (9)'), 0)

'tap on send email'
Mobile.tap(findTestObject('Transactions/All Page Refund with Card/android.widget.Button (8)'), 0)

'Tap on close email notification '
Mobile.tap(findTestObject('Transactions/All Page view receipt/Missing tap to close on view receipt/android.view.View(tap to close)'), 
    0)

'Tap on Close button'
Mobile.tap(findTestObject('Transactions/Refunds/missing/android.widget.Button(closeButton)'), 0)

Mobile.closeApplication()

