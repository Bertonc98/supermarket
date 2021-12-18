package com.supermarket.supermarket.supermarket

import org.hibernate.annotations.common.util.impl.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import org.jboss.logging.Logger

@RestController
@RequestMapping(value = ["api/v1/supermarket"])
class ArticleController @Autowired constructor(private val articleService: ArticleService) {

    private val logger : Logger = LoggerFactory.logger(this::class.java)
    @GetMapping
    fun listArticles(): List<Article> {
        logger.info("Executing listArticles()")
        return articleService.listArticles()
    }

    @PostMapping
    fun newArticle(@RequestBody newArticle : Article) {
        logger.info("Executing newArticle()")
        return articleService.addNewArticle(newArticle)
    }

}