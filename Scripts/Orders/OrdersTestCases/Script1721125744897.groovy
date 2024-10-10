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

Mobile.startApplication('/Users/vb/Desktop/WorkFolder/littlefish_pos_ui/build/app/outputs/flutter-apk/app-lflfposdev-debug.apk', 
    true)

'Tap on Login button from first page'
Mobile.tap(findTestObject('Orders Obj/android.widget.Button'), 0)

Mobile.delay(7)

'Setting email address second time'
//Mobile.setText(findTestObject('Orders Obj/android.widget.EditText'), 'demo@littlfishapp.com', 0)

Mobile.setText(findTestObject('test/android.widget.EditText (3)'), 'demo@littlefishapp.com', 0)

Mobile.delay(5)

'Setting password'
Mobile.setText(findTestObject('newObj/android.widget.EditText(password)'), 'Password123!', 0)

Mobile.delay(5)

'Tap on Login from the sign up page'
Mobile.tap(findTestObject('Orders Obj/android.widget.Button(LoginBtn)'), 0)

Mobile.delay(5)

'Tap on Orders'
Mobile.tap(findTestObject('Orders Obj/android.view.View(Ordersbtn)'), 0)

Mobile.delay(3)

'Tap on Cancelled Orders'
Mobile.tap(findTestObject('Orders Obj/android.view.View(CancelledOrders)'), 0)

Mobile.delay(3)

'Back button from inbuilt key word'
Mobile.pressBack()

Mobile.delay(3)

'Tap on clomplete Orders'
Mobile.delay(3)

Mobile.tap(findTestObject('Orders Obj/android.view.View(Complete Orders)'), 0)

'Tap on first product '
Mobile.tap(findTestObject('Orders Obj/android.view.View(fabProd1)'), 0)

Mobile.delay(3)

'Press Back button from integrated button'
Mobile.pressBack()

Mobile.delay(3)

'Tap on back arrow'
Mobile.tap(findTestObject('Orders Obj/android.widget.Button (1)'), 0)

Mobile.delay(3)

'Tap on Confirmed Orders'
Mobile.tap(findTestObject('Orders Obj/android.view.View(ConfirmedOrders)'), 0)

Mobile.delay(3)

'Tap on first confirmed order product'
Mobile.tap(findTestObject('Orders Obj/android.view.View(FirstConfOrdProduct)'), 0)

Mobile.delay(3)

'press on integrated back button'
Mobile.pressBack()

Mobile.delay(3)

'Press on back button from confirmed orders'
Mobile.tap(findTestObject('Orders Obj/android.widget.Button (1)'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Orders Obj/android.view.View'), 0)

Mobile.delay(7)

Mobile.closeApplication()

