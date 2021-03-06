package com.happyhouse.HappyQueue.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.happyhouse.HappyQueue.util.HappyHouseStyle;
import java.util.List;
import org.immutables.value.Value.Immutable;
import org.immutables.value.Value.Parameter;

@HappyHouseStyle
@Immutable
@JsonNaming(SnakeCaseStrategy.class)
public interface SearchResponseIF {
  @Parameter
  List<Track> getTracks();
}
