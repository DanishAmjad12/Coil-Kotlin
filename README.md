# Coil-Kotlin
This is sample project of Coil-kotlin, In which I Explored some common functions to download the image.

Coil is a new image loading library in Kotlin for downloading images in Android, and it’s list of strengths are impressive:

* Fast: Coil is fast because it performs a number of optimizations, including memory and disk caching
* Lightweight: Coil adds only 1500 method counts to your APK file
* Modern: Coil is built in Kotlin and uses modern libraries like Kotlin Coroutines, AndroidX LifeCycle, etc

Requirements
To use Coil, you’ll need the following:

* Android X
* Min SDK 14+
* Compile SDK: 29+
* Java 8+

Downlaod Image with Extension Function


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image.load("https://i.ibb.co/TRTpb0N/download.png")
    }
    
Load Local Image Resource


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image.load(R.drawable.ic_launcher_background)
    }
    
Load Image File Path From Folder



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image.load(File("/path/to/image.jpg"))
    }
    
CircleCropTransformation


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image.load("https://i.ibb.co/TRTpb0N/download.png")
        {
            transformations(CircleCropTransformation())
        }
    }
