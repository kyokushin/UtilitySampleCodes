package com.yutasuz.utilitysamplecodes.fixaspectratio

import android.support.annotation.DrawableRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.yutasuz.utilitysamplecodes.R

interface ViewHolders {

    class FixAspectRatioViewHolder(view: View)
        : RecyclerView.ViewHolder(view) {

        val imageView: ImageView = itemView.findViewById(R.id.image)

        fun onBind(@DrawableRes id: Int){
            imageView.setImageResource(id)
        }
    }

}