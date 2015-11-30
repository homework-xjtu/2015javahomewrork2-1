package cn.edu.xjtu.se.jackq.simpleui;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UIStateManager {
    private static final String FILE_NAME = "output";

    private UIStateManager() {
    }

    public void saveState(Iterable<IUIStateSavable> iterable) {
        try (FileWriter fileWriter = new FileWriter(FILE_NAME)) {
            for (IUIStateSavable element : iterable) {
                appendElementState(element, fileWriter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void loadState(Iterable<IUIStateSavable> iterable) {
        try (FileReader fileReader = new FileReader(FILE_NAME)) {
            for (IUIStateSavable element : iterable) {
                loadElementState(element, fileReader);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void appendElementState(IUIStateSavable element, FileWriter writer) throws IOException {
        String state = element.getStateString();
        writer.write(state);
        writer.append('\n');
        writer.flush();
    }

    private void loadElementState(IUIStateSavable element, FileReader reader) throws IOException {

        char ch;
        StringBuilder stringBuilder = new StringBuilder();
        do {
            ch = (char) reader.read();
            stringBuilder.append(ch);
        } while (ch != '\n');
        element.loadStateFromString(stringBuilder.substring(0, stringBuilder.length() - 1));
    }

    private static UIStateManager instance = new UIStateManager();

    public static UIStateManager get() {
        return instance;
    }
}
