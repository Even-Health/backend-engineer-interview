package com.evenhealth.cabana.infrastructure.clevertap.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CleverTapPayload<T> {
  private String identity;
  private String type;
}
