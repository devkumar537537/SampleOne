package com.example.firstprojects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var listviews:ListView
    var numbers = arrayListOf("3242342","32423423","42342342","5645645645","56574564564","6745645645","3242342",
        "32423423","42342342","5645645645","56574564564","6745645645","3242342","32423423","42342342","5645645645","56574564564","6745645645","3242342")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listviews = findViewById(R.id.listview)

        var listadapter = ArrayAdapter<String>(applicationContext,R.layout.listviewformate,numbers)
        listviews.adapter = listadapter

        registerForContextMenu(listviews)
        listviews.setOnItemClickListener { adapterView, view, postion, l ->

var item = numbers[postion]
            Toast.makeText(applicationContext," selected" +
                    "



















                    no  $item",Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.contextmenu,menu)

    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        var id = item.itemId

        when(id)
        {
            R.id.firstopeint->{

               Toast.makeText(applicationContext,"It is first option",Toast.LENGTH_SHORT).show()
            }
            R.id.secondoption->
            {
                Toast.makeText(applicationContext,"It is first option",Toast.LENGTH_SHORT).show()
            }
        }
        return true
    }
}