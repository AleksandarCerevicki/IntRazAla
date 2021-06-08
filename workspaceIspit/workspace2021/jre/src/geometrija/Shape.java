package geometrija;

import java.awt.Graphics;

public class Shape {
	protected boolean selected;
	
	public Shape() {}
	
	public Shape(boolean selected) {
	this.selected = selected;
	}
	
	public boolean isSelected() {
	return this.selected;
	}
	
	public void setSelected(boolean selected) {
	this.selected = selected;
	}

	public void draw(Graphics g) {
		
	}
} 
