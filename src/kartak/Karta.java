package kartak;

public abstract class Karta {
	protected String izena;
	protected String path;
	protected abstract void setPath();
	public String getPath() {
		return this.path;
	}
	public void setIzena() {
		this.izena = this.getClass().getName().split("kartak.")[1];
	}
	public String getIzena() {
		return this.izena;
	}
}
