package project.docs.files.template_kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity


class ListActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)



    }

    override fun onBackPressed() {
        // do nothing
    }

}