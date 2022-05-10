package com.dhruvaagrawal.springbatchstarter.config;

import com.dhruvaagrawal.springbatchstarter.entity.Game;
import org.springframework.batch.item.ItemProcessor;

public class GameProcessor implements ItemProcessor<Game, Game> {

    @Override
    public Game process(Game game) throws Exception {
        return game;
    }
}
