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
//Mobile.delay(2)
//
//'Tap on the login button from first screen '
//Mobile.tap(findTestObject('Stock/android.widget.Button'), 0)
//
//Mobile.delay(3)
//
//Mobile.tap(findTestObject('Stock/android.widget.EditText (1)'), 0)
//
//Mobile.setText(findTestObject('Products/New fix/android.widget.EditText'), 'demo@littlefishapp.com', 0)
//
//Mobile.delay(3)
//
//Mobile.tap(findTestObject('Stock/android.widget.EditText(Password)'), 0)
//
//Mobile.setText(findTestObject('Stock/android.widget.EditText(Password)'), 'Password123!', 0)
//
//Mobile.delay(3)
//
//'Tap on login'
//Mobile.tap(findTestObject('Stock/android.widget.Button(Login)'), 0)
//
//Mobile.delay(15)
//
//'Tap on profile switching icon'
//Mobile.tap(findTestObject('Products/New fix/android.widget.ImageView(PFLsw)'), 0)
//
//Mobile.delay(5)
//
//'Tap on manage workSpace'
//Mobile.tap(findTestObject('Stock/StockPageOBJ/android.view.View(ManageWorkSpace)'), 0)
//
//Mobile.delay(5)
//
//'Tap on Products'
//Mobile.tap(findTestObject('Manage Settings/android.view.View(Manage_Products)'), 0)

Mobile.delay(5)

'Tap on First Products'
Mobile.tap(findTestObject('Products/Products Main Page/Products/android.view.View(ProductFirstItem)'), 0)

Mobile.delay(5)
//
//Mobile.closeApplication()

