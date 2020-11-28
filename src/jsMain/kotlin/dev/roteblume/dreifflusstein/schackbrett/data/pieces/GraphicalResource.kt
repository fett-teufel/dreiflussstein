package dev.roteblume.dreifflusstein.schackbrett.data.pieces

enum class GraphicalResource(val url: String) {
    LightSquare(""),
    DarkSquare(""),
    WhiteKing  ("https://upload.wikimedia.org/wikipedia/commons/4/42/Chess_klt45.svg"),
    BlackKing("https://upload.wikimedia.org/wikipedia/commons/f/f0/Chess_kdt45.svg"),
    WhiteQueen("https://upload.wikimedia.org/wikipedia/commons/1/15/Chess_qlt45.svg"),
    BlackQueen("https://upload.wikimedia.org/wikipedia/commons/4/47/Chess_qdt45.svg"),
    WhiteBishop("https://upload.wikimedia.org/wikipedia/commons/b/b1/Chess_blt45.svg"),
    BlackBishop("https://upload.wikimedia.org/wikipedia/commons/9/98/Chess_bdt45.svg"),
    WhiteKnight("https://upload.wikimedia.org/wikipedia/commons/7/70/Chess_nlt45.svg"),
    BlackKnight("https://upload.wikimedia.org/wikipedia/commons/e/ef/Chess_ndt45.svg"),
    WhiteRook("https://upload.wikimedia.org/wikipedia/commons/7/72/Chess_rlt45.svg"),
    BlackRook("https://upload.wikimedia.org/wikipedia/commons/f/ff/Chess_rdt45.svg"),
    WhitePawn("https://upload.wikimedia.org/wikipedia/commons/4/45/Chess_plt45.svg"),
    BlackPawn("https://upload.wikimedia.org/wikipedia/commons/c/c7/Chess_pdt45.svg")

}
enum class PieceResource(private val white: GraphicalResource, private val black: GraphicalResource) {
    Kings(GraphicalResource.WhiteKing, GraphicalResource.BlackKing),
    Queens(GraphicalResource.WhiteQueen, GraphicalResource.BlackQueen),
    Bishops(GraphicalResource.WhiteBishop, GraphicalResource.BlackBishop),
    Knights(GraphicalResource.WhiteKnight, GraphicalResource.BlackKnight),
    Rooks(GraphicalResource.WhiteRook, GraphicalResource.BlackRook),
    Pawns(GraphicalResource.WhitePawn, GraphicalResource.BlackPawn),
    Square(GraphicalResource.LightSquare, GraphicalResource.DarkSquare);

    fun bySide(side: Boolean) = if (side) white else black
}
