package lostfinder.sobsch.lostfinder.util

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions

object ImageUtil {

    private val requestOptions = RequestOptions()
            .diskCacheStrategy(DiskCacheStrategy.NONE)

    private val roundOptions = RequestOptions()
            .transforms(CenterCrop(), RoundedCorners(10))

    fun squareDrawableImage(imageView: ImageView, url: Int, context: Context) = Glide.with(context)
            .load(url)
            .apply(requestOptions)
            .into(imageView)


    fun clearImageView(imageView: ImageView) = imageView.setImageResource(0)

}