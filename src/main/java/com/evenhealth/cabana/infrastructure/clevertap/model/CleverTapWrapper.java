package com.evenhealth.cabana.infrastructure.clevertap.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CleverTapWrapper<T> {
  List<CleverTapPayload<T>> d;
}
