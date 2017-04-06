package ie.gmit.sw.services.implementations;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ie.gmit.sw.controllers.ItemController;
import ie.gmit.sw.models.Armor;
import ie.gmit.sw.models.Weapons;
import ie.gmit.sw.repos.ArmorRepos;
import ie.gmit.sw.repos.WeaponRepos;
import ie.gmit.sw.services.ItemService;

@Service("ItemService")
public class ImplementItemService implements ItemService {

	private ArmorRepos armorDb;
	private WeaponRepos weaponsDb;
	
	private static Logger logger = Logger.getLogger(ImplementItemService.class);
	 
	@Autowired
	public ImplementItemService(ArmorRepos armorDb, WeaponRepos weaponsDb) {
		this.armorDb = armorDb;
		this.weaponsDb = weaponsDb;
		logger.info("#### Service Construction #### DB initing ");
		//initDb();
	}
	
/*
	private void initDb(){
		try{
			armorDb.save(new Armor("Black Knight's Helm", "Helm", 21,11,18,6,8));
			armorDb.save(new Armor("Black Knight's Armor", "Chest", 57,29,48,17, 21));
			armorDb.save(new Armor("Black Knight's Gauntlets", "Arms", 26,14,23,8,10));
			armorDb.save(new Armor("Black Knight's Leggings", "Legs", 30,28,15,26,11));
			
			armorDb.save(new Armor("Brass Helm", "Helm", 22,12,11,11,8));
			armorDb.save(new Armor("Brass Armor", "Chest", 48,27,25,25, 16));
			armorDb.save(new Armor("Brass Gauntlets", "Arms", 24,14,12,12,8));
			armorDb.save(new Armor("Brass Leggings", "Legs", 26,16,15,15,9));
			
			armorDb.save(new Armor("Shadow Mask", "Helm", 9,5,6,6,0));
			armorDb.save(new Armor("Shadow Garb", "Chest", 23,12,16,17, 0));
			armorDb.save(new Armor("Shadow Gauntlets", "Arms", 13,7,9,10,0));
			armorDb.save(new Armor("Shadow Leggings", "Legs", 13,7,9,10,0));
			
			weaponsDb.save(new Weapons("Balder Side Sword", "Straight Sword", 80,0,0,0,100));
			weaponsDb.save(new Weapons("Black Knight's Sword", "Greatsword", 220,0,0,0,100));
			weaponsDb.save(new Weapons("Gold Tracer", "Curved Sword", 130,0,0,0, 300));
			
			weaponsDb.save(new Weapons("Battle Axe", "Axe", 95,0,0,0,100));
			weaponsDb.save(new Weapons("Demon's Greataxe", "Greataxe", 114,0,0,0,100));
			weaponsDb.save(new Weapons("Uchigatana", "Katana", 90,0,0,0, 100));
			
		
		}catch(NullPointerException exc){
			logger.info("##### REPOS ARE NULL #####");
		}

	}

*/
	@Override
	public Collection<Armor> getArmor() {
		Collection<Armor> items = null;
		
		try {
			items = armorDb.findAll();
		} catch (Exception e) {

		}
		
		return items;

	}

	@Override
	public Collection<Weapons> getWeapons() {
		Collection<Weapons> items = null;
		
		try {
			items = weaponsDb.findAll();
		} catch (Exception e) {

		}
		
		return items;
	}

}
