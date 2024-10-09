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

Mobile.tap(findTestObject('Transactions/Sales Journey/android.widget.Button'), 0)

Mobile.setText(findTestObject('Transactions/Sales Journey/android.widget.EditText - Username (Email Address)'), 
    'demo@littlefishapp.com', 0)

Mobile.setText(findTestObject('Transactions/Sales Journey/android.widget.EditText - Password'), 'Password123!', 
    0)

Mobile.tap(findTestObject('Transactions/Sales Journey/android.widget.Button (1)'), 0)

Mobile.delay(7)

'tap on sales page'
Mobile.tap(findTestObject('Transactions/Sales Journey/android.view.View'), 0)

'Tap on Completed Transaction'
Mobile.tap(findTestObject('Transactions/Sales Journey/android.view.View (1)'), 0)

'Tap on Refunded'
Mobile.tap(findTestObject('Transactions/Sales Journey/android.view.View (2)'), 0)

'Tap on voided transaction'
Mobile.tap(findTestObject('Transactions/Sales Journey/android.view.View (3)'), 0)

Mobile.delay(2)

'Tap on Withdrawal transaction (not executing)'
Mobile.tap(findTestObject('Transactions/Sales Journey/Withdrawal Page button/android.view.View(withdrawal)'), 0)

Mobile.delay(3)

'completed transactions'
Mobile.tap(findTestObject('Transactions/Sales Journey/android.view.View (4)'), 0)

'All transactions '
Mobile.tap(findTestObject('Transactions/Sales Journey/Withdrawal Page button/android.view.View(All)'), 0)

Mobile.delay(3)

'Tap on Load more sales (not working)'
Mobile.tap(findTestObject('Transactions/Sales Journey/android.widget.Button (2)'), 0)

Mobile.delay(3)

'search for item with 20 in it'
Mobile.setText(findTestObject('Transactions/Sales Journey/android.widget.EditText - Search by Transaction Number'), 
    '20', 0)

Mobile.delay(2)

'Hide keyboard '
Mobile.hideKeyboard()

Mobile.delay(2)

'Load more with 20 in the search'
Mobile.tap(findTestObject('Transactions/Sales Journey/android.widget.Button (2)'), 0)

'Tap on clear search items '
Mobile.tap(findTestObject('Transactions/Sales Journey/android.view.View (5)'), 0)

Mobile.delay(2)

'Tap on refresh button'
Mobile.tap(findTestObject('Transactions/Sales Journey/android.widget.Button (3)'), 0)

Mobile.delay(5)

Mobile.closeApplication()

