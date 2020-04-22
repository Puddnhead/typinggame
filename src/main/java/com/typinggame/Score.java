package com.typinggame;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * Created by MVW on 4/22/2020.
 */
@Data
@AllArgsConstructor
@Builder
public class Score {

    private String player;
    private Long score;

}
