public abstract class UIComponentCreator {
	
	public void show(String type) {
		UIComponent comp = createUIComponent(type);
		add(comp);
	}
	
	public void add(UIComponent component) {
		System.out.println("Added the omponent\t" + component.getClass().getName());
	}
	
	public abstract UIComponent createUIComponent(String type);
}
