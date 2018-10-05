package com.yutasuz.utilitysamplecodes.fixaspectratio

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.yutasuz.utilitysamplecodes.R

class FixAspectRatioAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    enum class Type {
        Square,
        VerticalRectangle,
        HorizontalRectangle
    }

    interface Item {
        val id: Int
        val type: Type

        class SquareItem(override val id: Int) : Item {
            override val type = Type.Square
        }

        class VerticalRectangleItem(override val id: Int) : Item {
            override val type = Type.VerticalRectangle
        }

        class HorizontalRectangleItem(override val id: Int) : Item {
            override val type = Type.HorizontalRectangle
        }
    }

    val items = arrayListOf<Item>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            : RecyclerView.ViewHolder {

        val type = Type.values()[viewType]
        val layoutId = when (type) {
            FixAspectRatioAdapter.Type.Square ->
                R.layout.viewholder_fixaspectratio_square
            FixAspectRatioAdapter.Type.VerticalRectangle ->
                R.layout.viewholder_fixaspectratio_verticalsquare
            FixAspectRatioAdapter.Type.HorizontalRectangle ->
                R.layout.viewholder_fixaspectratio_horizontalsquare
        }

        val view = LayoutInflater.from(parent.context)
                .inflate(layoutId, parent, false)
        return ViewHolders.FixAspectRatioViewHolder(view)
    }

    override fun getItemViewType(position: Int) = items[position].type.ordinal

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]

        holder as ViewHolders.FixAspectRatioViewHolder
        holder.onBind(item.id)
    }

}