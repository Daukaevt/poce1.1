package com.wixsite.mupbam1.resume.poce11.Model

data class Users(
    val users:ArrayList<UserModelClass>
)

    //Creating a data model class for User
    data class UserModelClass(
        val id: Int,
        val name: String,
        val email: String,
        val gender: String,
        val weight: Double,
        val height: Int,
        val phone: Phone
    )

data class Phone(
    val mobile: String,
    val office: String
)

