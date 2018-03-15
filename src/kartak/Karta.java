package kartak;

public abstract class Karta {
	protected String izena;
	protected String path;
	protected abstract void setPath();
	public String getPath() {
		return this.path;
	}
}
