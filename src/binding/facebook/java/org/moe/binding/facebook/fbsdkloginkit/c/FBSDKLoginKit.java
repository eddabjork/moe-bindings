package org.moe.binding.facebook.fbsdkloginkit.c;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("FBSDKLoginKit")
@Runtime(CRuntime.class)
public final class FBSDKLoginKit {
	static {
		NatJ.register();
	}

	@Generated
	private FBSDKLoginKit() {
	}

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String FBSDKLoginErrorDomain();
}