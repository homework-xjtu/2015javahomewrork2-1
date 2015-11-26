package cn.edu.xjtu.se.jackq.simpleui;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UiStateManager {
    private static final String FILE_NAME = "output";

    private UiStateManager() {
    }

    public void saveState(Iterable<IUiStateSavable> iterable) {
        try (FileWriter fileWriter = new FileWriter(FILE_NAME)) {
            for (IUiStateSavable element : iterable) {
                appendElementState(element, fileWriter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void loadState(Iterable<IUiStateSavable> iterable) {
        try (FileReader fileReader = new FileReader(FILE_NAME)) {
            for (IUiStateSavable element : iterable) {
                loadElementState(element, fileReader);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void appendElementState(IUiStateSavable element, FileWriter writer) throws IOException {
        String state = element.getStateString();
        writer.write(state);
        writer.append('\n');
        writer.flush();
    }

    private void loadElementState(IUiStateSavable element, FileReader reader) throws IOException {

        char ch;
        StringBuilder stringBuilder = new StringBuilder();
        do {
            ch = (char) reader.read();
            stringBuilder.append(ch);
        } while (ch != '\n');
        element.loadStateFromString(stringBuilder.substring(0, stringBuilder.length() - 1));
    }

    private static UiStateManager instance = new UiStateManager();

    public static UiStateManager get() {
        return instance;
    }
}
