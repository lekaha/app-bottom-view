package android.lekaha.mobile.bottomappbar

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MainAdapter : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(parent,
                R.layout.layout_item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        /** empty implementation */
    }

    override fun getItemCount(): Int {
        return 11
    }

    open class ViewHolder(parent: ViewGroup?, resId: Int)
        : RecyclerView.ViewHolder(LayoutInflater.from(parent?.context)
            .inflate(resId, parent, false))
}