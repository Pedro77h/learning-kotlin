package com.example.pokedex.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.R
import com.example.pokedex.domain.Pokemon
import kotlinx.coroutines.NonDisposableHandle.parent

class PokemonAdapter(
    private val items: List<Pokemon>
) : RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.pokemon_item, parent, false);

        return ViewHolder(view);
    }

    override fun getItemCount(): Int {
        return items.size;
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position];

        holder.bindView(item);
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(item: Pokemon) = with(itemView) {
            findViewById<ImageView>(R.id.ivPokemon);
            findViewById<TextView>(R.id.tvName).text = item.name;
            findViewById<TextView>(R.id.tvNumber).text = "N° ${item.number}";
            findViewById<TextView>(R.id.tvType1).text = item.types[0].name;

            val type2 = findViewById<TextView>(R.id.tvType2)

            if(item.types.size > 1) {
                type2.visibility = View.VISIBLE
                type2.text = item.types[1].name;
            } else {
                type2.visibility = View.GONE
            }

            // Todo: load images with glide


        }
    }

}