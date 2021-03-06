/** COIS 2240_Project_Group20
* Maggie Kikkert, Stednisha Richardson, Micheala Palmer, Jason McNab
*April 6th , 2018 
*/

package application;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Item {
	private StringProperty item;
	private DoubleProperty price;
	
	/**
	 * Default constructor
	 */
	public Item(){
		this(null, 0.0);
	}
	
	/**
	 * Constructor with initial data
	 * @param item
	 * @param price
	 */
	public Item(String item, double price){
		this.item = new SimpleStringProperty(item);
		this.price = new SimpleDoubleProperty(price);
	}
	
	public String getItem(){
		return item.get();
	}
	public Double getPrice(){
		return price.get();
	}
	
	public void setItemProperty(String item){
		this.item.set(item);
	}
	public StringProperty itemProperty(){
		return item;
	}
	
	public void setPriceProperty(double price){
		this.price.set(price);
	}
	public DoubleProperty priceProperty(){
		return price;
	}
}
