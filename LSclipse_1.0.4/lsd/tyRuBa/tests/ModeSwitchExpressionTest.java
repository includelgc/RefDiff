package tyRuBa.tests;

import tyRuBa.modes.TypeModeError;
import tyRuBa.parser.ParseException;

public class ModeSwitchExpressionTest extends TyrubaTest {

	public ModeSwitchExpressionTest(String arg0) {
		super(arg0);
	}
	
	public void setUp() throws Exception {
		super.setUp();
	}

	public void testWithoutDefault() throws ParseException, TypeModeError {
		frontend.parse("foo :: =Integer, =Integer\n" +
		frontend.parse("foo(?x,?y) :- BOUND ?x : sum(?x,1,?y)" +
		
		test_must_equal("foo(1,?y)", "?y", "2");
		test_must_equal("foo(?x,1)", "?x", "2");
	}
	
	public void testWithDefault() throws ParseException, TypeModeError {
		frontend.parse("foo :: =Integer, =Integer\n" +
		frontend.parse("foo(?x,?y) :- BOUND ?x : sum(?x,1,?y)" +
		
		test_must_equal("foo(1,?y)", "?y", "2");
		test_must_equal("foo(?x,1)", "?x", "2");
	}

}