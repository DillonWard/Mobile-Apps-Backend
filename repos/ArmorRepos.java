package ie.gmit.sw.repos;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;

import ie.gmit.sw.models.Armor;

public interface ArmorRepos extends MongoRepository<Armor, String>{

	public ArrayList<Armor> findByItemType(String type);

}
