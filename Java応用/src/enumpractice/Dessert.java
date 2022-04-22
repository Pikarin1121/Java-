package enumpractice;

public enum Dessert {
//	値段を指定
	APPLE(100) {
		void advertise() {
			System.out.println("真っ赤なリンゴが" + getPrice() + "円！");
		}
	},

	ICE_CREAM(200) {
		void advertise() {
			System.out.println("夏にぴったりのアイスクリームが" + getPrice() + "円！");
		}
	},

	CAKE(300) {
		void advertise() {
			System.out.println("みんな大好き甘いケーキが" + getPrice() + "円！");
		}
	},
	;

//	値段を保持するフィールド
	private int price;

//	コンストラクタ追加
	private Dessert(int price) {
		this.price = price;
	}

//	値段を取得するメソッド
	public int getPrice() {
		return price;
	}

//	宣伝文句を出力する抽象メソッド
	abstract void advertise();
}
