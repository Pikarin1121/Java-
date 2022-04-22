package enumpractice;

public enum Dessert {
//	�l�i���w��
	APPLE(100) {
		void advertise() {
			System.out.println("�^���Ԃȃ����S��" + getPrice() + "�~�I");
		}
	},

	ICE_CREAM(200) {
		void advertise() {
			System.out.println("�Ăɂ҂�����̃A�C�X�N���[����" + getPrice() + "�~�I");
		}
	},

	CAKE(300) {
		void advertise() {
			System.out.println("�݂�ȑ�D���Â��P�[�L��" + getPrice() + "�~�I");
		}
	},
	;

//	�l�i��ێ�����t�B�[���h
	private int price;

//	�R���X�g���N�^�ǉ�
	private Dessert(int price) {
		this.price = price;
	}

//	�l�i���擾���郁�\�b�h
	public int getPrice() {
		return price;
	}

//	��`������o�͂��钊�ۃ��\�b�h
	abstract void advertise();
}
