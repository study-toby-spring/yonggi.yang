package com.learning.template;

import java.io.BufferedReader;
import java.io.IOException;

public interface BufferdReaderCallback {
    Integer doSomethingWithReader(BufferedReader br) throws IOException;
}
