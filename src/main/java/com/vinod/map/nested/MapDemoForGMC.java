package com.vinod.map.nested;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.dozer.DozerBeanMapper;

public class MapDemoForGMC {

	
	public static void main(String[] args) {
		
		DozerBeanMapper dozerMapper = new DozerBeanMapper();
		dozerMapper.setMappingFiles(Arrays.asList("mappings\\demo_model_gmc.xml"));

		
		Model model = new Model();
		
		model.setProp1("FirstOne");
		model.setProp2("SecondOne");
		
		
		Map modelmap = new HashMap();
		modelmap.put("mapkey1", "mapVal1");
		modelmap.put("mapkey2", "mapVal2");
		modelmap.put("mapkey3", "mapVal3");
		
		Cost c =  new Cost();
		c.setCurrency("INR");
		c.setValue(12);
		modelmap.put("cost", c);
		
		model.map=modelmap;
		
		
		

		GMCModel gmc = dozerMapper.map(model, GMCModel.class);
		
		System.out.println(gmc);
		
		
	}
	
	
}
