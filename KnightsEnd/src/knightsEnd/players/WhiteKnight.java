package knightsEnd.players;

// TODO: Auto-generated Javadoc
/**
 * The Class WhiteKnight. This is a subclass of the class Knight. It adds on
 * specific details that the WhiteKnight is unique to such as its moves and
 * information
 */
public class WhiteKnight extends Knight {

	/** The role. */
	protected String role = "White Knight";

	/** The signature move. */
	protected String signatureMove = "Holy Strike";

	/** The finisher move. */
	protected String finisherMove = "Holy Hand Grenade";

	/**
	 * Instantiates a new white knight. Overloaded constructor that adds unique
	 * information about the White Knight
	 */
	public WhiteKnight() {
		super(); // calls parent method
		this.name = "White Knight";
		this.weapon = "Excalibur";
		this.alignment = "Good";
		this.playerQuote = "All for one and one for all!";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object other) {

		boolean result;

		// is the object not null and is it of the same type as this class
		if ((other == null) || (this.getClass() != other.getClass())) {
			result = false;
		} else {
			Knight otherKnight = (Knight) other;
			result = this.role.equals(otherKnight.role) ? true : false;
		}

		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see knightsEnd.players.Knight#finisherMove(int)
	 */
	@Override
	public String finisherMove(int moveSuccess) {

		String moveResults = "Unknown";

		switch (moveSuccess) {
		case 1:
		case 2:
		case 3:
			moveResults = "That was a pretty weak Holy Hand Grenade...";
			break;
		case 4:
		case 5:
		case 6:
		case 7:
			moveResults = "Hey, that was a decent Holy Hand Grenade...";
			break;
		case 8:
		case 9:
		case 10:
			moveResults = "Wow, that Holy Hand Grenade delivered a critical hit!!!";
			break;
		default:
			moveResults = "Something is wrong with the Holy Hand Grenade";
		}

		return moveResults;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see knightsEnd.players.Knight#getFinisherMove()
	 */
	public String getFinisherMove() {
		return finisherMove;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see knightsEnd.players.Knight#getSignatureMove()
	 */
	public String getSignatureMove() {
		return signatureMove;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see knightsEnd.players.Knight#setFinisherMove(java.lang.String)
	 */
	public void setFinisherMove(String finisherMove) {
		this.finisherMove = finisherMove;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see knightsEnd.players.Knight#setSignatureMove(java.lang.String)
	 */
	public void setSignatureMove(String signatureMove) {
		this.signatureMove = signatureMove;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see knightsEnd.players.Knight#signatureMove(int)
	 */
	@Override
	public String signatureMove(int moveSuccess) {

		String moveResults = "Unknown";

		switch (moveSuccess) {
		case 1:
		case 2:
		case 3:
			moveResults = "That was a pretty weak Holy Strike...";
			break;
		case 4:
		case 5:
		case 6:
		case 7:
			moveResults = "Hey, that was a decent Holy Strike...";
			break;
		case 8:
		case 9:
		case 10:
			moveResults = "Wow, that Holy Strike delivered a critical hit!!!";
			break;
		default:
			moveResults = "Something is wrong with the Holy Strike";
		}

		return moveResults;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.role;
	}

}
