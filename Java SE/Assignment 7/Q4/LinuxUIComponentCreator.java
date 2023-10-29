public class LinuxUIComponentCreator extends UIComponentCreator {

	public UIComponent createUIComponent(String type) {
		// TODO Auto-generated method stub
		switch(type.toLowerCase()) {
			case "button": return new Button(); 
			case "textfield": return new TextField(); 
			case "checkbox": return new CheckBox();
			default : return null;
		}		
	}
}
