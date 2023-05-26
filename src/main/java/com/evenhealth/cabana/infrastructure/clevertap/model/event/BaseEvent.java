package com.evenhealth.cabana.infrastructure.clevertap.model.event;

import com.evenhealth.cabana.infrastructure.clevertap.model.CleverTapPayload;
import com.evenhealth.cabana.infrastructure.clevertap.model.CleverTapWrapper;
import java.util.List;

public abstract class BaseEvent {
  protected abstract String getEventName();

  public <T extends BaseEvent> CleverTapWrapper<T> wrap(String identity) {
    CleverTapPayload payload = new EventPayload(identity, getEventName(), this);
    return new CleverTapWrapper<T>(List.of(payload));
  }
}
