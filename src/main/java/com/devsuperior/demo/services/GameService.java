package com.devsuperior.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.devsuperior.demo.entities.Game;
import com.devsuperior.demo.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    
    public List<Game> findAll(){
        List<Game> result = gameRepository.findAll();
        return result;
    }
}
