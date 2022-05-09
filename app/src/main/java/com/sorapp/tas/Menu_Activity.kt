package com.sorapp.tas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Menu_Activity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }


    fun OnClick_One(v:View)
    {
        startActivity(Intent(applicationContext,one_tas_activity::class.java));
    }


    fun OnClick_Two(v:View)
    {
        startActivity(Intent(applicationContext,two_tas_activity::class.java));
    }


    fun OnClick_Exit(v:View)
    {
        var inten=Intent();
        inten.setAction(Intent.ACTION_MAIN);
        inten.addCategory(Intent.CATEGORY_HOME);
        startActivity(inten);
    }


}