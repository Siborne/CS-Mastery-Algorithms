package sjjg_cy;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Lesson2_T2 {

	private static class Node {
        String address;
        int data;
        String next;

        private Node(String address, int data, String next) {
            this.address = address;
            this.data = data;
            this.next = next;
        }
    }

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));
    private static String line;
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        while (true) {
            line = reader.readLine();
            if (line == null || line.equals("")) {
                break;
            }
            st = new StringTokenizer(line);
            String head = st.nextToken();
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            Map<String, Node> nodeMap = new HashMap<>();
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(reader.readLine());
                String address = st.nextToken();
                int data = Integer.parseInt(st.nextToken());
                String next = st.nextToken();
                nodeMap.put(address, new Node(address, data, next));
            }

            Node[] nodeArray = new Node[n]; 
            int size = 0; 
            String current = head;

            while (!current.equals("-1")) {
                nodeArray[size++] = nodeMap.get(current);
                current = nodeMap.get(current).next;
            }

            for (int i = 0; i <= size - k; i += k) {
                reverseArray(nodeArray, i, i + k - 1);
            }

            for (int i = 0; i < size; i++) {
                Node node = nodeArray[i];
                String nextAddr = (i == size - 1) ? "-1" : nodeArray[i + 1].address;
                writer.println(node.address + " " + node.data + " " + nextAddr);
            }
        }

        writer.flush();
        writer.close();
        reader.close();
    }

    private static void reverseArray(Node[] array, int start, int end) {
        while (start < end) {
            Node temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

}
