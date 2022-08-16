package br.com.fiap.baseapp

import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.MediaController
import android.widget.ProgressBar
import android.widget.VideoView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity

class TreinamentosActivity : AppCompatActivity() {

    private var uri: Uri? = null
    private var isContinuously = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_treinamentos)

        val actionBar: ActionBar? = supportActionBar
        actionBar.let {
            actionBar?.setTitle("Treinamentos")
        }

        val vv: VideoView = findViewById(R.id.vv)
        val btnonce: ImageButton = findViewById(R.id.btnonce)
        val btnconti: ImageButton = findViewById(R.id.btnconti)
        val btnplay: ImageButton = findViewById(R.id.btnplay)
        val btnstop: ImageButton = findViewById(R.id.btnstop)
        val progrss: ProgressBar = findViewById(R.id.progrss)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(vv)

        val uriPath = "https://archive.org/download/WildlifeSampleVideo/Wildlife.mp4"

        uri = Uri.parse(uriPath)

        vv.setOnCompletionListener {
            if (isContinuously) {
                vv.start()
            }
        }

        btnstop.setOnClickListener { vv.pause() }
        btnplay.setOnClickListener { vv.start() }

        btnonce.setOnClickListener {
            isContinuously = false
            progrss.visibility = View.VISIBLE
            vv.setMediaController(mediaController)
            vv.setVideoURI(uri)
            vv.requestFocus()
            vv.start()
        }

        btnconti.setOnClickListener {
            isContinuously = true
            progrss.visibility = View.VISIBLE
            vv.setMediaController(mediaController)
            vv.setVideoURI(uri)
            vv.requestFocus()
            vv.start()
        }

        vv.setOnPreparedListener { progrss.visibility = View.GONE }

    }
}