package org.moe.binding.facebook.fbsdkloginkit.protocol;


import org.moe.binding.facebook.fbsdkloginkit.FBSDKLoginTooltipView;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("FBSDKLoginKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("FBSDKLoginTooltipViewDelegate")
public interface FBSDKLoginTooltipViewDelegate {
	@Generated
	@IsOptional
	@Selector("loginTooltipView:shouldAppear:")
	default boolean loginTooltipViewShouldAppear(FBSDKLoginTooltipView view,
			boolean appIsEligible) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("loginTooltipViewWillAppear:")
	default void loginTooltipViewWillAppear(FBSDKLoginTooltipView view) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("loginTooltipViewWillNotAppear:")
	default void loginTooltipViewWillNotAppear(FBSDKLoginTooltipView view) {
		throw new java.lang.UnsupportedOperationException();
	}
}