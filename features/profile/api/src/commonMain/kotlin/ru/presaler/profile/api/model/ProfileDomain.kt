package ru.presaler.profile.api.model

data class ProfileDomain (val userId: Int, val userName: String, val userToken: String, val userStatus: UserStatus)