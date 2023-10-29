public class UIComponentCreatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UIComponentCreator ui[] = new UIComponentCreator[3];
		
		ui[0] = new WindowsUIComponentCreator();
		ui[1] = new LinuxUIComponentCreator();
		ui[2] = new MacUIComponentCreator();
		
		String components[] = {"button", "TextField", "CheckBox"};
		
		for(int i=0; i<ui.length; i++) {
			ui[i].show(components[i]);
			System.out.println();
		}
	}
}
