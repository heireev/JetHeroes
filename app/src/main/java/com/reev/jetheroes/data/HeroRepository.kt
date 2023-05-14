package com.reev.jetheroes.data

import com.reev.jetheroes.model.Hero
import com.reev.jetheroes.model.HeroesData

class HeroRepository {
    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }
}