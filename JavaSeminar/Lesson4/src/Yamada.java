/**
 * �v���C���[���p�������R�c����N���X�B
 */
public class Yamada extends Player
{
	/**
	 * �R���X�g���N�^�B
	 * 
	 * @param name ���O
	 */
	public Yamada(String name)
	{
		// �X�[�p�[�N���X�̃R���X�g���N�^���Ăяo��
		super(name);
	}

	/**
	 * �W�����P���̎���o���B
	 * �X�[�p�[�N���X�̓������\�b�h���I�[�o�[���C�h���Ă���B
	 * 
	 * @return �W�����P���̎�
	 */
	public int showHand()
	{
		// �K���p�[���o��
		return PAPER;
	}
}