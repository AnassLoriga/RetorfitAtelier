package com.example.retrofitatelier.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitatelier.R
import com.example.retrofitatelier.data.model.Post

class PostAdapter(private val posts: List<Post>) :
    RecyclerView.Adapter<PostAdapter.PostViewHolder>() {

    class PostViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.postTitle)
        val body: TextView = view.findViewById(R.id.postBody)
        val userId: TextView = view.findViewById(R.id.postUserId)
        val postId: TextView = view.findViewById(R.id.postId)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_post, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val post = posts[position]
        holder.title.text = post.title
        holder.body.text = post.body
        holder.userId.text = "User ID: ${post.userId}"
        holder.postId.text = "Post ID: ${post.id}"
    }

    override fun getItemCount(): Int = posts.size
}