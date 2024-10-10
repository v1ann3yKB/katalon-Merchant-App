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

//Mobile.startApplication('/Users/vb/Desktop/WorkFolder/littlefish_pos_ui/build/app/outputs/apk/lfLfposDev/debug/app-lf-lfpos-dev-debug.apk', 
//    true)
//
//Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)
//
//Mobile.tap(findTestObject('Orders/testing login/android.widget.Button'), 0)
//
//Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)
//
//Mobile.tap(findTestObject('Orders/testing login/android.widget.Button'), 0)
//
//Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)
//
//Mobile.setText(findTestObject('Orders/testing login/android.widget.EditText(E)'), 'demo@littlefishapp.com', 
//    0)
//
//Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)
//
//Mobile.tap(findTestObject('Orders/testing login/android.widget.EditText(P)'), 0)
//
//Mobile.setText(findTestObject('Orders/testing login/android.widget.EditText(P)'), 'Password123!', 0)
//
//Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)
//
//Mobile.tap(findTestObject('Orders/testing login/android.widget.Button(lgn)'), 0)
//
//Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)
//
//Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)
//
//Mobile.tap(findTestObject('Orders/testing login/android.widget.Button'), 0)
//
//Mobile.setText(findTestObject('Orders/testing login/android.widget.EditText'), 'demo@littlefishapp.com',
//	0)
//
//Mobile.setText(findTestObject('Orders/testing login/android.widget.EditText(E)'), 'demo@littlefishapp.com',
//	0)
//
//Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)
//
//Mobile.tap(findTestObject('Orders/testing login/android.widget.EditText(P)'), 0)
//
//Mobile.setText(findTestObject('Orders/testing login/android.widget.EditText(P)'), 'Password123!', 0)
//
//Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)
//
//Mobile.tap(findTestObject('Orders/testing login/android.widget.Button(lgn)'), 0)
//
//Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)
//
//Mobile.tap(findTestObject('Orders/testing login/android.widget.Button(lgn)'), 0)
//
//Mobile.delay(7, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.startApplication('/Users/vb/Desktop/WorkFolder/littlefish_pos_ui/build/app/outputs/apk/lfLfposDev/debug/app-lf-lfpos-dev-debug.apk',
	true)

Mobile.delay(2)

'Tap on the login button from first screen '
Mobile.tap(findTestObject('Stock/android.widget.Button'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Stock/android.widget.EditText (1)'), 0)

Mobile.setText(findTestObject('Stock/android.widget.EditText (2)'), 'demo@littlefishapp.com', 0)

Mobile.delay(2)

Mobile.setText(findTestObject('Stock/android.widget.EditText(Password)'), 'Password123!', 0)

Mobile.delay(3)

'Tap on login'
Mobile.tap(findTestObject('Stock/android.widget.Button(Login)'), 0)

Mobile.delay(15)

'Tap on sales button'
Mobile.tap(findTestObject('Transactions/Voids and Withdrawal/android.view.View(salesBTN)'), 0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

'Tap on withdrawals tab'
Mobile.tap(findTestObject('Transactions/Voids and Withdrawal/android.view.View(withdrawalsTAB)'), 0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

'Open item in withdrawals list item'
Mobile.tap(findTestObject('Transactions/Voids and Withdrawal/android.view.View(withdrawalItem1)'), 0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.pressBack()

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

