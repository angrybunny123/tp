package seedu.bookmark.testutil;

import static seedu.bookmark.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.bookmark.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.bookmark.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.bookmark.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.bookmark.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.bookmark.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.bookmark.logic.commands.CommandTestUtil.VALID_TAG_FRIEND;
import static seedu.bookmark.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.bookmark.model.BookList;
import seedu.bookmark.model.person.Book;

/**
 * A utility class containing a list of {@code Person} objects to be used in tests.
 */
public class TypicalPersons {

    public static final Book ALICE = new PersonBuilder().withName("Alice Pauline")
            .withEmail("alice@example.com")
            .withPhone("94351253")
            .withTags("friends").build();
    public static final Book BENSON = new PersonBuilder().withName("Benson Meier")
            .withEmail("johnd@example.com").withPhone("98765432")
            .withTags("owesMoney", "friends").build();
    public static final Book CARL = new PersonBuilder().withName("Carl Kurz").withPhone("95352563")
            .withEmail("heinz@example.com").build();
    public static final Book DANIEL = new PersonBuilder().withName("Daniel Meier").withPhone("87652533")
            .withEmail("cornelia@example.com").withTags("friends").build();
    public static final Book ELLE = new PersonBuilder().withName("Elle Meyer").withPhone("9482224")
            .withEmail("werner@example.com").build();
    public static final Book FIONA = new PersonBuilder().withName("Fiona Kunz").withPhone("9482427")
            .withEmail("lydia@example.com").build();
    public static final Book GEORGE = new PersonBuilder().withName("George Best").withPhone("9482442")
            .withEmail("anna@example.com").build();

    // Manually added
    public static final Book HOON = new PersonBuilder().withName("Hoon Meier").withPhone("8482424")
            .withEmail("stefan@example.com").build();
    public static final Book IDA = new PersonBuilder().withName("Ida Mueller").withPhone("8482131")
            .withEmail("hans@example.com").build();

    // Manually added - Person's details found in {@code CommandTestUtil}
    public static final Book AMY = new PersonBuilder().withName(VALID_NAME_AMY).withPhone(VALID_PHONE_AMY)
            .withEmail(VALID_EMAIL_AMY).withTags(VALID_TAG_FRIEND).build();
    public static final Book BOB = new PersonBuilder().withName(VALID_NAME_BOB).withPhone(VALID_PHONE_BOB)
            .withEmail(VALID_EMAIL_BOB).withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND)
            .build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalPersons() {} // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical persons.
     */
    public static BookList getTypicalAddressBook() {
        BookList ab = new BookList();
        for (Book book : getTypicalPersons()) {
            ab.addPerson(book);
        }
        return ab;
    }

    public static List<Book> getTypicalPersons() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}
