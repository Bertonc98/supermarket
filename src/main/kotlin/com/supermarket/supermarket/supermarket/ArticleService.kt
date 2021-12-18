package com.supermarket.supermarket.supermarket

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

//Used to Autowired, and singleton initialization in Controller for the service. Same as @Service
@Component
class ArticleService @Autowired constructor(private val articleRepository: ArticleRepository) {

    fun listArticles(): List<Article> {
        return articleRepository.findAll()
    }

    fun addNewArticle(newArticle: Article) {
        articleRepository.save(newArticle)
        println(newArticle)
        println("Saved!")
    }
}