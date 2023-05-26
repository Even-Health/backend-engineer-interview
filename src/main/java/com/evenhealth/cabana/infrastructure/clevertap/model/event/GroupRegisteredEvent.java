package com.evenhealth.cabana.infrastructure.clevertap.model.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class GroupRegisteredEvent extends BaseEvent {
  private String id;
  private String title;
  private String type;
  private String moderator;
  private Long duration;
  private Instant start;
  private String detailLink;

  @JsonProperty
  public String getStart() {
    return "$D_" + start.getEpochSecond();
  }

  @Override
  protected String getEventName() {
    return "Group Registered";
  }
}
;
