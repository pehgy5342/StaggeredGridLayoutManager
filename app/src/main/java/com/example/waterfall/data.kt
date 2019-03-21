package com.example.waterfall

object data {


    val tagList =
        arrayListOf(
            Content.Tag("鞋子"),
            Content.Tag("包包"),
            Content.Tag("化妝品"),
            Content.Tag("飾品"),
            Content.Tag("衣服"),
            Content.Tag("抱枕"),
            Content.Tag("其他")
        )

    val productList = arrayListOf(
        Content.Product("皮革小白鞋", "$300", R.drawable.shoes),
        Content.Product("牛皮手提包", "$1500", R.drawable.bag),
        Content.Product("BB、CC霜粉底刷", "$120", R.drawable.brash),
        Content.Product("SLACKER 太陽眼鏡", "$3780", R.drawable.glasses),
        Content.Product("1028 睫毛膏", "$319", R.drawable.mascara),
        Content.Product("lativ 純棉條紋衣", "$195", R.drawable.stripe),
        Content.Product("小海豹午安枕", "$798", R.drawable.seal),
        Content.Product("貓咪吐司坐墊", "$155", R.drawable.cat),
        Content.Product("Converse休閒鞋", "$1600", R.drawable.converse),
        Content.Product("牛仔短袖洋裝","$390",R.drawable.dress)
    )


}