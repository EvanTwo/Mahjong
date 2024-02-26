public class MahjongTile {
    enum Suit
        {
            tenThousand, stick, circle, wind, dragon, flower, season; //萬、索、筒、風、龍、花、季
            private static final Suit[] suits = Suit.values();
            public static Suit getSuit(int i){
                return Suit.suits[i];
            }
        }
    enum Value
        {
            One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, East, South, West, North, Red, Green, White, Spring, Summer, Autumn, Winter, Plum, Orchid, Bamboo, Chrysanthemum;
            private static final Value[] values = Value.values();
            public static Value getSuit(int i){
                return Value.values[i];
            }


            public static Value getValue(int j) {
            }
        }

    private final Suit suit;
    private final Value value;

    public MahjongTile(final Suit suit, final Value value){
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public Value getValue(){
        return this.value;
    }

    public String toString(){
        return suit + "_" + value;
    }
}
