package com.zte.bird;

import java.awt.Graphics;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

//场景

public class BirdScene extends JPanel {//面板
	Random r=new Random();
	Bird bird;
	Cloum c1;
	Cloum c2;
	City city;
	Street street;
	public BirdScene() {
	bird=new Bird();//小鸟对象
	c1=new Cloum(); //柱子对象
	c2=new Cloum();//柱子对象
	city=new City();//背景对象
	street=new Street();//街道对象
	street.init(0,495,new ImageIcon("images/ground.png"));
	bird.init(100, 300, new ImageIcon("images/bird.png"));
	c1.init(522,-200-r.nextInt(300), new ImageIcon("images/column.png"));
	c2.init(822,-200-r.nextInt(300), new ImageIcon("images/column.png"));
	city.init(0,0,new ImageIcon("images/bg.png"));
    }
	//绘画
	public void paint(Graphics g) {//画笔
		super.paint(g);
		city.show(g);
		bird.show(g);
		c1.show(g);
		c2.show(g);
		street.show(g);
	
		
	}

}
