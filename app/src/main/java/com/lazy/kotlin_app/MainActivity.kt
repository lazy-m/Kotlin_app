package com.lazy.kotlin_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.lazy.kotlin_app.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val  binding:ActivityMainBinding=DataBindingUtil.setContentView(this,R.layout.activity_main)
//        val binding: ActivityMainBinding = ActivityMainBinding.inflate(getLayoutInflater())
        binding.user= User()

        val layoutManager = LinearLayoutManager(this)
        recycler_view.layoutManager = layoutManager
        recycler_view.adapter=SimpleAdapter(initUsers())
    }
    fun initUsers():MutableList<User>{
        val userList = mutableListOf<User>()
        for (i in 1..6){
            var  user=User(i)
            userList.add(user)
        }
        return userList
    }
}
