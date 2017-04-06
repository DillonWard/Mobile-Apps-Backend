package ie.gmit.sw.controllers;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ie.gmit.sw.models.Armor;
import ie.gmit.sw.models.Weapons;
import ie.gmit.sw.services.ItemService;

@RequestMapping("/dksItems/")
@RestController

public class ItemController {
	
	private static Logger logger = Logger.getLogger(ItemController.class);
	
	@Autowired
	@Qualifier("ItemService")
	private ItemService itemService;
	
	@ResponseBody
	@GetMapping("/get-weapons")
	public Collection<Weapons> getWeapons(){
		
		logger.info("##### GETTING WEAPONS #####");
		return itemService.getWeapons();
	}

	@ResponseBody
	@GetMapping("/get-armor")
	public Collection<Armor> getArmor(){
		logger.info("##### GETTING ARMOR #####");
		return itemService.getArmor();
	}
}
