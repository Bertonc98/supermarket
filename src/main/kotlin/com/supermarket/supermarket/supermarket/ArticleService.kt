package com.supermarket.supermarket.supermarket

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component


//Used to Autowired, and singleton initialization in Controller for the service. Same as @Service
@Component
class ArticleService {
    private val articleRepository : ArticleRepository ;

    // Dependency injection
    @Autowired
    constructor(articleRepository: ArticleRepository){
        this.articleRepository = articleRepository
    }

    fun listArticles(): List<Article>{
        return articleRepository.findAll()
    }
}