package com.evenhealth.cabana.infrastructure.clevertap.model.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class GroupStartsEvent extends BaseEvent {
  String id;
  String title;
  String type;
  String moderator;
  Long duration;
  Instant start;
  String detailLink;
  private String eventName;

  @JsonProperty
  public String getStart() {
    return "$D_" + start.getEpochSecond();
  }
}
