package com.zte.engine;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public abstract class ObjectMgr {
	protected int x;
	protected int y;
	protected ImageIcon img;
	//��ʼ��
	public void init(int x,int y,ImageIcon img) {
		this.x = x;
		this.y = y;
		this.img = img;
	}
	//��������
	public abstract void update();
	//��ʾͼƬ
	public void show(Graphics g) {
		g.drawImage(img.getImage(),x,y,null);
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getT() {
		return y;
	}
	public void setT(int y) {
		this.y = y;
	}
	public ImageIcon getImg() {
		return img;
	}
	public void setImg(ImageIcon img) {
		this.img = img;
	}
	
}
