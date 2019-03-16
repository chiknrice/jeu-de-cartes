package org.chiknrice.jdc

enum class Rank { ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING }

enum class SUIT { SPADE, HEART, CLUB, DIAMOND }

class Card(val rank: Rank, val suit: SUIT)