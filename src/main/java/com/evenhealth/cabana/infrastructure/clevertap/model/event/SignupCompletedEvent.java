package com.evenhealth.cabana.infrastructure.clevertap.model.event;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class SignupCompletedEvent extends BaseEvent {
  @Override
  protected String getEventName() {
    return "Signup Completed";
  }
}
