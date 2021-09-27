package com.example.a2in1
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*
class RecycleViewAddapter (val tarace : List<String>) : RecyclerView.Adapter<RecycleViewAddapter.ItemViewHolder>() {
    class ItemViewHolder(itemView: View)  : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_row,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val list = tarace[position]
        holder.itemView.apply {
            tvText.text = list
        }
    }

    override fun getItemCount() = tarace.size


}
