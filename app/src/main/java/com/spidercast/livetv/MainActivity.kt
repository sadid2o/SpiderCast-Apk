package com.spidercast.livetv

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var channelAdapter: ChannelAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupRecyclerView()
        loadChannels()
    }

    private fun setupRecyclerView() {
        recyclerView = findViewById(R.id.channelsRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun loadChannels() {
        val channels = ChannelDataSource.getSampleChannels()
        channelAdapter = ChannelAdapter(channels) { channel ->
            playChannel(channel)
        }
        recyclerView.adapter = channelAdapter
    }

    private fun playChannel(channel: TVChannel) {
        val intent = Intent(this, VideoPlayerActivity::class.java).apply {
            putExtra("CHANNEL_NAME", channel.name)
            putExtra("STREAM_URL", channel.streamUrl)
        }
        startActivity(intent)
    }
}
