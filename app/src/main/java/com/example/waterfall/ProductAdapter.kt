package com.example.waterfall

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import jp.wasabeef.glide.transformations.RoundedCornersTransformation
import kotlinx.android.synthetic.main.product_item.view.*
import java.util.*


class ProductAdapter : RecyclerView.Adapter<ProductAdapter.CustomHolder>() {


    override fun getItemCount() = data.productList.count()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false)
        return CustomHolder(view)
    }


    override fun onBindViewHolder(holder: CustomHolder, position: Int) {

        holder.bind(data.productList[position])

//        val params = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
//        params.height = 900
//        //設置RecyclerView的高度
//        holder.itemView.layoutParams = params


    }

    inner class CustomHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        private val mRandom = Random()
        val product = itemview.iv_product
        val name = itemview.name
        val price = itemview.price

        fun bind(content: Content.Product) {


            name.text = content.name
            price.text = content.price
//          product.setImageResource(content.image)


            product.layoutParams.height = getRandomIntInRange(450, 300)
            println("*****${getRandomIntInRange(150, 50)}")


            Glide.with(itemView.context).load(content.image).transform(RoundedCornersTransformation(50, 3))
                .into(product)

        }



        private fun getRandomIntInRange(max: Int, min: Int): Int {
            return mRandom.nextInt(max - min + min) + min
        }


    }


}