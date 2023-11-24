package com.example.superheros

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.superheros.model.Hero

@Composable
fun HeroesList(modifier: Modifier = Modifier) {

}

@Composable
fun HeroesListItem(hero: Hero, modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Row {
            Column {
                Text(stringResource(id = hero.nameRes))
                Text(stringResource(id = hero.descriptionRes))
            }

            HeroPhoto(hero = hero)
        }
    }
}

@Composable
fun HeroPhoto(hero: Hero, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = hero.imageRes),
        contentDescription = null
    )
}

@Preview
@Composable
fun HeroesListPreview() {
    SuperherosTheme {
        HeroesList()
    }
}

@Preview
@Composable
fun HeroesListItemPreview() {
    SuperherosTheme {
        HeroesListItem(
            Hero(
                R.string.hero1,
                R.string.description1,
                R.drawable.android_superhero1
            )
        )
    }
}