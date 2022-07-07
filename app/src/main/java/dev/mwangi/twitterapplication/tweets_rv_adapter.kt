package dev.mwangi.twitterapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class tweets_rv_adapter(var tweetsList:List<Twitter>):RecyclerView.Adapter<TweetsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetsViewHolder {
        var itemView= LayoutInflater.from(parent.context)
            .inflate(R.layout.tweets_item,parent,false)
        return TweetsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TweetsViewHolder, position: Int) {
        var currentTweet=tweetsList.get(position)
        holder.tvName.text=currentTweet.name
        holder.tvTweet.text=currentTweet.tweet
        holder.tvComment.text=currentTweet.comment
        holder.tvFavourites.text=currentTweet.favourites
        holder.tvRetweet.text=currentTweet.retweet

    }

    override fun getItemCount(): Int {
        return tweetsList.size
    }
}
class TweetsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var imgAvatar=itemView.findViewById<ImageView>(R.id.imgAvatar)
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvTweet=itemView.findViewById<TextView>(R.id.tvTweet)
    var imgComment=itemView.findViewById<ImageView>(R.id.imgComment)
    var tvComment=itemView.findViewById<TextView>(R.id.tvComments)
    var imgRetweet=itemView.findViewById<ImageView>(R.id.imgRetweet)
    var tvRetweet=itemView.findViewById<TextView>(R.id.tvRetweet)
    var imgFavourites=itemView.findViewById<ImageView>(R.id.imgFavourites)
    var tvFavourites=itemView.findViewById<TextView>(R.id.tvFavourites)
    var imgShare=itemView.findViewById<ImageView>(R.id.imgShare)
}