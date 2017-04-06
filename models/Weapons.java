package ie.gmit.sw.models;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class Weapons implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	private String itemName;
	private String itemType;
	private int physOffence;
	private int fireOffence;
	private int magicOffence;
	private int lightningOffence;
	private int bleedOffence;

	public Weapons(String itemName, String itemType, int physOffence, int fireOffence, int magicOffence, int lightningOffence, int bleedOffence) {
		this.itemName = itemName; 
		this.itemType = itemType;
		this.physOffence = physOffence;
		this.fireOffence = fireOffence;
		this.magicOffence = magicOffence;
		this.lightningOffence = lightningOffence;
		this.bleedOffence = bleedOffence;
	}
	public int getPhysOffence() {
		return physOffence;
	}
	public void setPhysOffence(int physOffence) {
		this.physOffence = physOffence;
	}
	public int getFireOffence() {
		return fireOffence;
	}
	public void setFireOffence(int fireOffence) {
		this.fireOffence = fireOffence;
	}
	public int getMagicOffence() {
		return magicOffence;
	}
	public void setMagicOffence(int magicOffence) {
		this.magicOffence = magicOffence;
	}
	public int getLightningOffence() {
		return lightningOffence;
	}
	public void setLightningOffence(int lightningOffence) {
		this.lightningOffence = lightningOffence;
	}
	public int getBleedOffence() {
		return bleedOffence;
	}
	public void setBleedOffence(int bleedOffence) {
		this.bleedOffence = bleedOffence;
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
	
	
}
