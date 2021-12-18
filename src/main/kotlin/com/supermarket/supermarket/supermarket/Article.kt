package com.supermarket.supermarket.supermarket

import javax.persistence.*

@Entity
@Table(name = "Articles")
data class Article(
    var name: String,
    var price: Double,
    var category: Category
) {
    @Id
    @SequenceGenerator(
        name = "article_sequence", sequenceName = "article_sequence", allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "article_sequence")
    val id: Long = 0

    constructor(articleView: ArticleView) : this(articleView.name, articleView.price, articleView.category)

    override fun toString(): String = "Article(id = $id, name = $name, price = $price, category = ${category.category})"

    fun toJson(): String = "{id = $id, name = $name, price = $price, category = ${category.category}}"
}

class ArticleView(var name: String, var price: Double, var category: Category) {

    constructor(article: Article) : this(article.name, article.price, article.category)

    //Code into a sort of JSON object
    override fun toString(): String = "ArticleView(name = $name, price = $price, category = ${category.category})"

    fun toJson(): String = "{name = $name, price = $price, category = ${category.category}}"

}