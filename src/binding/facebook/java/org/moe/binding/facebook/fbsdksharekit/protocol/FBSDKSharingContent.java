package org.moe.binding.facebook.fbsdksharekit.protocol;


import apple.foundation.NSArray;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSSecureCoding;
import org.moe.binding.facebook.fbsdkcorekit.protocol.FBSDKCopying;
import org.moe.binding.facebook.fbsdksharekit.FBSDKHashtag;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("FBSDKShareKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("FBSDKSharingContent")
public interface FBSDKSharingContent extends FBSDKCopying, NSSecureCoding {
	@Generated
	@Selector("contentURL")
	NSURL contentURL();

	@Generated
	@Selector("hashtag")
	FBSDKHashtag hashtag();

	@Generated
	@Selector("peopleIDs")
	NSArray<?> peopleIDs();

	@Generated
	@Selector("placeID")
	String placeID();

	@Generated
	@Selector("ref")
	String ref();

	@Generated
	@Selector("setContentURL:")
	void setContentURL(NSURL value);

	@Generated
	@Selector("setHashtag:")
	void setHashtag(FBSDKHashtag value);

	@Generated
	@Selector("setPeopleIDs:")
	void setPeopleIDs(NSArray<?> value);

	@Generated
	@Selector("setPlaceID:")
	void setPlaceID(String value);

	@Generated
	@Selector("setRef:")
	void setRef(String value);
}