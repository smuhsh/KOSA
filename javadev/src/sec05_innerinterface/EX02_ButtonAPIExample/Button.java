package sec05_innerinterface.EX02_ButtonAPIExample;

public class Button {
	OnClickListener ocl;
	void setOnclickListener (OnClickListener ocl) {
		this.ocl = ocl;
	}
	public interface OnClickListener {
		public abstract void onClick();
	}
	void onClick() {
		ocl.onClick();
	}

}
