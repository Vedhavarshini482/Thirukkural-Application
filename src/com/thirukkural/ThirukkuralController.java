package com.thirukkural;

import java.util.List;

import com.thirukkural.ThirukkuralModel.ThirukkuralModelControllerCallBack;
import com.thirukkural.dto.Properties;

public class ThirukkuralController implements ThirukkuralControllerCallBack, ThirukkuralModelControllerCallBack{

	private ThirukkuralViewCallBack view;
	private ThirukkuralModelCallBack model;
	
	ThirukkuralController(ThirukkuralView view ){
		this.view=view;
		model=new ThirukkuralModel(this);
	}

	@Override
	public void displayArathupaal() {
		model.displayArathupaal();
	}

	@Override
	public void arathupaalList(List<Properties> arathupaalList) {
		view.arathupaalList(arathupaalList);
	}

	@Override
	public void displayPorutpaalpaal() {
		model.displayPorutpaal();
	}

	@Override
	public void displayInbathupaal() {
		model.displayInbathupaal();
	}

	@Override
	public void getSpecificKural(String number) {
		model.getSpecificKural(number);
	}

	@Override
	public void getSpecificAthikaram(String number) {
		model.getSpecificAthikaram(number);
	}

	@Override
	public void printKural(Properties property) {
		view.printKural(property);
	}

	@Override
	public void printAthikaram(List<Properties> athikaram) {
		view.printAthikaram(athikaram);
	}

	@Override
	public void exit() {
		model.exit();
	}
	
}