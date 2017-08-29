package cn.leejean.test;

import cn.leejean.handler.CacheLock;
import cn.leejean.handler.LockedObject;

public interface SeckillInterface {
	@CacheLock(lockedPrefix="TEST_PREFIX")
	public void secKill(String arg1,@LockedObject Long arg2);
}
