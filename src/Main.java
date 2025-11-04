public class Main {

    public static void main(String[] args) {
        printCodebaseUsage();
    }
    private static void printCodebaseUsage() {
        System.out.println("========================================");
        System.out.println("             CODEBASE USAGE             ");
        System.out.println("========================================\n");

        System.out.println("General Build Commands:");
        System.out.println("  ant init");
        System.out.println("      - Prepares required folders (bin, doc, dist)\n");

        System.out.println("  ant clean");
        System.out.println("      - Removes generated folders and resets the workspace\n");

        System.out.println("  ant compile");
        System.out.println("      - Compiles the entire project into /bin\n");

        System.out.println("  ant run");
        System.out.println("      - Runs the project’s designated main class\n");

        System.out.println("  ant jar");
        System.out.println("      - Creates project JAR files (classes.jar and/or docs.jar)\n");

        System.out.println("----------------------------------------");
        System.out.println(" Compile / Run Specific Files");
        System.out.println("----------------------------------------");

        System.out.println("  ant compile-specific -Dfile=<path/to/File.java>");
        System.out.println("      - Compiles a single Java source file\n");

        System.out.println("  ant run-specific -Dmain=<fully.qualified.ClassName>");
        System.out.println("      - Runs a specific Java class containing a main method\n");

        System.out.println("----------------------------------------");
        System.out.println(" Documentation");
        System.out.println("----------------------------------------");

        System.out.println("  ant docs");
        System.out.println("      - Generates JavaDoc into the /doc directory\n");

        System.out.println("----------------------------------------");
        System.out.println(" JAR File Creation");
        System.out.println("----------------------------------------");

        System.out.println("  ant jar-class");
        System.out.println("      - Packages compiled classes into dist/classes.jar\n");

        System.out.println("  ant jar-doc");
        System.out.println("      - Packages JavaDoc into dist/docs.jar\n");

        System.out.println("  ant jar-all");
        System.out.println("      - Generates both classes and documentation JARs\n");

        System.out.println("----------------------------------------");
        System.out.println(" Utility");
        System.out.println("----------------------------------------");

        System.out.println("  ant menu");
        System.out.println("      - Displays this command menu\n");

        System.out.println("  ant help");
        System.out.println("      - Lists available Ant targets (if defined)\n");

        System.out.println("========================================");
        System.out.println("        END OF CODEBASE COMMANDS        ");
        System.out.println("========================================\n");
    }
}
