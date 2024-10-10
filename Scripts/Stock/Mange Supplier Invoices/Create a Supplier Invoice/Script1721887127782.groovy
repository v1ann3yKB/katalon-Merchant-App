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

'Tap on Manage Suppliers Invoices'
Mobile.tap(findTestObject('Stock/StockPageOBJ/android.view.View(ManageSuppliersInvoices)'), 0)

Mobile.delay(3)

'Tap on New Invoice'
Mobile.tap(findTestObject('Stock/SupplierOBJ/SupplierInvoice/android.view.View(NewSupplierInvoiceBTN)'), 0)

Mobile.delay(3)

'Tap on Supplier'
Mobile.tap(findTestObject('Stock/SupplierOBJ/SupplierInvoice/android.widget.Button(Supplier)'), 0)

Mobile.delay(3)

'Select a supplier from the drop down list'
Mobile.tap(findTestObject('Stock/SupplierOBJ/SupplierInvoice/android.view.View(BulkFishingSupplier)'), 0)

Mobile.delay(3)

'Tap on Invoice Reference'
Mobile.tap(findTestObject('Stock/SupplierOBJ/SupplierInvoice/android.widget.EditText(InvoiceReference)'), 0)

Mobile.delay(3)

'Set Invoice Reference'
Mobile.setText(findTestObject('Stock/SupplierOBJ/SupplierInvoice/android.widget.EditText(InvoiceReference)'), 'INV123456789', 
    0)

Mobile.delay(3)

'Tap on Invoice Date Picker'
Mobile.tap(findTestObject('Stock/SupplierOBJ/SupplierInvoice/android.view.View(DatePickerInvoice)'), 0)

Mobile.delay(3)

'Select a Date'
Mobile.tap(findTestObject('Stock/SupplierOBJ/SupplierInvoice/android.widget.Button(DatePicked31072024)'), 0)

Mobile.delay(3)

'Tap on OK'
Mobile.tap(findTestObject('Stock/SupplierOBJ/SupplierInvoice/android.widget.Button(DatePickerOKBTN)'), 0)

Mobile.delay(3)

'Tap on Invoice Due Date'
Mobile.tap(findTestObject('Stock/SupplierOBJ/SupplierInvoice/android.view.View(InvoiceDueDatePicker)'), 0)

Mobile.delay(3)

'Select a Date'
Mobile.tap(findTestObject('Stock/SupplierOBJ/SupplierInvoice/android.widget.Button(DatePicker30082024)'), 0)

Mobile.delay(3)

'Tap on OK'
Mobile.tap(findTestObject('Stock/SupplierOBJ/SupplierInvoice/android.widget.Button(DatePickerOKBTN)'), 0)

Mobile.delay(3)

//'Tap on Amount'
//Mobile.tap(findTestObject('Stock/SupplierOBJ/NewInvoiceAmount/android.widget.EditText - 0.0'), 2)
//Mobile.doubleTap(findTestObject('Stock/SupplierOBJ/SupplierInvoice/New Folder/android.widget.EditTex(Amount)'), 0)
//Mobile.setText(findTestObject('Stock/SupplierOBJ/NewInvoiceAmount/android.widget.EditText (2)'), '300',
//	0)
//
//Mobile.delay(3)
//Mobile.clearText(findTestObject('Stock/SupplierOBJ/NewInvoiceAmount/android.widget.EditText - 0.0'), 0)
//
//Mobile.delay(1)
//Mobile.setText(findTestObject('Stock/SupplierOBJ/SupplierInvoice/New Folder/android.widget.EditTex(Amount)'), '200', 0)
'Set Invoice Amount'
Mobile.setText(findTestObject('Stock/SupplierOBJ/android.widget.EditText AmountOfInvoice'), '300', 0)

Mobile.delay(4)

'Tap on Tax Amount'
Mobile.tap(findTestObject('Stock/SupplierOBJ/SupplierInvoice/New Folder/android.widget.EditText(TaxAmount)'), 0)

Mobile.delay(3)

'Set Invoice Tax Amount'
Mobile.setText(findTestObject('Stock/SupplierOBJ/SupplierInvoice/New Folder/android.widget.EditText(TaxAmount)'), '30', 
    0)

Mobile.delay(4)

Mobile.hideKeyboard()

Mobile.delay(1)

'Tap on Save '
Mobile.tap(findTestObject('Stock/SupplierOBJ/SupplierInvoice/android.widget.Button(SupplierSaveBTN)'), 0)

Mobile.delay(10)

Mobile.closeApplication()

