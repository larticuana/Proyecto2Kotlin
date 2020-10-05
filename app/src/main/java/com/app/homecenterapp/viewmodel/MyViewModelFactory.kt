package com.app.homecenterapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.app.homecenterapp.domain.ItemUseCase


class MyViewModelFactory(val itemUseCase: ItemUseCase):ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(ItemUseCase::class.java).newInstance(itemUseCase)
    }
}