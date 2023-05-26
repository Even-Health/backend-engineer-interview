package com.evenhealth.cabana.infrastructure.clevertap.model.userprofile;

import com.evenhealth.cabana.infrastructure.clevertap.model.CleverTapPayload;
import lombok.Getter;

@Getter
public class UserProfilePayload extends CleverTapPayload {
  private UserProfile profileData;

  public UserProfilePayload(String identity, UserProfile profile) {
    super(identity, "profile");
    profileData = profile;
  }
}
