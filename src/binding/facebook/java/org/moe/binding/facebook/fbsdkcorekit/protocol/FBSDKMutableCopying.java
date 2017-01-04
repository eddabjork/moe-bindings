package org.moe.binding.facebook.fbsdkcorekit.protocol;


import apple.foundation.protocol.NSMutableCopying;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("FBSDKCoreKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("FBSDKMutableCopying")
public interface FBSDKMutableCopying extends FBSDKCopying, NSMutableCopying {
	@Generated
	@Selector("mutableCopy")
	@MappedReturn(ObjCObjectMapper.class)
	Object mutableCopy();
}