package com.app.homecenterapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.homecenterapp.domain.ItemUseCase
import com.app.homecenterapp.model.Item


class MyViewModel(val itemUseCase: ItemUseCase):ViewModel() {

    private val listData = MutableLiveData<List<Item>>()

    fun setListData(items:List<Item>){
        listData.value = items
    }

    //Podemos usar corutinas para pedir informacion que sea asyncrona
    fun getItems(){
        setListData(itemUseCase.obtenerItems())
    }

    fun getItemsLiveData():LiveData<List<Item>>{
        return listData
    }

}