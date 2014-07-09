// This file was generated by Mendix Business Modeler 4.0.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package restservices.actions;

import restservices.publish.MicroflowService;
import com.mendix.systemwideinterfaces.core.UserAction;

/**
 * 
 */
public class StartMicroflowServiceJava extends UserAction<Boolean>
{
	private String microflowName;
	private String securityRole;
	private String description;
	private restservices.proxies.HttpMethod httpMethod;
	private String pathTemplate;

	public StartMicroflowServiceJava(String microflowName, String securityRole, String description, String httpMethod, String pathTemplate)
	{
		super();
		this.microflowName = microflowName;
		this.securityRole = securityRole;
		this.description = description;
		this.httpMethod = httpMethod == null ? null : restservices.proxies.HttpMethod.valueOf(httpMethod);
		this.pathTemplate = pathTemplate;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		new MicroflowService(microflowName, securityRole, httpMethod, pathTemplate, description);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "StartMicroflowServiceJava";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
