package cvb.com.br.desafio_activity

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AuxActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aux_main)

        if (intent.action == Intent.ACTION_SEND) {

            val info = intent.getStringExtra(Intent.EXTRA_TEXT)

            val tv = findViewById<TextView>(R.id.tv1)
            tv.text = info
        }
    }
}