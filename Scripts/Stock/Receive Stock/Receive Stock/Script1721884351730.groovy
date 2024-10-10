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

Mobile.startApplication('/Users/vb/Desktop/WorkFolder/littlefish_pos_ui/build/app/outputs/apk/lfLfposDev/debug/app-lf-lfpos-dev-debug.apk',
	true)

Mobile.delay(2)

'Tap on the login button from first screen '
Mobile.tap(findTestObject('Stock/android.widget.Button'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Stock/android.widget.EditText (1)'), 0)

Mobile.setText(findTestObject('Stock/android.widget.EditText (2)'), 'demo@littlefishapp.com', 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Stock/android.widget.EditText(Password)'), 0)

Mobile.setText(findTestObject('Stock/android.widget.EditText(Password)'), 'Password123!', 0)

Mobile.delay(3)

'Tap on login'
Mobile.tap(findTestObject('Stock/android.widget.Button(Login)'), 0)

Mobile.delay(15)

'Tap on profile switching icon'
Mobile.tap(findTestObject('Stock/StockPageOBJ/android.widget.ImageView(ProfileIcon)'), 0)

Mobile.delay(5)

'Tap on manage workSpace'
Mobile.tap(findTestObject('Stock/StockPageOBJ/android.view.View(ManageWorkSpace)'), 0)

Mobile.delay(7)

'Tap on Stock'
Mobile.tap(findTestObject('Stock/StockPageOBJ/android.view.View(StockBTN)'), 0)

Mobile.delay(3)

'Tap on received Stock'
Mobile.tap(findTestObject('Stock/StockPageOBJ/android.view.View(ReceivedStock)'), 0)

Mobile.delay(5)

'Tap Select Invoice'
Mobile.tap(findTestObject('Stock/ReceivedStock/android.view.View(SelectInvoice)'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

'Tap on invoice item'
Mobile.tap(findTestObject('Stock/ReceivedStock/android.view.View(FirstInvoice)'), 0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Stock/ReceivedStock/android.widget.EditText(DeliveredBy)'), 'vianney', 0)

Mobile.delay(5)

'Tap on items buttons'
Mobile.tap(findTestObject('Stock/ReceivedStock/android.widget.Button(Items)'), 0)

Mobile.delay(3)

'Tap on add item'
Mobile.tap(findTestObject('Stock/ReceivedStock/android.view.View(AddItem)'), 0)

Mobile.delay(4)

'Tap on leader item'
Mobile.tap(findTestObject('Stock/ReceivedStock/android.view.View(LeaderItem)'), 0)

Mobile.delay(3)

'Tap on leader down arrow'
Mobile.tap(findTestObject('Stock/ReceivedStock/android.view.View(Dropdown)'), 0)

Mobile.delay(3)

'Tap on leader Up arrow'
Mobile.tap(findTestObject('Stock/ItemLeaderArrows/android.view.View(ItemUpArrow)'), 0)

Mobile.delay(3)

'Tap on casin type drop down'
Mobile.tap(findTestObject('Stock/ReceivedStock/android.widget.Button(cassingType)'), 0)

Mobile.delay(3)

'Select casing type'
Mobile.tap(findTestObject('Stock/ReceivedStock/android.view.View(halfDozen)'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Stock/ReceivedStock/android.widget.EditText - 1.0(packQTY)'), 0)
Mobile.clearText(findTestObject('Stock/ReceivedStock/android.widget.EditText - 1.0(packQTY)'), 0)

Mobile.delay(2)

Mobile.setText(findTestObject('Stock/ReceivedStock/android.widget.EditText - 1.0(packQTY)'), '2', 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Stock/ReceivedStock/android.widget.EditText - 0.0(Cost)'), 0)
Mobile.clearText(findTestObject('Stock/ReceivedStock/android.widget.EditText - 0.0(Cost)'), 0)

Mobile.delay(2)

Mobile.setText(findTestObject('Stock/ReceivedStock/android.widget.EditText - 0.0(Cost)'), '50', 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Stock/ReceivedStock/android.widget.Button(Accept)'), 0)

Mobile.delay(10)

Mobile.closeApplication()