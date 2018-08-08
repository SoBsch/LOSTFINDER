package lostfinder.sobsch.lostfinder.ui.near.map

import android.os.Bundle
import com.nhn.android.maps.NMapContext
import kotlinx.android.synthetic.main.fragment_map.*
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseFragment

class MapFragment : BaseFragment<MapFragmentContract.View, MapFragmentContract.Presenter>(), MapFragmentContract.View {

    private lateinit var nContext: NMapContext

    override var mPresenter: MapFragmentContract.Presenter = MapFragmentPresenter()

    override fun getResId(): Int = R.layout.fragment_map

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        nContext = NMapContext(super.getActivity())
        nContext.onCreate()
    }

    override fun init() {

        setMap()
    }

    private fun setMap() {
        mapView.setClientId(context!!.getString(R.string.naver_map_client))
        nContext.setupMapView(mapView)
    }

    override fun onStart() {
        super.onStart()
        nContext.onStart()
    }

    override fun resume() {
        nContext.onResume()
    }

    override fun pause() {
        nContext.onPause()
    }

    override fun stop() {
        nContext.onStop()
    }

    override fun attach() {
    }

}