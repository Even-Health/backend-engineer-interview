package com.evenhealth.cabana.infrastructure.clevertap.model.event;

import com.evenhealth.cabana.infrastructure.clevertap.model.CleverTapPayload;
import lombok.Getter;

@Getter
public class EventPayload extends CleverTapPayload {
  private String evtName;
  private Object evtData;

  public EventPayload(String identity, String eventName, Object evtData) {
    super(identity, "event");
    this.evtName = eventName;
    this.evtData = evtData;
  }
}
