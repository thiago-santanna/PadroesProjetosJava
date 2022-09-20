package Builder;

public class AlertDialog {
	private String title;
	private String message;
	private Button positiveButton;
	private Button negativeButton;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Button getPositiveButton() {
		return positiveButton;
	}
	public void setPositiveButton(Button positiveButton) {
		this.positiveButton = positiveButton;
	}
	public Button getNegativeButton() {
		return negativeButton;
	}
	public void setNegativeButton(Button negativeButton) {
		this.negativeButton = negativeButton;
	}
	
	public AlertDialog() {
		// TODO Auto-generated constructor stub
	}
	
	public void show() {
		System.out.println(this.title);
		System.out.println(this.message);
		System.out.println(this.positiveButton.getName());
		System.out.println(this.negativeButton.getName());
		System.out.println("PopUp Alert dialog");
	}
	
	static class Builder {
		private AlertDialog dialog;
		
		public Builder() {
			this.dialog = new AlertDialog();
		}
		
		public void setTitle(String title) {
			dialog.setTitle(title);
		}
		
		public void setMessage(String message) {
			dialog.setMessage(message);
		}
		
		public void setPositiveButton(Button positiveButton) {
			dialog.setPositiveButton(positiveButton);
		}
		
		public void setNegativeButton(Button negativeButton) {
			dialog.setNegativeButton(negativeButton);
		}
		
		public AlertDialog create() {
			return dialog;
		}
	}

}
