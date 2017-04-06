package ie.gmit.sw.repos;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;

import ie.gmit.sw.models.Weapons;

public interface WeaponRepos extends MongoRepository<Weapons, String>{

	public ArrayList<Weapons> findByItemType(String type);

}
