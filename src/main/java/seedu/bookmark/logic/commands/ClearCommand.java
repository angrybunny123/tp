package seedu.bookmark.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.bookmark.model.BookList;
import seedu.bookmark.model.Model;

/**
 * Clears the address book.
 */
public class ClearCommand extends Command {

    public static final String COMMAND_WORD = "clear";
    public static final String MESSAGE_SUCCESS = "Address book has been cleared!";


    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.setAddressBook(new BookList());
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
