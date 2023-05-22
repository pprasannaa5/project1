package custom_function;

import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;

@XPathFunctionGroup(category = "Custom Functions", prefix = "tib", namespace = "http://custom.function", helpText = "Custom defined function")
public class CustomFunctions {

	@XPathFunction(helpText = "Description", parameters = {
			@XPathFunctionParameter(name = "inputstring", optional = false, optionalValue = ""),
			@XPathFunctionParameter(name = "findstring", optional = false, optionalValue = ""),
			@XPathFunctionParameter(name = "replacedbyString", optional = false, optionalValue = "") })
	public String replaceall(String inputstring, String findstring,
			String replacedbyString) {
		return inputstring.replaceAll(findstring, replacedbyString);
	}
}
