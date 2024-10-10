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

'Tap on Manage Stock'
Mobile.tap(findTestObject('Stock/StockPageOBJ/Manage/android.view.View(ManageStockSection)'), 0)

Mobile.delay(3)

'Tap on Add product'
Mobile.tap(findTestObject('Stock/StockPageOBJ/Manage/android.widget.Button(AddStockProductBTN)'), 0)

Mobile.delay(2)

'Tap On add Image'
Mobile.tap(findTestObject('Stock/AddProduct/android.view.View(AddPictureProduct)'), 0)

Mobile.delay(2)

'Select Gallery option'
Mobile.tap(findTestObject('Stock/AddProduct/android.view.View(Gallery OPtion)'), 0)

Mobile.delay(2)

'Select Gallery option'
Mobile.tap(findTestObject('Stock/AddProduct/android.widget.ImageView(Picture)'), 0)

Mobile.delay(5)

'Select Gallery option'
Mobile.tap(findTestObject('Stock/AddProduct/android.widget.EditText(ProductName)'), 0)

Mobile.delay(2)

'Set Text for Product Name'
Mobile.setText(findTestObject('Stock/AddProduct/android.widget.EditText(ProductName)'), 'CodeQA', 0)

Mobile.delay(3)

'Tap on Category'
Mobile.tap(findTestObject('Stock/AddProduct/android.widget.Button(Category)'), 0)

Mobile.delay(3)

'Select Category'
Mobile.tap(findTestObject('Stock/AddProduct/android.view.View(BottlesCategory)'), 0)

Mobile.delay(3)

'Tap on Creat Product'
Mobile.tap(findTestObject('Stock/AddProduct/android.view.View(BottlesCategory)'), 0)

Mobile.delay(10)

Mobile.closeApplication()

