package com.example.guiahollowknight.data

import com.example.guiahollowknight.R
import com.example.guiahollowknight.model.Ability

class DataSource {

    fun getAbilities(): List<Ability> {
        return listOf(
            Ability(R.drawable.crystal_heart, R.string.corazonCristal, R.string.corazonCristalInfo),
            Ability(R.drawable.desolate_dive, R.string.saltoDesolador, R.string.saltoDesoladorInfo),
            Ability(R.drawable.dream_nail, R.string.aguijonOnirico, R.string.aguijonOniricoInfo),
            Ability(R.drawable.focus, R.string.concentracion, R.string.concentracionInfo),
            Ability(R.drawable.howling_wraiths, R.string.espectrosAulladores, R.string.espectrosAulladoresInfo),
            Ability(R.drawable.isma_tear, R.string.lagrimaIsma, R.string.lagrimaIsmaInfo),
            Ability(R.drawable.mantis_claw, R.string.garraMantis, R.string.garraMantisInfo),
            Ability(R.drawable.monarch_wings, R.string.alasMonarca, R.string.alasMonarcaInfo),
            Ability(R.drawable.mothwing_cloak, R.string.capaAlas, R.string.capaAlasInfo),
            Ability(R.drawable.vengeful_spirit, R.string.espirituVengativo, R.string.espirituVengativoInfo)
        )
    }
}
