package com.arindom.productgraph.repository

import com.arindom.productgraph.repository.models.Product
import com.arindom.productgraph.repository.models.ProductReview

private val productList = listOf(
    Product(
        "Ice Cream",
        "Ice cream is a sweetened frozen food typically eaten as a snack or dessert. " +
                "It may be made from dairy milk or cream and is flavoured with a sweetener",
        500
    ),
    Product(
        "Marshmello",
        "The word \"marshmallow\" comes from the mallow plant species (Althaea officinalis), " +
                "a herb native to parts of Europe, North Africa, and Asia which grows in marshes and other damp areas. " +
                "The plant's stem and leaves are fleshy and its white flower has five petals. " +
                "It is not known exactly when marshmallows were invented, but their history goes back as early as 2000 BC.",
        1000
    ),
    Product(
        "Peanut Butter",
        "Peanut butter is a food paste or spread made from ground, dry-roasted peanuts." +
                " It often contains additional ingredients that modify the taste or texture, such as salt, sweeteners, or emulsifiers." +
                " Peanut butter is popular in many countries.",
        100
    ),
    Product(
        "Gelato",
        "It is generally made with a base of 3.25% milk and sugar. It is generally lower in fat than other styles of frozen desserts." +
                " Gelato typically contains 70% less air and more flavouring than other kinds of frozen desserts," +
                " giving it a density and richness that distinguishes it from other ice creams.",
        600
    ),
    Product(
        "Budwizer",
        "Budweiser is an American-style pale lager produced by Anheuser-Busch, part of AB InBev. Internationally," +
                " Budweiser may also refer to an unrelated pale lager beer, originating in České Budějovice," +
                " Czech Republic produced by the Budějovický Budvar brewery.",
        800
    ),
    Product(
        "Almonds",
        "Almonds are the edible seeds of Prunus dulcis, more commonly called the almond tree." +
                " They are native to the Middle East, but the US is now the world's largest producer." +
                " The almonds you can buy in stores usually have the shell removed, revealing the edible nut inside.",
        2000
    )
)

private val productReviewQA = listOf(
    ProductReview("Does the product match description?"),
    ProductReview("Delivered on time"),
    ProductReview("Something you want to repair?")
)

fun getProductList() = productList

fun getProductReviewQA() = productReviewQA