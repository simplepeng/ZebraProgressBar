package demo.simple.zebraprogressbar

import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import me.simple.view.ZebraProgressBar

class MainActivity : AppCompatActivity() {

    private val btnStart by lazy { findViewById<Button>(R.id.btnStart) }

    private val zpb1 by lazy { findViewById<ZebraProgressBar>(R.id.zpb1) }
    private val zpb2 by lazy { findViewById<ZebraProgressBar>(R.id.zpb2) }
    private val zpb3 by lazy { findViewById<ZebraProgressBar>(R.id.zpb3) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart.setOnClickListener {
            val animator = ValueAnimator.ofInt(0, 100).apply {
                duration = 10 * 1000
            }
            animator.addUpdateListener {
                val value = it.animatedValue as Int

                zpb1.progress = value
                zpb2.progress = value
                zpb3.progress = value
            }
            animator.start()
        }
    }
}