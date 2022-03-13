package com.example.myapplication.Mytube

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.example.myapplication.OutStagram.MasterApplication
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_my_tube.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MyTubeActivity(): AppCompatActivity() {

    lateinit var glide : RequestManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_tube)

        (application as MasterApplication).service.getYoutubeList().enqueue(
            object : Callback<ArrayList<Mytube>> {
                override fun onResponse(
                    call: Call<ArrayList<Mytube>>,
                    response: Response<ArrayList<Mytube>>
                ) {
                    if (response.isSuccessful) {
                        glide = Glide.with(this@MyTubeActivity)
                        val mytubeList = response.body()
                        val adapter = MyTubeAdapter(
                            mytubeList!!,
                            LayoutInflater.from(this@MyTubeActivity),
                            glide,
                            this@MyTubeActivity
                        )
                        mytube_list_recycler.adapter = adapter
                    }
                }

                override fun onFailure(call: Call<ArrayList<Mytube>>, t: Throwable) {
                }
            }
        )
    }
}

class MyTubeAdapter(
    var mytubeList: ArrayList<Mytube>,
    val inflater: LayoutInflater,
    val glide: RequestManager,
    val activity: Activity
) : RecyclerView.Adapter<MyTubeAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title : TextView
        val thumbnail : ImageView
        val content : TextView

        init {
            title = itemView.findViewById(R.id.mytube_title)
            thumbnail = itemView.findViewById(R.id.mytube_thumbnail)
            content = itemView.findViewById(R.id.mytube_content)

            itemView.setOnClickListener {
                val position: Int = adapterPosition
                val intent = Intent(activity, MytubeDetailActivity::class.java)
                intent.putExtra("video_url", mytubeList.get(position).video)
                activity.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = inflater.inflate(R.layout.mytube_item_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.setText(mytubeList.get(position).title)
        holder.content.setText(mytubeList.get(position).content)
        glide.load(mytubeList.get(position).thumbnail).into(holder.thumbnail)
    }

    override fun getItemCount(): Int {
        return mytubeList.size
    }
}