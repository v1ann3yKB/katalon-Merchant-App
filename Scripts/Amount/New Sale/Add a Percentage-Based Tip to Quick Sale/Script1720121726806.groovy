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

//Mobile.startApplication('/Users/vb/Desktop/WorkFolder/QA Testing/Project Testing/Mobile/android/APKs/dev-release 1.1.0/littlefish-dev-1.1.0.apk', 
//    true)
//
//'Log In'
//Mobile.tap(findTestObject('Sell Now/Add Quick Item/android.widget.Button'), 0)
//
//'Email'
//Mobile.setText(findTestObject('Sell Now/Add Quick Item/android.widget.EditText - Username (Email Address)'), 
//    'demo@littlefishapp.com', 0)
//
//Mobile.delay(5)
//
//'Password'
//Mobile.setText(findTestObject('Sell Now/Add Quick Item/android.widget.EditText - Password'), 'Password123!', 
//    0)
//
//Mobile.delay(5)
//
//'Login'
//Mobile.tap(findTestObject('Sell Now/Add Quick Item/android.widget.Button (1)'), 0)
//
//'10s Delay'
//Mobile.delay(5)
//
//'Add Quick Item Button Tap'
//Mobile.tap(findTestObject('Sell Now/Add Quick Item/android.widget.ImageView(QuickItem)'), 0)
//
//'10s Delay'
//Mobile.delay(10)
//
//'Tap On Button 2'
//Mobile.tap(findTestObject('Sell Now/Add Quick Item/android.view.View(button2)'), 0)
//
//'10s Delay'
//Mobile.delay(2)
//
//'Tap On Button 6'
//Mobile.tap(findTestObject('Sell Now/Add Quick Item/android.view.View(button6)'), 0)
//
//'10s Delay'
//Mobile.delay(2)
//
//'Tap On Button 0'
//Mobile.tap(findTestObject('Sell Now/Add Quick Item/android.view.View(button0)'), 0)
//
//'10s Delay'
//Mobile.delay(2)
//
//'Tap On Button 0'
//Mobile.tap(findTestObject('Sell Now/Add Quick Item/android.view.View(button0)'), 0)
//
//'10s Delay'
//Mobile.delay(2)
//
//'Setting description '
//Mobile.setText(findTestObject('Sell Now/Add Quick Item/android.widget.EditText - Description'), 'Food', 
//    0)
//
//'10s Delay'
//Mobile.delay(5)
//
//'back to close the keyboard'
//Mobile.pressBack()
//
//'Tap On Add'
//Mobile.tap(findTestObject('Sell Now/Add Quick Item/android.widget.Button(add)'), 0)
//
//Mobile.delay(10)
//
//'Tap On continue payment'
//Mobile.tap(findTestObject('Amount/OBJamount/android.widget.Button(CPayement)'), 0)

Mobile.delay(2)

'Tap On Add tip'
Mobile.tap(findTestObject('Amount/OBJamount/android.widget.Button(AddTip)'), 0)

Mobile.delay(3)

'Tap On Add percentage 10'
Mobile.tap(findTestObject('Amount/OBJamount/android.view.View(10Percent)'), 0)

Mobile.delay(3)

'Tap On Add tip 10'
Mobile.tap(findTestObject('Amount/OBJamount/android.widget.Button(AddTip) (1)'), 0)

Mobile.delay(3)

//'Tap On customer'
//Mobile.tap(findTestObject('Amount/OBJamount/android.widget.Button(AddCustomer)'), 0)
//
//Mobile.delay(5)
//
//'Tap On customer name'
//Mobile.tap(findTestObject('Amount/OBJamount/android.view.View(Shiara)'), 0)
//
//Mobile.delay(5)
//
//'Tap On Cash Payment'
//Mobile.tap(findTestObject('Amount/OBJamount/android.view.View(CashPay)'), 0)
//
//Mobile.delay(5)
//
//'Tap On continue Payment'
//Mobile.tap(findTestObject('Amount/OBJamount/android.widget.Button(cPcSale)'), 0)
//
//'10s Delay'
//Mobile.delay(10)
//
//'Tap On Button 2'
//Mobile.tap(findTestObject('Sell Now/Add Quick Item/android.view.View(button2)'), 0)
//
//'10s Delay'
//Mobile.delay(2)
//
//'Tap On Button 8'
//Mobile.tap(findTestObject('Amount/OBJamount/android.view.View(button8)'), 0)
//
//'10s Delay'
//Mobile.delay(2)
//
//'Tap On Button 6'
//Mobile.tap(findTestObject('Sell Now/Add Quick Item/android.view.View(button6)'), 0)
//
//'10s Delay'
//Mobile.delay(2)
//
//'Tap On Button 0'
//Mobile.tap(findTestObject('Sell Now/Add Quick Item/android.view.View(button0)'), 0)
//
//Mobile.delay(5)
//
//'Tap On continue Payment'
//Mobile.tap(findTestObject('Amount/OBJamount/android.widget.Button(ConfirmP)'), 0)
//
//Mobile.delay(20)
//
//Mobile.closeApplication()
