//
//  HeroesScreen.swift
//  Super Heores
//
//  Created by Jaehwa Noh on 11/26/23.
//

import SwiftUI

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
                        .font(Font.custom("Cabin-Bold", size: 20, relativeTo: .largeTitle))
                    Spacer(minLength: 0)
                }
                HStack(spacing: 0) {
                    Text(hero.description)
                        .font(Font.custom("Cabin-Regular", size: 16, relativeTo: .callout))
                    Spacer(minLength: 0)
                }
            }
            .frame(height: 72)
            
            Image(hero.imageResourceName)
                .resizable()
                .frame(width:72, height:72)
                .clipShape(RoundedRectangle(cornerRadius: 8))
        }
        .padding(16)
        .background(
            RoundedRectangle(cornerRadius: 16.0)
                .fill(Color("CardColor"))
                .shadow(radius: 2)
        )
    }
}

#Preview {
    HeroesListItem(hero: HeroesRepository().heroes.first!)
}

#Preview {
    HeroesList()
}
