package com.evenhealth.cabana.infrastructure.clevertap;

import com.evenhealth.cabana.infrastructure.clevertap.model.CleverTapWrapper;
import com.evenhealth.cabana.infrastructure.clevertap.model.event.BaseEvent;
import com.evenhealth.cabana.infrastructure.clevertap.model.userprofile.UserProfile;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(
    name = "clevertap",
    url = "${clevertap.base.url}",
    configuration = CleverTapGatewayConfig.class)
@Validated
public interface CleverTapGateway {

  @PostMapping("/1/upload")
  void sendEvent(CleverTapWrapper<? extends BaseEvent> event);

  @PostMapping("/1/upload")
  void updateUserProfile(CleverTapWrapper<? extends UserProfile> userProfile);
}
