package com.bimabagaskhoro.pitjarustestapp.ui.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.bimabagaskhoro.pitjarustestapp.domain.usecase.StoresUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(val useCase: StoresUseCase) : ViewModel() {

    fun login(email: String, password: String) = useCase.login(email, password).asLiveData()

}