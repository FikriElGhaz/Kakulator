package com.fikri.apple.uikurirapp.main1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.fikri.apple.uikurirapp.R
import com.fikri.apple.uikurirapp.main2.Main2Activity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val listMain = ArrayList<MainModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listMain.addAll(getListMain())
        initRecylerView()

        btnAntar.setOnClickListener {
            startActivity(Intent(this,Main2Activity::class.java))
        }
    }

    private fun initRecylerView() {
        rvMain.setHasFixedSize(true)
        rvMain.layoutManager = LinearLayoutManager(this)
        val listMainAdapter = ItemMainAdapter(listMain)
        rvMain.adapter = listMainAdapter
    }

    private fun getListMain(): ArrayList<MainModel> {
        val dataNum = resources.getStringArray(R.array.array_number)
        val dataName = resources.getStringArray(R.array.array_name)
        val dataAddress = resources.getStringArray(R.array.array_address)
        val dataReceipt = resources.getStringArray(R.array.array_receipt)
        val dataImage = resources.getStringArray(R.array.array_image)

        val list = ArrayList<MainModel>()
        for (position in dataNum.indices){
            val model = MainModel(
                dataNum[position],
                dataName[position],
                dataReceipt[position],
                dataAddress[position],
                dataImage[position]
            )

            list.add(model)
        }
        return list
    }
}
