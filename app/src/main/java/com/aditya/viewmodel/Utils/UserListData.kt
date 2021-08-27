package com.aditya.viewmodel.Utils

import com.aditya.viewmodel.Model.User

object UserListData
{
    fun setUserList():List<User>
    {
        var userList:ArrayList<User> = ArrayList()
        userList.add(User("Aditya"))
        userList.add(User("Sneha"))
        userList.add(User("Ashsish"))
        userList.add(User("Prakash"))
        userList.add(User("Patel"))
        userList.add(User("Lakesh"))
        userList.add(User("Amar"))
        userList.add(User("Sai"))
        return userList
    }

}