package com.example.superheros

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superheros.data.HeroesRepository
import com.example.superheros.model.Hero
import com.example.superheros.ui.theme.SuperherosTheme

@Composable
fun HeroesList(modifier: Modifier = Modifier, contentPadding: PaddingValues) {
    LazyColumn(
        modifier = modifier,
        contentPadding = contentPadding
    ) {
        items(HeroesRepository.heroes) { hero ->
            HeroesListItem(
                hero = hero,
                modifier = Modifier.padding(vertical = 4.dp, horizontal = 16.dp)
            )
        }

    }
}

@Composable
fun HeroesListItem(hero: Hero, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier,
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        shape = MaterialTheme.shapes.medium
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .height(72.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(end = 16.dp)
                    .weight(1f)
            ) {
                Text(
                    stringResource(id = hero.nameRes),
                    style = MaterialTheme.typography.displaySmall
                )
                Text(
                    stringResource(id = hero.descriptionRes),
                    style = MaterialTheme.typography.bodyLarge
                )
            }

            Box(
                modifier = Modifier
                    .size(72.dp)
            ) {
                HeroPhoto(
                    hero = hero,
                )
            }
        }
    }
}

@Composable
fun HeroPhoto(hero: Hero, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = hero.imageRes),
        contentDescription = null,
        modifier = modifier
            .clip(MaterialTheme.shapes.small)
    )
}

@Preview
@Composable
fun HeroesListPreview() {
    SuperherosTheme {
        HeroesList(contentPadding = PaddingValues(top = 16.dp))
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