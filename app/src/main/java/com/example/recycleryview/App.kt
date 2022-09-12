package com.example.recycleryview

import android.app.Application
import com.example.recycleryview.model.UsersService

class App: Application() {

    val userService = UsersService()

}