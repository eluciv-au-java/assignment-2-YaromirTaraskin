package edu.au.javacourse.input;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class InputReader {

	public static InputTransformation[] read(String fileName) throws IOException {
		return new ObjectMapper().readValue(new File(fileName), InputTransformation[].class);
	}

}
