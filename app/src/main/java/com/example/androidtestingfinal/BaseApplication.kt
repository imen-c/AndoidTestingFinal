package com.example.androidtestingfinal

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp // etendre Application et le note dans le manifest dans les balises application
class BaseApplication: Application() {


}