package com.thirukkural;

import java.util.List;

import com.thirukkural.dto.Properties;

public interface ThirukkuralViewCallBack {

	void arathupaalList(List<Properties> arathupaalList);

	void printAthikaram(List<Properties> athikaram);

	void printKural(Properties property);

}