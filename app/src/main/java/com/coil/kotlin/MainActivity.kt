package com.coil.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.Coil
import coil.api.get
import coil.api.load
import coil.transform.CircleCropTransformation
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Load Image with URL
        image.load("https://i.ibb.co/TRTpb0N/download.png")


        //Load Local Resource Image
        image.load(R.drawable.ic_launcher_background)


        //Load the image using File Storage Path
        image.load(File("/path/to/image.jpg"))


        //Load Image with Transformation
        image.load("https://i.ibb.co/TRTpb0N/download.png")
        {
            crossfade(true)
            placeholder(R.mipmap.ic_launcher)
            transformations(CircleCropTransformation())
        }
    }
}
