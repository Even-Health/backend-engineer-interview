package com.evenhealth.cabana.infrastructure.clevertap.model.event;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class GroupUnregisteredEvent extends BaseEvent {
  private String id;

  @Override
  protected String getEventName() {
    return "Group Unregistered";
  }
}
