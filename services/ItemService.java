package ie.gmit.sw.services;

import java.util.Collection;

import ie.gmit.sw.models.Armor;
import ie.gmit.sw.models.Weapons;

public interface ItemService {

	Collection<Armor>getArmor();
	Collection<Weapons>getWeapons();
}
