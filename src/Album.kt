class Album(val songs: List<Song>) : Music {
    //First, add a method to the Album class to return only songs by a particular artist on the album.
    fun songsByArtist(artist: String): List<Song> {
        return songs.filter { it.artist == artist }
    }
}