package com.example.retrofitatelier.data.service

import com.example.retrofitatelier.data.model.Post
import retrofit2.http.*

interface ApiService {
    @GET("posts")
    suspend fun getPosts(): List<Post>

    @GET("posts/{id}")
    suspend fun getPostById(@Path("id") postId: Int): Post

    @POST("posts")
    suspend fun createPost(@Body post: Post): Post
}