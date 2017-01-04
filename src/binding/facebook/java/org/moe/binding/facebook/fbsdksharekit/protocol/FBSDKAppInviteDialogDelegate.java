package org.moe.binding.facebook.fbsdksharekit.protocol;


import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import org.moe.binding.facebook.fbsdksharekit.FBSDKAppInviteDialog;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("FBSDKShareKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("FBSDKAppInviteDialogDelegate")
public interface FBSDKAppInviteDialogDelegate {
	@Generated
	@Selector("appInviteDialog:didCompleteWithResults:")
	void appInviteDialogDidCompleteWithResults(
			FBSDKAppInviteDialog appInviteDialog, NSDictionary<?, ?> results);

	@Generated
	@Selector("appInviteDialog:didFailWithError:")
	void appInviteDialogDidFailWithError(FBSDKAppInviteDialog appInviteDialog,
			NSError error);
}