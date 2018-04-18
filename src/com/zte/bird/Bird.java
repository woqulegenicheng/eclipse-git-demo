package com.zte.bird;

import java.awt.Graphics;

import javax.swing.ImageIcon;

import com.zte.engine.ObjectMgr;

//Ð¡Äñ
public class Bird extends ObjectMgr{
	boolean isUp = true;
	@Override
	public void update() {
		if(isUp) {
			y--;
		if (y < 0) {
			isUp=false;
		}
		}else {
			y++;
			if(y>644) {
				isUp=true;
			}
		}

	}

}
