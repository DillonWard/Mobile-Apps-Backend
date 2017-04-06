package ie.gmit.sw.models;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class Armor implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	private String itemName;
	private String itemType;
	private int physDefence;
	private int fireDefence;
	private int magicDefence;
	private int lightningDefence;
	private int poise;
	
	public Armor(String itemName, String itemType, int physDefence, int fireDefence, int magicDefence, int lightningDefence, int poise) {
		this.itemName = itemName; 
		this.itemType = itemType;
		this.physDefence = physDefence;
		this.fireDefence = fireDefence;
		this.magicDefence = magicDefence;
		this.lightningDefence = lightningDefence;
		this.poise = poise;
	}
	
	
	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getItemType() {
		return itemType;
	}


	public void setItemType(String itemType) {
		this.itemType = itemType;
	}


	public int getPhysDefence() {
		return physDefence;
	}
	public void setPhysDefence(int physDefence) {
		this.physDefence = physDefence;
	}
	public int getFireDefence() {
		return fireDefence;
	}
	public void setFireDefence(int fireDefence) {
		this.fireDefence = fireDefence;
	}
	public int getMagicDefence() {
		return magicDefence;
	}
	public void setMagicDefence(int magicDefence) {
		this.magicDefence = magicDefence;
	}
	public int getLightningDefence() {
		return lightningDefence;
	}
	public void setLightningDefence(int lightningDefence) {
		this.lightningDefence = lightningDefence;
	}
	public int getPoise() {
		return poise;
	}
	public void setPoise(int poise) {
		this.poise = poise;
	}
	
	
}
