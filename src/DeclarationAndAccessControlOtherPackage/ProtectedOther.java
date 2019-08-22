package DeclarationAndAccessControlOtherPackage;
import DeclarationAndAccessControl.ProtectedParent;

public class ProtectedOther extends ProtectedParent{
	public void classInheritence() {
		System.out.println("x is"+x);
	}
	
	public void classReference() {
		ProtectedParent pp = new ProtectedParent();
		System.out.println("x is"+pp.x);
	}
	
	public void localVariableAccessModifier() {
		private int x=8;
	}
}
