package com.example.androidtestingfinal

import androidx.lifecycle.ViewModel
import com.example.androidtestingfinal.domain.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(

    private val repository: MyRepository
): ViewModel() {




}