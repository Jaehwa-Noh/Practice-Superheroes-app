//
//  HeroesScreen.swift
//  Super Heores
//
//  Created by Jaehwa Noh on 11/26/23.
//

import SwiftUI

struct HeroesScreen: View {
    var body: some View {
        Text("")
    }
}

struct HeroesList: View {
    let heroes = HeroesRepository().heroes
    var body: some View {
        ScrollView {
            LazyVStack(spacing: 8) {
                ForEach(heroes) { hero in
                    HeroesListItem(hero: hero)
                }
            }
            .padding(.horizontal, 16)
        }
    }
}

struct HeroesListItem: View {
    let hero: Hero
    
    var body: some View {
        HStack(spacing: 16) {
            VStack(spacing: 0) {
                HStack(spacing: 0) {
                    Text(hero.name)
                    Spacer(minLength: 0)
                }
                HStack(spacing: 0) {
                    Text(hero.description)
                    Spacer(minLength: 0)
                }
            }
            
            Image(hero.imageResourceName)
                .resizable()
                .frame(width:72, height:72)
                .clipShape(RoundedRectangle(cornerRadius: 8))
        }
        .padding(16)
        .background(
            RoundedRectangle(cornerRadius: 16.0)
                .fill(Color("CardColor"))
        )
    }
}

#Preview {
    HeroesListItem(hero: HeroesRepository().heroes.first!)
}

#Preview {
    HeroesList()
}
