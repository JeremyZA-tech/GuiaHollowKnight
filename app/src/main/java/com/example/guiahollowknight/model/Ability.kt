package com.example.guiahollowknight.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.guiahollowknight.R

data class Ability (
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    @StringRes val info: Int
)



