package ross.dario.persistence.entity;

public class CustomErrorType extends AbstractEntity {
	private String errorMessage;

	public CustomErrorType(final String errorMessage) {
		this.errorMessage = errorMessage;
	}

//	@Override
	public String getErrorMessage() {
		return errorMessage;
	}
}
