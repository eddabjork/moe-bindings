package org.moe.binding.bolts.protocol;


import org.moe.binding.bolts.BFAppLink;
import org.moe.binding.bolts.BFAppLinkReturnToRefererController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Bolts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("BFAppLinkReturnToRefererControllerDelegate")
public interface BFAppLinkReturnToRefererControllerDelegate {
	@Generated
	@IsOptional
	@Selector("returnToRefererController:didNavigateToAppLink:type:")
	default void returnToRefererControllerDidNavigateToAppLinkType(
			BFAppLinkReturnToRefererController controller, BFAppLink url,
			@NInt long type) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("returnToRefererController:willNavigateToAppLink:")
	default void returnToRefererControllerWillNavigateToAppLink(
			BFAppLinkReturnToRefererController controller, BFAppLink appLink) {
		throw new java.lang.UnsupportedOperationException();
	}
}