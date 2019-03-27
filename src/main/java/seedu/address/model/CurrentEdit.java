/* @@author thamsimun */
package seedu.address.model;

import seedu.address.logic.commands.Command;
import seedu.address.model.image.Image;

/**
 * The API of the CurrentEdit component.
 */
public interface CurrentEdit {

    void saveAsTemp(Image image);

    void saveAsOriginal(Image image);

    void saveIntoTempFolder(String filename, Image image);

    Image getTempImage();

    void setTempImage();

    void setTempImage(com.sksamuel.scrimage.Image image);

    void setOriginalImage(Image image);

    void displayTempImage();

    void addCommand(Command command);

    void replaceTempWithOriginal();

    String[] getFileNames();

    String saveToAssets(String name);
}
