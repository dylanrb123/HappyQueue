package com.happyhouse.HappyQueue.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.happyhouse.HappyQueue.enums.VoteType;
import com.happyhouse.HappyQueue.util.HappyHouseStyle;
import org.immutables.value.Value.Immutable;

@HappyHouseStyle
@Immutable
@JsonNaming(SnakeCaseStrategy.class)
public interface VoteRequestIF {
  int getTrackId();
  String getQueueName();
  VoteType getVoteType();
}
