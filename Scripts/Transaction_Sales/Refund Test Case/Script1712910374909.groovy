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

Mobile.tap(findTestObject('Transactions/Refunds/New Refund/android.widget.Button'), 0)

Mobile.setText(findTestObject('Transactions/Refunds/New Refund/android.widget.EditText - Username (Email Address)'), 
    'demo@littlefishapp.com', 0)

Mobile.setText(findTestObject('Transactions/Refunds/New Refund/android.widget.EditText - Password'), 'Password123!', 
    0)

Mobile.tap(findTestObject('Transactions/Refunds/New Refund/android.widget.Button (1)'), 0)

Mobile.delay(6)

'Tap on sales'
Mobile.tap(findTestObject('Transactions/Refunds/New Refund/android.view.View'), 0)

Mobile.delay(1)

'Tap on complete'
Mobile.tap(findTestObject('Transactions/Refunds/New Refund/android.view.View (1)'), 0)

Mobile.delay(1)

'Tap on product'
Mobile.tap(findTestObject('Transactions/Refunds/New Refund/android.view.View (2)'), 0)

Mobile.delay(1)

'Tap on refund sales'
Mobile.tap(findTestObject('Transactions/Refunds/New Refund/android.widget.Button (2)'), 0)

Mobile.delay(1)

'Tap on product selected'
Mobile.tap(findTestObject('Transactions/Refunds/New Refund/android.view.View (3)'), 0)

Mobile.delay(1)

'Tap on confirm'
Mobile.tap(findTestObject('Transactions/Refunds/New Refund/android.widget.Button (3)'), 0)

Mobile.delay(1)

'Tap on add customer (Not working)'
Mobile.tap(findTestObject('Transactions/Refunds/New Refunds/android.widget.Button(addCustomer)'), 0)

Mobile.delay(1)

'Tap on selected customer'
Mobile.tap(findTestObject('Transactions/Refunds/New Refund/android.view.View (4)'), 0)

Mobile.delay(1)

'Tap on Cash'
Mobile.tap(findTestObject('Transactions/Refunds/New Refund/android.view.View (5)'), 0)

Mobile.delay(1)

'Tap on confirm payment'
Mobile.tap(findTestObject('Transactions/Refunds/Confirm button/android.widget.Button(ConfirmRefund)'), 0)

Mobile.delay(2)

'Tap on Close'
Mobile.tap(findTestObject('Transactions/Refunds/missing/android.widget.Button(closeButton)'), 0)

Mobile.delay(3)

Mobile.closeApplication()

