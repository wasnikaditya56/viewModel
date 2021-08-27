package com.aditya.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aditya.viewmodel.Adapter.UserAdapter
import com.aditya.viewmodel.Model.User
import com.aditya.viewmodel.ViewHolder.UserViewModel

class MainActivity : AppCompatActivity()
{
    private lateinit var userViewModel: UserViewModel
    private lateinit var recyclerView: RecyclerView
    private lateinit var userAdapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        intiRecyclerView()
        userViewModel = ViewModelProvider(this).get(UserViewModel::class.java)
        userViewModel.getUserList()
        userViewModel.userList.observe(this, Observer {
            userAdapter.setUserData(it as ArrayList<User>)
        })
    }

    private fun intiRecyclerView()
    {
        recyclerView = findViewById(R.id.recyclerView)
        userAdapter = UserAdapter(this, ArrayList())
        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter=userAdapter
        }

    }
}