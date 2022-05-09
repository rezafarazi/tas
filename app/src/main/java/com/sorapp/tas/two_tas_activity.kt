package com.sorapp.tas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlin.random.Random

class two_tas_activity : AppCompatActivity()
{

    lateinit var tas1:ImageView;
    lateinit var tas2:ImageView;

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_tas)

        tas1=findViewById(R.id.imageView3);
        tas2=findViewById(R.id.imageView4);
    }

    fun OnClick_Go(v: View)
    {
        Tas(tas1)
        Tas(tas2)
    }

    fun Tas(img:ImageView)
    {
        var loop=Random.nextInt(1, 15)
        for(i in 0..loop)
        {
            var rnd = Random.nextInt(1, 6)
            if(rnd==1)
            {
                img.setImageResource(R.drawable.one)
            }
            else if(rnd==2)
            {
                img.setImageResource(R.drawable.two)
            }
            else if(rnd==3)
            {
                img.setImageResource(R.drawable.three)
            }
            else if(rnd==4)
            {
                img.setImageResource(R.drawable.fore)
            }
            else if(rnd==5)
            {
                img.setImageResource(R.drawable.five)
            }
            else if(rnd==6)
            {
                img.setImageResource(R.drawable.six)
            }
            Thread.sleep(10)
        }
    }

}