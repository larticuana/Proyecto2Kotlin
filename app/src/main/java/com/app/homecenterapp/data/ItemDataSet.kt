package com.app.homecenterapp.data

import com.app.homecenterapp.model.Item


class ItemDataSet {

    fun crearListaDeItems(): List<Item> {
        return listOf(
            Item("Silla", "Es una silla", 25, "para sentarse"),
            Item("Comedor","Mesa para comer",80,"Mesa redonda de camelot"),
            Item("Escritorio","xxxxxx",30,"en forma de l")
        )
    }
}