package com.supermarket.supermarket.supermarket

import javax.persistence.*

@Entity
@Table
class Article {
    @Id
    @SequenceGenerator(
        name = "article_sequence",
        sequenceName = "article_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "article_sequence"
    )
    var id : Int
    var name: String;
    var price: Double = 0.0;
    var category: Category;

    constructor(id: Int, name: String, price: Double, category: Category) {
        this.id = id
        this.name = name
        this.price = price
        this.category = category
    }



    //Code into a sort of JSON object
    override fun toString(): String {
        return "Article{" +
                    "id = " + id +
                    ", name = '" + name + "\'" +
                    ", price = " + price +
                    ", category = " + category.category +
                "}"
    }


}