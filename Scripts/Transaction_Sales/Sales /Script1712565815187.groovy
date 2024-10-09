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


Mobile.delay(3)

'Tap On sales(Transactions) on the buttom Navigation'
Mobile.tap(findTestObject('Transactions/android.view.View'), 0)

Mobile.delay(3)

'Tap On Completed Transactions'
Mobile.tap(findTestObject('Transactions/android.view.View (1)'), 0)

Mobile.delay(3)

'Tap On Refunded Transaction '
Mobile.tap(findTestObject('Transactions/android.view.View (2)'), 0)

Mobile.delay(3)

'Tap on Voided Transactions'
Mobile.tap(findTestObject('Transactions/android.view.View (3)'), 0)

Mobile.delay(3)

'Tap on Withdrawals'
Mobile.tap(findTestObject('Transactions/android.view.View (3)'), 0)

Mobile.delay(3)

'Searching for 20'
Mobile.setText(findTestObject('Transactions/android.widget.EditText - Search by Transaction Number'), 
    '20', 0)

Mobile.delay(3)

'Tap On Back arrow'
Mobile.tap(findTestObject('Transactions/android.widget.Button (2)'), 0)

Mobile.delay(3)

'Sales page open'
Mobile.tap(findTestObject('Transactions/android.view.View'), 0)

Mobile.delay(3)

'Opening a transaction for more details'
Mobile.tap(findTestObject('Transactions/android.view.View (4)'), 0)

Mobile.delay(3)

'Viewing Receipt '
Mobile.tap(findTestObject('Transactions/android.widget.Button (3)'), 0)

Mobile.delay(3)

'Tap on Sms'
Mobile.tap(findTestObject('Transactions/android.widget.Button (4)'), 0)

Mobile.delay(3)

'Setting name'
Mobile.setText(findTestObject('Transactions/android.widget.EditText - Name'), 'vianney', 0)

Mobile.delay(3)

'Setting Phone number'
Mobile.setText(findTestObject('Transactions/android.widget.EditText - Mobile Number'), '0726104742', 0)

Mobile.delay(3)

'Send button Tap'
Mobile.tap(findTestObject('Transactions/android.widget.Button (5)'), 0)

Mobile.delay(3)

'Closing popup info box'
Mobile.tap(findTestObject('Transactions/android.view.View (5)'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Transactions/android.widget.Button (2)'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Transactions/android.widget.Button (2)'), 0)

Mobile.delay(3)

