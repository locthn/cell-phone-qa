import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page_home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'Step 2: At Page home, click on hyperlink hot new > navigate to Page product/*'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_hot_new'))

'Step 3: At Page product/*, click on label object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_object'))

'Step 4: At Page product/*, click on label object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_object_1'))

'Step 5: At Page product/*, click on button buy'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy'))

'Step 6: At Page product/*, click on hyperlink place an order > navigate to Page cart'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/hyperlink_place_an_order'))

'Step 7: At Page cart, click on button proceed to checkout > navigate to Page checkout/info'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceed_to_checkout'))

'Step 8: At Page checkout/info, hover on div object'

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_info/div_object'))

'Step 9: At Page checkout/info, click on input email'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))

'Step 10: At Page checkout/info, input on input email'

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), var_1_input_email)

'Step 11: At Page checkout/info, click on main object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/main_object'))

'Step 12: At Page checkout/info, click on button continue to shipping'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continue_to_shipping'))

'Step 13: At Page checkout/info, input on input email'

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), var_2_input_email)

'Step 14: At Page checkout/info, click on button continue to shipping > navigate to Page checkout/shipping-address'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continue_to_shipping'))

'Step 15: At Page checkout/shipping-address, hover on div object'

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping-address/div_object'))

'Step 16: At Page checkout/shipping-address, click on input shipping address first name'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping-address/input_shipping_address_first_name'))

'Step 17: At Page checkout/shipping-address, hover on div object'

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping-address/div_object_1'))

'Step 18: At Page checkout/shipping-address, input on input shipping address first name'

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping-address/input_shipping_address_first_name'), var_3_input_shipping_address_first_name)

'Step 19: At Page checkout/shipping-address, click on input shipping address last name'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping-address/input_shipping_address_last_name'))

'Step 20: At Page checkout/shipping-address, input on input shipping address last name'

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping-address/input_shipping_address_last_name'), var_4_input_shipping_address_last_name)

'Step 21: At Page checkout/shipping-address, input on input shipping address address line 1'

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping-address/input_shipping_address_address_line_1'), var_5_input_shipping_address_address_line_1)

'Step 22: At Page checkout/shipping-address, input on input shipping address zip'

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping-address/input_shipping_address_zip'), var_6_input_shipping_address_zip)

'Step 23: At Page checkout/shipping-address, input on input shipping address city'

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping-address/input_shipping_address_city'), var_7_input_shipping_address_city)

'Step 24: At Page checkout/shipping-address, input on input shipping address state'

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping-address/input_shipping_address_state'), var_8_input_shipping_address_state)

'Step 25: At Page checkout/shipping-address, input on input shipping address phone'

WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping-address/input_shipping_address_phone'), var_9_input_shipping_address_phone)

'Step 26: At Page checkout/shipping-address, click on button continue to payment > navigate to Page checkout/payment'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping-address/button_continue_to_payment'))

'Step 27: At Page checkout/payment, click on button complete order > navigate to Page thank-you/*'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_complete_order'))

'Step 28: Add visual checkpoint at Page_thank-you/*'

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Successful Order Placement from Product Page to Thank You Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
