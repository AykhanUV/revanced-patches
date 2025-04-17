package app.revanced.extension.youtube.swipecontrols.misc

/**
 * Interface for all overlays for swipe controls
 */
interface SwipeControlsOverlay {
    /**
     * called when the currently set volume level was changed
     *
     * @param newVolume the new volume level
     * @param maximumVolume the maximum volume index
     */
    fun onVolumeChanged(newVolume: Int, maximumVolume: Int)

    /**
     * called when the currently set screen brightness was changed
     *
     * @param brightness the new screen brightness, in percent (range 0.0 - 100.0)
     */
    fun onBrightnessChanged(brightness: Double)

    /**
     * called when the playback speed was changed
     *
     * @param speed the new playback speed
     */
    fun onSpeedChanged(speed: Float)

    /**
     * called when the seekbar position was changed
     *
     * @param seekAmount the seek amount
     */
    fun onSeekChanged(seekAmount: Int)

    /**
     * called when a new swipe-session has started
     */
    fun onEnterSwipeSession()
}
