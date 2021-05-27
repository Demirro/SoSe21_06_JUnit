package de.uk.java;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TestCases {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@DisplayName("reverse(string)")
	@Nested
	class reverse {
		@Test
		void testStringUtilsReverseNull() {
			assertNull(StringUtils.reverse(null));
		}

		@Test
		void testStringUtilsReverseNonNull() {
			assertEquals("ollaH", StringUtils.reverse("Hallo"));
		}

		@Test
		void testStringUtilsReverseEmptyString() {
			assertEquals("", StringUtils.reverse(""));
		}
	}

	@DisplayName("stripVowels(string)")
	@Nested
	class stripVowels {
		@Test
		void testStringUtilsStripVowelsNonNull() {
			assertEquals("rschlnsllbrchstllnvrrschr",
					StringUtils.stripVowels("Eierschalensollbruchstellenverursacher"));
		}
		
		@Test
		void testStringUtilsStripVowelsNull() {
			assertNull(StringUtils.stripVowels(null));
		}
		
		@Test
		void testStringUtilsStripVowelsEmptyString() {
			assertEquals("", StringUtils.stripVowels(""));
		}
	}
	@DisplayName("seperateCharacters(string)")
	@Nested
	class seperateCharacters {
		@Test
		void testStringUtilsSeperateCharactersNonNull() {
			assertIterableEquals(Arrays.asList('a','b','c','c'), StringUtils.seperateCharacters("abcc"));
		}
		
		@Test
		void testStringUtilsSeperateCharactersNull() {
			assertNull(StringUtils.seperateCharacters(null));
		}
		
		@Test
		void testStringUtilsSeperateCharactersEmptyString() {
			assertIterableEquals(new ArrayList<Character>(), StringUtils.seperateCharacters(""));
		}
	}
}
