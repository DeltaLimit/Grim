package ac.grim.grimac.utils.blockdata;

public class WrappedFenceGate extends WrappedDirectional {
    boolean isOpen = false;

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }
}