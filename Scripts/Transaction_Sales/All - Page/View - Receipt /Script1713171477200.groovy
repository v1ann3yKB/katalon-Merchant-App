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

'View - receipt Start'
Mobile.delay(1)

'Open Sales Page'
Mobile.tap(findTestObject('Transactions/All Page view receipt/android.view.View'), 0)

Mobile.delay(3)

'open first product'
Mobile.tap(findTestObject('Transactions/All Page view receipt/android.view.View (1)'), 0)

Mobile.delay(3)

'open view receipt'
Mobile.tap(findTestObject('Transactions/All Page view receipt/android.widget.Button (2)'), 0)

'delay on Print '
Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Open Print receipt '
Mobile.tap(findTestObject('Transactions/All Page view receipt/Missing print button/android.widget.Button(Print)'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Transactions/All Page view receipt/Missing print button/android.widget.Button(Ok)'), 0)

'delay on Print '
Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Open Sms'
Mobile.tap(findTestObject('Transactions/All Page view receipt/android.widget.Button (3)'), 0)

Mobile.delay(3)

'Tap on send sms'
Mobile.tap(findTestObject('Transactions/All Page view receipt/android.widget.Button (4)'), 0)

Mobile.delay(3)

'Tap on close notification'
Mobile.tap(findTestObject('Transactions/All Page view receipt/android.view.View (2)'), 0)

'delay on Print '
Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Open email receipt '
Mobile.tap(findTestObject('Transactions/All Page view receipt/android.widget.Button (5)'), 0)

Mobile.delay(3)

'Tap on send email'
Mobile.tap(findTestObject('Transactions/All Page view receipt/android.widget.Button (4)'), 0)

Mobile.delay(3)

'tap on email notification to close'
Mobile.tap(findTestObject('Transactions/All Page view receipt/Missing tap to close on view receipt/android.view.View(tap to close)'), 
    0)

'delay on Print '
Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap On back button'
Mobile.tap(findTestObject('Transactions/All Page view receipt/android.widget.Button (6)'), 0)

'delay on Print '
Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap on back button'
Mobile.tap(findTestObject('Transactions/All Page view receipt/android.widget.Button (6)'), 0)

Mobile.delay(1)

