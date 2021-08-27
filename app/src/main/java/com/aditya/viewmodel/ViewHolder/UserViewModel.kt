package com.aditya.viewmodel.ViewHolder

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aditya.viewmodel.Model.User
import com.aditya.viewmodel.Utils.UserListData

class UserViewModel : ViewModel()
{
 val userList:MutableLiveData<List<User>> = MutableLiveData()
    fun getUserList()
    {
        val user = UserListData.setUserList()
        userList.value = user
    }
}