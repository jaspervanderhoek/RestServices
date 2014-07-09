// This file was generated by Mendix Business Modeler 4.0.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package restservices.actions;

import restservices.proxies.DataServiceDefinition;
import restservices.publish.DataService;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.UserAction;

/**
 * 
 */
public class GetNrOfIncomingConnections extends UserAction<Long>
{
	private IMendixObject __index;
	private restservices.proxies.ChangeLog index;

	public GetNrOfIncomingConnections(IMendixObject index)
	{
		super();
		this.__index = index;
	}

	@Override
	public Long executeAction() throws Exception
	{
		this.index = __index == null ? null : restservices.proxies.ChangeLog.initialize(getContext(), __index);

		// BEGIN USER CODE
		if (index == null)
			throw new IllegalArgumentException();

		DataServiceDefinition def;
		try {
			//The next line can throw when the id is created but cannot be retrieve yet when it is being instantiated.....
			def = index.getChangeLog_ServiceDefinition();
		}
		catch (IllegalArgumentException e) {
			return 0L;
		}
		if (def == null)
			return 0L;
		DataService service = DataService.getServiceByDefinition(def);
		if (service == null)
			return 0L;
		return service.getChangeLogManager().getNrOfConnections();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "GetNrOfIncomingConnections";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
