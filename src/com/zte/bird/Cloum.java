package com.zte.bird;

import java.awt.Graphics;
import java.util.Random;

import javax.swing.ImageIcon;

import com.zte.engine.ObjectMgr;

//����

	public class Cloum extends ObjectMgr{
		Random r=new Random();//�����

		@Override
		public void update() {
			
			this.x--;
			if(this.x<-78) {
				this.x=522;
			this.y=-200-r.nextInt(300);}
				
	}

}
