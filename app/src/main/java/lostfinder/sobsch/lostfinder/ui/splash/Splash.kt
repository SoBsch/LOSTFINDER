package lostfinder.sobsch.lostfinder.ui.splash

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.WindowManager
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_splash.*
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.login.Login
import org.jetbrains.anko.intentFor

class Splash : AppCompatActivity(), SplashContract.View {

    private lateinit var mPresenter: SplashPresenter

    override fun logo(): ImageView = splash_logo

    override fun top(): ImageView = splash_top

    override fun content(): ImageView = splash_content

    override fun bottom(): ImageView = splash_bottom

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash)

        init()
    }

    private fun init() {

        mPresenter = SplashPresenter()

        mPresenter.attachView(this)

        mPresenter.loadImages(this)

        mPresenter.finishSplash { startActivity(intentFor<Login>()).apply { finish() } }
    }

    override fun onStop() {
        super.onStop()

    }
}