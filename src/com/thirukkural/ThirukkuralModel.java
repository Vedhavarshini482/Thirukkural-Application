package com.thirukkural;

import com.thirukkural.repository.Database;

import java.util.List;

import com.thirukkural.dto.Properties;

public class ThirukkuralModel implements ThirukkuralModelCallBack {

	private ThirukkuralModelControllerCallBack controller;
	private Database db = new Database();

	ThirukkuralModel(ThirukkuralModelControllerCallBack controller) {
		this.controller = controller;
	}

	interface ThirukkuralModelControllerCallBack {

		void arathupaalList(List<Properties> arathupaalList);

		void printKural(Properties property);

		void printAthikaram(List<Properties> athikaram);

	}

	@Override
	public void displayArathupaal() {
		List<Properties> arathupaalList = db.displayArathupaal();
		controller.arathupaalList(arathupaalList);
	}

	@Override
	public void displayPorutpaal() {
		List<Properties> porutpaalList = db.displayPorutpaal();
		controller.arathupaalList(porutpaalList);
	}

	@Override
	public void displayInbathupaal() {
		List<Properties> inbathupaalList = db.displayInbathupaal();
		controller.arathupaalList(inbathupaalList);
	}

	@Override
	public void getSpecificKural(String number) {
		Properties property = db.getSpecificKural(number);
		controller.printKural(property);
	}

	@Override
	public void getSpecificAthikaram(String number) {
		List<Properties> athikaram;
		if (Integer.parseInt(number) >= 1 && Integer.parseInt(number) <= 38)
			athikaram = db.getSpecificAthikaramArathupaal(number);
		else if (Integer.parseInt(number) >= 39 && Integer.parseInt(number) <= 108)
			athikaram = db.getSpecificAthikaramPorutpaal(number);
		else
			athikaram = db.getSpecificAthikaramInbathupaal(number);
		controller.printAthikaram(athikaram);
	}

	@Override
	public void exit() {
		db.exit();
	}

}