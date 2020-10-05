package com.app.homecenterapp.domain

import com.app.homecenterapp.data.ItemDataSet
import com.app.homecenterapp.model.Item


class ItemUseCase {

    private val itemsDataSet = ItemDataSet()

    fun obtenerItems():List<Item>{
        return itemsDataSet.crearListaDeItems()
    }
}