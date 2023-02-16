
public class PatternProgram {

	public static void main(String[] args) {
		int n = 5;
		// pattern001(n); //-Right triangle star pattern
		// pattern002(n); //- Pyramid star pattern
		// pattern003(n); //- Left triangle star pattern
		// pattern004(n); //- Downward triangle star pattern
		// pattern005(n); //-right down mirror star pattern
		// pattern006(n); //- reverse pyramid star pattern
		// pattern007(n); //- diamond shape pattern
		// pattern008(n); //-right pascal's triangle
		// pattern009(n); //-left pascal's triangle
		// pattern010(n); //- Sandglass star pattern
		pattern011(n); // - right triangle holo star pattern
	}

	public static void pattern001(int n) {
		int i, j;
		for (i = 0; i <= n; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern002(int n) {
		int i, j, k;
		for (i = 0; i <= n; i++) {
			for (k = 1; k <= n - i; k++) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void pattern003(int n) {
		int i, j, k;
		for (i = 0; i <= n; i++) {
			for (k = 1; k <= n - i; k++) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void pattern004(int n) {
		int i, j;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= (n + 1) - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void pattern005(int n) {
		int i, j, k;
		for (i = 0; i <= n; i++) {
			for (k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			for (j = 1; j <= (n + 1) - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void pattern006(int n) {
		int i, j, k;
		for (i = 0; i <= n; i++) {
			for (k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			for (j = 1; j <= (n + 1) - i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

	public static void pattern007(int n) {
		int i, j, k;
		for (i = 0; i <= n; i++) {
			for (k = 1; k <= (n + 1) - i; k++) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (i = 1; i <= n; i++) {
			for (k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			for (j = 1; j <= (n + 1) - i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

	public static void pattern008(int n) {
		int i, j;
		for (i = 0; i <= n; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= (n + 1) - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern009(int n) {
		int i, j, k;
		for (i = 0; i <= n; i++) {
			for (k = 1; k <= n - i; k++) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 1; i <= n; i++) {
			for (k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			for (j = 1; j <= (n + 1) - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void pattern010(int n) {
		int i, j, k;
		for (i = 0; i <= n; i++) {
			for (k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			for (j = 1; j <= (n + 1) - i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for (i = 0; i <= n; i++) {
			for (k = 1; k <= (n + 1) - i; k++) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void pattern011(int n) {
		int i, j;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				if (i == 1 || j == 1 || j == i || i == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
