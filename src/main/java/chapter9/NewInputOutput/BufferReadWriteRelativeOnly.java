package chapter9.NewInputOutput;

import java.nio.ByteBuffer;

/**
 * Created by hadeslee on 2017-07-01.
 */
public class BufferReadWriteRelativeOnly {
    public static void main(String[] args) {
        // Create a byte buffer of capacity 8
        ByteBuffer bb = ByteBuffer.allocate(8);
// Print the buffer info
        System.out.println("After creation:");
        printBufferInfo(bb);
// Must call flip() to reset the position to zero because
// the printBufferInfo() method uses relative get() method,
// which increments the position
        bb.flip();
// Populate buffer elements from 50 to 57
        int i = 50;
        while (bb.hasRemaining()) {
            bb.put((byte) i++);
        }
// Call flip() again to reset the position to zero,
// because the above put() call incremented the position
        bb.flip();
// Print the buffer info
        System.out.println("After populating data:");
        printBufferInfo(bb);
    }

    private static void printBufferInfo(ByteBuffer bb) {
        int limit = bb.limit();
        System.out.println("Position = " + bb.position() +
            ", Limit = " + limit);
        // We use absolute method of reading the data, so that we do
// not affect the position of the buffer
        System.out.print("Data: ");
        while (bb.hasRemaining()) {
            System.out.print(bb.get() + " ");
        }
        System.out.println();
    }
}
