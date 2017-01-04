package org.moe.binding.bolts.protocol;


import apple.foundation.NSURL;
import org.moe.binding.bolts.BFTask;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Bolts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("BFAppLinkResolving")
public interface BFAppLinkResolving {
	@Generated
	@Selector("appLinkFromURLInBackground:")
	BFTask<?> appLinkFromURLInBackground(NSURL url);
}