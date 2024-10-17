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

//Mobile.tap(findTestObject('Manage Settings/android.view.View(Manage_Products)'), 0)
//'Tap on Products'
//Mobile.tap(findTestObject('Products/Products Fix/android.view.View(MW-ProductsTab-Products)'), 0)

Mobile.delay(5)

'Tap on search Box'
Mobile.tap(findTestObject('Products/Products Main Page/Products/android.widget.EditText(ProductSearchBox)'), 0)

Mobile.delay(3)

'Set text'
Mobile.setText(findTestObject('Products/Products Main Page/Products/android.widget.EditText(ProductSearchBox)'), 'New Products', 
    0)

Mobile.delay(5)

'Tap on First Products'
Mobile.tap(findTestObject('Products/Products Main Page/Products/android.view.View(ProductFirstItem)'), 0)

Mobile.delay(5)

'Tap on add image'
Mobile.tap(findTestObject('Products/Products Main Page/Products/android.view.View(ProductAddImage)'), 0)

Mobile.delay(5)

'Tap on Gallery'
Mobile.tap(findTestObject('Products/Category/android.view.View(Gallery)'), 0)

Mobile.delay(5)

'Tap on product picture'
Mobile.tap(findTestObject('Products/Category/android.widget.ImageView(ImageInAlbum)'), 0)

Mobile.delay(5)

//'Tap on Product Name'
//Mobile.tap(findTestObject('Products/Products Main Page/Products/android.widget.EditText(ProductNameField)'), 0)
//
//Mobile.delay(2)
'Clear Product Name'
Mobile.clearText(findTestObject('Products/Products Main Page/Products/android.widget.EditText(ProductNameField)'), 0)

Mobile.delay(5)

'Set New Name'
Mobile.setText(findTestObject('Products/Products Main Page/Products/android.widget.EditText(ProductNameField)'), 'Product 1', 
    0)

Mobile.hideKeyboard()

Mobile.delay(5)

'Set Description'
Mobile.setText(findTestObject('Products/Products Main Page/Products/android.widget.EditText(ProductDescriptionField)'), 
    'This is Product 1', 0)

Mobile.hideKeyboard()

//Mobile.delay(2)
//
//Mobile.scrollToText('Online Settings')
Mobile.delay(5)

'Tap online product'
Mobile.tap(findTestObject('Products/Products Main Page/Products/android.widget.Switch(ProductOnlineToggle)'), 0)

//Mobile.delay(3)
//
//'Tap Track product'
//Mobile.tap(findTestObject('Products/Products Main Page/Products/android.widget.Switch(ProductTrackToggle)'), 0)
//
//Mobile.delay(3)
//
//'Tap Track product'
//Mobile.tap(findTestObject('Products/Products Main Page/Products/android.widget.Switch(ProductTrackToggle)'), 0)

Mobile.delay(5)

'Tap selling price'
Mobile.tap(findTestObject('Products/Products Fix/android.view.View(Product_Selling_Price_field)'), 0)

Mobile.delay(3)

'Tap 2'
Mobile.tap(findTestObject('Products/Products Fix/android.view.View(Key_2_BTN)'), 0)

Mobile.delay(1)

'Tap 0'
Mobile.tap(findTestObject('Products/Products Fix/android.view.View(Key_0_BTN)'), 0)

Mobile.delay(1)

'Tap 0'
Mobile.tap(findTestObject('Products/Products Fix/android.view.View(Key_0_BTN)'), 0)

Mobile.delay(1)

'Tap 0'
Mobile.tap(findTestObject('Products/Products Fix/android.view.View(Key_0_BTN)'), 0)

Mobile.delay(2)

'Tap Change Amount'
Mobile.tap(findTestObject('Products/Products Fix/android.widget.Button(Change_amount_BTN)'), 0)

//Mobile.hideKeyboard()
Mobile.delay(5)

//Mobile.setText(findTestObject('Products/Products Main Page/Products/android.view.View(ProductCostField)'), '100', 0)
'Tap cost price'
Mobile.tap(findTestObject('Products/Products Fix/android.view.View(Product_Cost_Price_field)'), 0)

Mobile.delay(1)

'Tap 1'
Mobile.tap(findTestObject('Products/Products Fix/android.view.View(Key_1_BTN)'), 0)

Mobile.delay(1)

'Tap 0'
Mobile.tap(findTestObject('Products/Products Fix/android.view.View(Key_0_BTN)'), 0)

Mobile.delay(1)

'Tap 0'
Mobile.tap(findTestObject('Products/Products Fix/android.view.View(Key_0_BTN)'), 0)

Mobile.delay(1)

'Tap 0'
Mobile.tap(findTestObject('Products/Products Fix/android.view.View(Key_0_BTN)'), 0)

Mobile.delay(2)

'Tap Change Amount'
Mobile.tap(findTestObject('Products/Products Fix/android.widget.Button(Change_amount_BTN)'), 0)

//Mobile.delay(2)
//
//Mobile.scrollToText('Details')
//Mobile.hideKeyboard()
Mobile.delay(4)

'Tap on stock count'
Mobile.tap(findTestObject('Products/Products Fix/android.view.View(Stock_count_Field)'), 0)

Mobile.delay(3)

'Tap on + BTN'
Mobile.tap(findTestObject('Products/Products Fix/android.widget.Button(Stock_BTN_Plus)'), 0)

'Tap on + BTN'
Mobile.tap(findTestObject('Products/Products Fix/android.widget.Button(Stock_BTN_Plus)'), 0)

//'set value'
//Mobile.setText(findTestObject('Products/Products Fix/android.widget.EditText(Stock_BTN_Open_Field)'), '10', 0)
Mobile.delay(3)

'Tap on Reason'
Mobile.tap(findTestObject('Products/Products Fix/android.widget.Button(Stock_BTN_Reason)'), 0)

Mobile.delay(3)

'Tap on adjustment'
Mobile.tap(findTestObject('Products/Products Fix/android.view.View(Stock_BTN_Adjustement)'), 0)

Mobile.delay(3)

'Tap on Confirm'
Mobile.tap(findTestObject('Products/Products Fix/android.widget.Button(Stock_BTN_Confirm)'), 0)

//Mobile.hideKeyboard()
Mobile.delay(5)

'Tap Save Product'
Mobile.tap(findTestObject('Products/Products Main Page/Products/android.widget.Button(CreateProductBTN)'), 0)

Mobile.delay(5)
//
//Mobile.closeApplication()

