package dev.mwangi.twitterapplication

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import dev.mwangi.twitterapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweet()
    }
    fun displayTweet(){
        var tweet=Twitter("","Fenamenal  @thee_Fenamenal  3d" ,"Life is for the living.Stop stressing young blood"," ","12"," ","15"," ","7"," ")
        var tweet1=Twitter("","Caroline  Mutoko @mutoko_caroline  4hrs" ,"I didn't stutter I said what I said"," ","700"," ","400"," ","650"," ")
        var tweet2=Twitter("","DogoRichie  @dogo 1d " ,"If we all deserve better who gets the worse?"," ","2"," ","77"," ","20"," ")
        var tweet3=Twitter("","Nyambuzi  @nyambuzi_selfmade  12hrs" ,"Life is for the living.Stop stressing young blood"," ","12"," ","15"," ","7"," ")
        var tweet4=Twitter("","Scar Mkadinali  @wrongrende  4d" ,"Manz i made it bila kucheza loto"," ","1000"," ","500"," ","800"," ")
        var tweet5=Twitter("","Scar Mkadinali  @wrongrende  4d" ,"Manz i made it bila kucheza loto"," ","1000"," ","500"," ","800"," ")
        var tweet6=Twitter("","Fenamenal  @thee_Fenamenal  3d" ,"Life is for the living.Stop stressing young blood"," ","12"," ","15"," ","7"," ")




        var tweetsList= listOf(tweet,tweet1,tweet2,tweet3,tweet4,tweet5,tweet6)
        var tweetsAdapter=tweets_rv_adapter(tweetsList)
        binding.rvTweets.layoutManager= LinearLayoutManager(this)
        binding.rvTweets.adapter=tweetsAdapter



    }
}