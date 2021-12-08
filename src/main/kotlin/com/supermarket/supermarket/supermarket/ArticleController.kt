package com.supermarket.supermarket.supermarket

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = arrayOf("api/v1/supermarket/"))
class ArticleController {

    private final var articleService : ArticleService

    @Autowired
    constructor(articleService: ArticleService) {
        this.articleService = articleService
    }

    @GetMapping
    fun listArticles(): List<Article>{
        return articleService.listArticles()
    }
}