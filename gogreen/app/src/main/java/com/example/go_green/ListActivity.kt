package com.example.go_green

import android.widget.ListAdapter
import ...


class ListActivity : AppCompatActivity() {
    private val name = arrayOf("nasi goreng","lontong sayur","bubur ayam","rendang",
                      "soto","gulai ayam","sate ayam","bakso","gado-gado","bakwan",
       "nasi goreng","lontong sayur","bubur ayam","rendang",
        "soto","gulai ayam","sate ayam","bakso","gado-gado","bakwan",

override fun onCreate(savedInstanceState: Bundle){
      super.onCreate(savedInstanceState)
      setContentView(R.layout.activity_list)

     list_view.adapter = ListAdapter(this, image, name)
    }
}