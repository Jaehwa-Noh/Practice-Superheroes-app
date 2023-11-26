//
//  ContentView.swift
//  Super Heores
//
//  Created by Jaehwa Noh on 11/25/23.
//

import SwiftUI

struct ContentView: View {
    var body: some View {
        NavigationStack {
            HeroesList()
            .navigationTitle("Superheroes")
            .navigationBarTitleDisplayMode(.large)
        }
    }
}

#Preview {
    ContentView()
}
