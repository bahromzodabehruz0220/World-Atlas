package tj.behruz.worldatlas.ui.countries

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import tj.behruz.worldatlas.databinding.CountryItemBinding

class CountryAdapter(private val itemHandler: () -> Unit):RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val binding= CountryItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CountryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.itemView.setOnClickListener {
            itemHandler.invoke()
        }
    }

    override fun getItemCount() = 12

    inner  class CountryViewHolder(val binding:CountryItemBinding):RecyclerView.ViewHolder(binding.root){

    }


}