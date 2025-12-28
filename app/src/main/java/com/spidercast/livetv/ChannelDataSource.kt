package com.spidercast.livetv

object ChannelDataSource {
    fun getSampleChannels(): List<TVChannel> {
        return listOf(
            TVChannel(
                id = 1,
                name = "Big Buck Bunny",
                streamUrl = "https://test-streams.mux.dev/x36xhzz/x36xhzz.m3u8",
                category = "Demo"
            ),
            TVChannel(
                id = 2,
                name = "Tears of Steel",
                streamUrl = "https://demo.unified-streaming.com/k8s/features/stable/video/tears-of-steel/tears-of-steel.ism/.m3u8",
                category = "Demo"
            ),
            TVChannel(
                id = 3,
                name = "Sintel",
                streamUrl = "https://bitdash-a.akamaihd.net/content/sintel/hls/playlist.m3u8",
                category = "Demo"
            ),
            TVChannel(
                id = 4,
                name = "Apple Test Stream",
                streamUrl = "https://devstreaming-cdn.apple.com/videos/streaming/examples/img_bipbop_adv_example_fmp4/master.m3u8",
                category = "Demo"
            ),
            TVChannel(
                id = 5,
                name = "VOA Africa",
                streamUrl = "https://voa-lh.akamaihd.net/i/voa_mpls_tvmc6@320298/master.m3u8",
                category = "News"
            )
        )
    }
}
