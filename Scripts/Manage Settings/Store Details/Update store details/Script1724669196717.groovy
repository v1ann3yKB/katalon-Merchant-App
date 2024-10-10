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
Mobile.tap(findTestObject('Products/New fix/android.widget.ImageView(PFLsw)'), 0)

Mobile.delay(5)

'Tap on manage workSpace'
Mobile.tap(findTestObject('Stock/StockPageOBJ/android.view.View(ManageWorkSpace)'), 0)

Mobile.delay(5)

'Tap on Manage Settings'
Mobile.tap(findTestObject('Manage Settings/android.view.View(ManageTab)'), 0)

Mobile.delay(5)

'Tap on Store Settings'
Mobile.tap(findTestObject('Manage Settings/android.view.View - StoreSettings'), 0)

Mobile.delay(5)

'Tap on Store Details'
Mobile.tap(findTestObject('Manage Settings/StoreSettings/android.view.View - SS - StoreDetails'), 0)

Mobile.delay(5)

'Set Business Name'
Mobile.setText(findTestObject('Manage Settings/StoreSettings/android.widget.EditText - SS - SD - BusinessName'), 'Fabulous Fishings', 
    0)

Mobile.delay(5)

'Set Description'
Mobile.setText(findTestObject('Manage Settings/StoreSettings/android.widget.EditText - SS - SD - Description'), 'For All Your Fishing Needs and more', 
    0)

Mobile.delay(5)

'Set IG Handle'
Mobile.setText(findTestObject('Manage Settings/StoreSettings/android.widget.EditText - SS - SD - IGHandle'), '@FabulousFishings', 
    0)

Mobile.delay(5)

'Set Whatsapp Line'
Mobile.setText(findTestObject('Manage Settings/StoreSettings/android.widget.EditText - SS - SD - WhatsappLine'), '0726104742', 
    0)

Mobile.delay(5)

'Set Phone Number'
Mobile.setText(findTestObject('Manage Settings/StoreSettings/android.widget.EditText - SS - SD - BusinessName'), '0726104742', 
    0)

Mobile.delay(5)

'Set Website'
Mobile.setText(findTestObject('Manage Settings/StoreSettings/android.widget.EditText - SS - SD - Website(Notfound)'), 'www.FabulousFishing.com', 
    0)

Mobile.delay(5)

'Tap on Save Store Details'
Mobile.tap(findTestObject('Manage Settings/StoreSettings/android.widget.Button - SS - SD - SaveBTN(NotFound)'), 0)

Mobile.delay(5)

