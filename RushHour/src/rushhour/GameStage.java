/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rushhour;

import java.util.List;
import libplateau.model.Piece;

/**
 *
 * @author axelb
 */
public class GameStage {
    public GameStage(List<Piece> pieces)
    {
        this.pieces = pieces;
        this.mainPiece = this.pieces.get(0);
    }
    
    public List<Piece> getPieces()
    {
        return pieces;
    }
    
    List<Piece> pieces;
    Piece mainPiece;
}
