import java.awt.Color;

public interface DrawingButtonClickEvent {
	void onColorChanged(Color color);
	void onErase();
	void onClear();	
}
