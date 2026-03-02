	/**
	 * The following prompt is for generating a custom keyword with StudioAssist
	 * 
	 * Select the prompt -> Right-click -> StudioAssist -> Generate Code
	 */

	/*
	 * Write me a clickElement keyword that receives a test object id of type String and does as follows:
	 * 1. Click the element
	 * 2. If cannot click the element, catch WebElementNotFoundException exception and use KeywordUtil.markFailed to say that you cannot find the element
	 * 3. If other errors, catch Exception saying that you failed to click the element with the KeywordUtil.markFailed
	 * 4. Otherwise, mark the keyword as succeed
	 * 
	 */
package com.example

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class MyCustomKeyword {

/**
* The following prompt is for generating a custom keyword with StudioAssist
*
* Select the prompt -> Right-click -> StudioAssist -> Generate Code
*/

/*
* Write me a clickElement keyword that receives a test object id of type String and does as follows:
* 1. Click the element
* 2. If cannot click the element, catch WebElementNotFoundException exception and use KeywordUtil.markFailed to say that you cannot find the element
* 3. If other errors, catch Exception saying that you failed to click the element with the KeywordUtil.markFailed
* 4. Otherwise, mark the keyword as succeed
*
*/

/*
 * Clicks the specified test object
 *
 * @param testObjectId The id of the TestObject in the Object Repository
 * @return void
 */
@Keyword
def clickElement(String testObjectId) {
    try {
        // Click the element using the provided test object id
        WebUI.click(findTestObject(testObjectId))
        // Mark the keyword as passed after successful click
        KeywordUtil.markPassed("Clicked element: " + testObjectId)
    } catch (WebElementNotFoundException e) {
        // Mark failed indicating the element cannot be found
        KeywordUtil.markFailed("You cannot find the element: " + testObjectId)
    } catch (Exception e) {
        // Mark failed indicating a general failure to click the element
        KeywordUtil.markFailed("Failed to click the element: " + testObjectId + ". Error: " + e.getMessage())
    }
}
}
