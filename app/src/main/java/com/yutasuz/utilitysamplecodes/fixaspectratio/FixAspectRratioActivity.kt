package com.yutasuz.utilitysamplecodes.fixaspectratio

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import com.yutasuz.utilitysamplecodes.R
import kotlinx.android.synthetic.main.activity_fix_aspect_rratio.*

class FixAspectRratioActivity : AppCompatActivity() {

    val adapter = FixAspectRatioAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fix_aspect_rratio)
        setSupportActionBar(toolbar)

        recycler_view.apply {
            adapter = this@FixAspectRratioActivity.adapter
            layoutManager = GridLayoutManager(this@FixAspectRratioActivity, 2)
        }

        adapter.items.apply {
            add(FixAspectRatioAdapter.Item.SquareItem(R.drawable.hayakuchi_namamugi_kome_tamago))
            add(FixAspectRatioAdapter.Item.HorizontalRectangleItem(R.drawable.hayakuchi_namamugi_kome_tamago))
            add(FixAspectRatioAdapter.Item.VerticalRectangleItem(R.drawable.hayakuchi_namamugi_kome_tamago))
            add(FixAspectRatioAdapter.Item.SquareItem(R.drawable.pose_syazai_sliding_dogeza_woman))
            add(FixAspectRatioAdapter.Item.HorizontalRectangleItem(R.drawable.text_rain_utenkekkou))
            add(FixAspectRatioAdapter.Item.VerticalRectangleItem(R.drawable.war_kettenkrad))
        }
        adapter.notifyDataSetChanged()

    }

}
