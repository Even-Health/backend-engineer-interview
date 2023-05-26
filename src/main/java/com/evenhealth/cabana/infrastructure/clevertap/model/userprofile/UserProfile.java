package com.evenhealth.cabana.infrastructure.clevertap.model.userprofile;

import com.evenhealth.cabana.infrastructure.clevertap.model.CleverTapPayload;
import com.evenhealth.cabana.infrastructure.clevertap.model.CleverTapWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;
import java.util.List;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UserProfile {
  private String email;
  private String memberId;
  private String organization;
  private Instant createdDate;
  private String goal;
  private Long weeklyMinutes;
  private List<String> professionalRoles;
  private String oasisTheme;

  @JsonProperty
  public String getCreatedDate() {
    return "$D_" + createdDate.getEpochSecond();
  }

  public <T extends UserProfile> CleverTapWrapper<T> wrap(String identity) {
    CleverTapPayload payload = new UserProfilePayload(identity, this);
    return new CleverTapWrapper<T>(List.of(payload));
  }
}
