
    /* Mahjong has 144 cards, consisting of the three main suits, which are, ten thousands, sticks, and cirlces.
    There are also winds, dragons, flowers, and seasons.
    There are 4 1-9 cards for the three main suits, four of each of the four winds, four of each of the three dragons,
    four flowers, and four seasons.
     */


    import javax.swing.*;
    import java.util.ArrayList;

    public class MahjongDeck {
        private MahjongTile[] tiles;
        private int tilesInDeck;

        public MahjongDeck() {
            tiles = new MahjongTile[144]; // 144 tiles in a deck
        }
        public void resetDeck(){

            MahjongTile.Suit[] suits = MahjongTile.Suit.values();
            MahjongTile.Value[] values = MahjongTile.Value.values();
            tilesInDeck = 0;

            // 1-9 for the three main suits
            for(int i = 0; i<3; i++){ // tenThousand, stick, circle in the enumeration of suits
                MahjongTile.Suit suit = suits[i];

                for(int j = 0;j <9; j++){ // 1-9 in the enumeration of values
                    tiles[tilesInDeck++] = new MahjongTile(suit, MahjongTile.Value.getValue(j)); // 4 of each of the 1-9 cards
                    tiles[tilesInDeck++] = new MahjongTile(suit, MahjongTile.Value.getValue(j));
                    tiles[tilesInDeck++] = new MahjongTile(suit, MahjongTile.Value.getValue(j));
                    tiles[tilesInDeck++] = new MahjongTile(suit, MahjongTile.Value.getValue(j));
                }
            }

            // winds
            for(int i = 0; i<4; i++){
                tiles[tilesInDeck++] = new MahjongTile(suits[3], values[i+10]); // 4 of each of the four winds
                tiles[tilesInDeck++] = new MahjongTile(suits[3], values[i+10]);
                tiles[tilesInDeck++] = new MahjongTile(suits[3], values[i+10]);
                tiles[tilesInDeck++] = new MahjongTile(suits[3], values[i+10]);
            }

            // dragons
            for(int i = 0; i<3; i++){
                tiles[tilesInDeck++] = new MahjongTile(suits[4], values[i+14]); // 4 of each of the three dragons
                tiles[tilesInDeck++] = new MahjongTile(suits[4], values[i+14]);
                tiles[tilesInDeck++] = new MahjongTile(suits[4], values[i+14]);
                tiles[tilesInDeck++] = new MahjongTile(suits[4], values[i+14]);
            }

            // flowers
            for(int i = 0; i<4; i++){
                tiles[tilesInDeck++] = new MahjongTile(suits[5], values[i+17]); // 1 of each of the four flowers
            }

            // seasons
            for(int i = 0; i<4; i++){
                tiles[tilesInDeck++] = new MahjongTile(suits[6], values[i+21]); // 1 of each of the four seasons
            }
        }
        public boolean isEmpty(){
            return tilesInDeck == 0;
        }

        public void shuffle(){
            for(int i = 0;i<tiles.length;i++){
                int randomIndex = (int)(Math.random()*tiles.length);
                MahjongTile temp = tiles[i];
                tiles[i] = tiles[randomIndex];
                tiles[randomIndex] = temp;
            }
        }
        // draw a card from the deck
        public MahjongTile drawTile() throws IllegalArgumentException{
            if(isEmpty()){
                throw new IllegalArgumentException("Deck is empty");
            }
            return tiles[--tilesInDeck];
        }

        public MahjongTile drewFlowerSeason{
            MahjongTile[] temp = new MahjongTile[tiles.length-1];
            int length = temp.length;
            MahjongTile replacement = temp[length-1];
            // fix this
        }


        /*
        // top card of the deck
        public ImageIcon drawTileImage() throws IllegalArgumentException{
            if(isEmpty()){
                throw new IllegalArgumentException("Deck is empty");
            }
            return new ImageIcon(tiles(--tilesInDeck).toString()) + ".png";
        }
        */
    }
