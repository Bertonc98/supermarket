package com.supermarket.supermarket.supermarket

import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
class ArticleConfig {

    @Bean
    fun run(articleRepository: ArticleRepository): CommandLineRunner{
            return CommandLineRunner{
               /* args ->
                    var pringles = Article(
                                        "Pringles",
                                        2.39,
                                        Category.FOOD
                                    );
                    var jacket =    Article(
                                        "Jacket",
                                        15.0,
                                        Category.CLOTHES
                                    );
                    var hp =        Article(
                                        "Harry Potter and The Prisoner of Azkaban",
                                        13.0,
                                        Category.BOOKS
                                    );
                    articleRepository.saveAll(listOf(pringles, jacket, hp))*/
            }
    }
}