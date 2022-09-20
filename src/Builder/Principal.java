package Builder;

public class Principal {
	public static void main(String[] args) {
		AlertDialog.Builder builder = new AlertDialog.Builder();
		builder.setTitle("Informação");
		builder.setMessage("Confirma ação?");
		builder.setPositiveButton(new Button("SIM"));
		builder.setNegativeButton(new Button("Não"));
		
		AlertDialog dialog = builder.create();
		dialog.show();
	}
}
