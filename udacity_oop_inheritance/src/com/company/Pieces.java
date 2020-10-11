package com.company;


 class Queen extends Piece {
}

class King extends Piece {
}

class Knight extends Piece {
}

class Bishop extends Piece {
}

class Pawn extends Piece {
}

// Super
class Rock extends Piece {

  boolean isValidMove(Position newPosition) {

   // Check super condition
   if (!super.isValidMove(position)) {
    return false;
   }

   // random
   return true;
  }
}
