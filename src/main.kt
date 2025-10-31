fun main() {
    val songs = listOf(
        Song("Bohemian Rapsody", "Queen", 5.55),
        Song("Don’t Stop Me Now", "Queen", 3.30),
        Song("Imagine", "John Lennon", 3.10)
    )

    val album = Album(songs)
    val queenSongs = album.songsByArtist("Queen")

    println(queenSongs)
}