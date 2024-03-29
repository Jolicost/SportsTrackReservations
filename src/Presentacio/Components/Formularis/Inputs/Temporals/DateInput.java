package Presentacio.Components.Formularis.Inputs.Temporals;

import Presentacio.Components.Formularis.Inputs.InputZone;
import Presentacio.Components.Formularis.Inputs.InputZoneText;
import Presentacio.Components.Formularis.Inputs.LabelInput;

public class DateInput extends LabelInput {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected InputZone getInputZone() {
		return new InputZoneText();
	}
	
	public DateInput(){
		super();
		super.setType(getInputType());
		super.setLabel(getLabelName());
	}
	
	public DateInput(String name,String id){
		super();
		super.setType(getInputType());
		super.setName(name);
		super.setId(id);
		super.setLabel(getLabelName());
	}

	protected String getLabelName(){
		if (super.label != null) return super.label;
		else return "Data: ";
	}
	protected String getInputType(){return "date";}

}
