package com.arindom.productgraph.repository

import com.arindom.productgraph.repository.models.Department
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

private val arrivingDepartmentList = listOf(
    Department(
        android.R.drawable.star_on,
        1002,
        "Deli",
        5
    ), Department(
        android.R.drawable.star_on,
        1002,
        "Bakery",
        4
    ), Department(
        android.R.drawable.star_on,
        1003,
        "Drugs",
        7
    ), Department(
        android.R.drawable.star_on,
        1004,
        "Meat",
        10
    ), Department(
        android.R.drawable.star_on,
        1005,
        "Grocery",
        0
    ), Department(
        android.R.drawable.star_on,
        1006,
        "Cosmetics",
        8
    ), Department(
        android.R.drawable.star_on,
        1006,
        "Body care",
        2
    ), Department(
        android.R.drawable.star_on,
        1007,
        "Garments",
        9
    ), Department(
        android.R.drawable.star_on,
        1008,
        "Home Decor",
        5
    ), Department(
        android.R.drawable.star_on,
        1009,
        "Bathroom",
        4
    ), Department(
        android.R.drawable.star_on,
        1010,
        "Wardrobe",
        1
    ), Department(
        android.R.drawable.star_on,
        1011,
        "Kitchen",
        2
    ), Department(
        android.R.drawable.star_on,
        1012,
        "Cleaning",
        8
    )
)

private val reviewDepartmentList = listOf(
    Department(
        android.R.drawable.star_on,
        1002,
        "Deli",
        review = 5
    ), Department(
        android.R.drawable.star_on,
        1002,
        "Bakery",
        review = 4
    ), Department(
        android.R.drawable.star_on,
        1003,
        "Drugs",
        review = 7
    ), Department(
        android.R.drawable.star_on,
        1004,
        "Meat",
        review = 10
    ), Department(
        android.R.drawable.star_on,
        1005,
        "Grocery",
        review = 0
    ), Department(
        android.R.drawable.star_on,
        1006,
        "Cosmetics",
        review = 8
    ), Department(
        android.R.drawable.star_on,
        1006,
        "Body care",
        review = 2
    ), Department(
        android.R.drawable.star_on,
        1007,
        "Garments",
        review = 9
    ), Department(
        android.R.drawable.star_on,
        1008,
        "Home Decor",
        review = 5
    ), Department(
        android.R.drawable.star_on,
        1009,
        "Bathroom",
        review = 4
    ), Department(
        android.R.drawable.star_on,
        1010,
        "Wardrobe",
        review = 1
    ), Department(
        android.R.drawable.star_on,
        1011,
        "Kitchen",
        review = 2
    ), Department(
        android.R.drawable.star_on,
        1012,
        "Cleaning",
        review = 8
    )
)


fun getProductList() = productList

fun getProductReviewQA() = productReviewQA

fun getArrivingDepartmentList() = arrivingDepartmentList

fun getReviewDepartmentList() = reviewDepartmentList