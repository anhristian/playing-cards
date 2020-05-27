package edu.cnm.deepdive;

public enum Suit {

  CLUBS, DIAMONDS, HEARTS, SPEADES;

  public char symbol() {
    switch (this) {
      case CLUBS:
        return '\u2663';
      case DIAMONDS:
        return '\u2662';
      case HEARTS:
        return '\u2661';
      default:
        return 0;
    
    }
  }
}