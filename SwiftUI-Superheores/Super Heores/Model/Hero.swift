//
//  Hero.swift
//  Super Heores
//
//  Created by Jaehwa Noh on 11/25/23.
//

struct Hero: Identifiable {
    let name: String
    let description: String
    let imageResourceName: String
    var id: String { name }
}
