package com.zte.bird;

import com.zte.engine.ObjectMgr;

//�ֵ�

public class Street extends ObjectMgr{

	@Override
	public void update() {
		x--;
		if(x < -180) {
			x = 0;
		}
	}
	
}


