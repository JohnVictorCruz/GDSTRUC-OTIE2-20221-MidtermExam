package MidtermExam;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.ListIterator;


public class CardStack {
    private LinkedList<Card> stack;

    public CardStack() {
        stack = new LinkedList<>();
    }

    public void push(Card card) {
        stack.push(card);
    }

    public Card pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack.pop();
    }

    public Card peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        ListIterator<Card> iterator = stack.listIterator();
        int ctr = 1;

        while (iterator.hasNext()) {
            System.out.println("(" + ctr + ") " + iterator.next());
            ctr++;

        }

    }
    public int countCards() {
        ListIterator<Card> iterator = stack.listIterator();
        int ctr = 0;
        while (iterator.hasNext()) {
            ctr++;
            iterator.next();
        }

        return ctr;
    }
}