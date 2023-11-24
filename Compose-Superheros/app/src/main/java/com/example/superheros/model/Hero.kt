package com.example.superheros.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class Hero(
    @StringRes nameRes: Int,
    @StringRes descriptionRes: Int,
    @DrawableRes imageRes: Int
)